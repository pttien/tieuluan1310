package com.tieuluan.struts2.utils;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

import sun.misc.BASE64Encoder;

/**
 * The Class EncryptionUtils.
 */
public class EncryptionUtils {

	/** The Constant KEY_STRING. */
	private static final String KEY_STRING = "193-155-248-97-234-56-100-241";

	private static final String SHA_256 = "SHA-256";

	/**
	 * Encrypt.
	 * 
	 * @param source
	 *            the source
	 * @return the string
	 */
	public static String encrypt(String source) {
		try {
			// Get our secret key
			Key key = getKey();

			// Create the cipher
			Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

			// Initialize the cipher for encryption
			desCipher.init(Cipher.ENCRYPT_MODE, key);

			// Our cleartext as bytes
			byte[] cleartext = source.getBytes();

			// Encrypt the cleartext
			byte[] ciphertext = desCipher.doFinal(cleartext);

			// Return a String representation of the cipher text
			return getString(ciphertext);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Encrypt.
	 * 
	 * @param source
	 *            the source
	 * @return the string
	 */
	public static String encrypt(String source, Key key) {
		try {
			// Create the cipher
			Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

			// Initialize the cipher for encryption
			desCipher.init(Cipher.ENCRYPT_MODE, key);

			// Our cleartext as bytes
			byte[] cleartext = source.getBytes();

			// Encrypt the cleartext
			byte[] ciphertext = desCipher.doFinal(cleartext);

			// Return a String representation of the cipher text
			return getString(ciphertext);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Encrypt.
	 * 
	 * @param source
	 *            the source
	 * @return the string
	 */
	public static String encrypt(String source, String keyString) {
		Key key = getKey(keyString);
		return encrypt(source, key);
	}

	/**
	 * Generate key.
	 * 
	 * @return the string
	 */
	public static String generateKey() {
		try {
			KeyGenerator keygen = KeyGenerator.getInstance("DES");
			SecretKey desKey = keygen.generateKey();
			byte[] bytes = desKey.getEncoded();
			return getString(bytes);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Decrypt.
	 * 
	 * @param source
	 *            the source
	 * @return the string
	 */
	public static String decrypt(String source) {
		try {
			// Get our secret key
			Key key = getKey();

			// Create the cipher
			Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

			// Encrypt the cleartext
			byte[] ciphertext = getBytes(source);

			// Initialize the same cipher for decryption
			desCipher.init(Cipher.DECRYPT_MODE, key);

			// Decrypt the ciphertext
			byte[] cleartext = desCipher.doFinal(ciphertext);

			// Return the clear text
			return new String(cleartext);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Decrypt.
	 * 
	 * @param source
	 *            the source
	 * @return the string
	 */
	public static String decrypt(String source, Key key) {
		try {

			// Create the cipher
			Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

			// Encrypt the cleartext
			byte[] ciphertext = getBytes(source);

			// Initialize the same cipher for decryption
			desCipher.init(Cipher.DECRYPT_MODE, key);

			// Decrypt the ciphertext
			byte[] cleartext = desCipher.doFinal(ciphertext);

			// Return the clear text
			return new String(cleartext);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static Key getKey(String keyString) {
		try {
			byte[] bytes = getBytes(keyString);
			DESKeySpec pass = new DESKeySpec(bytes);
			SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
			SecretKey s = skf.generateSecret(pass);
			return s;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Gets the key.
	 * 
	 * @return the key
	 */
	private static Key getKey() {
		return getKey(KEY_STRING);
	}

	/**
	 * Returns true if the specified text is encrypted, false otherwise.
	 * 
	 * @param text
	 *            the text
	 * @return true, if is encrypted
	 */
	public static boolean isEncrypted(String text) {
		// If the string does not have any separators then it is not
		// encrypted
		if (text.indexOf('-') == -1) {
			// /System.out.println( "text is not encrypted: no dashes" );
			return false;
		}

		StringTokenizer st = new StringTokenizer(text, "-", false);
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if (token.length() > 3) {
				// System.out.println(
				// "text is not encrypted: length of token greater than 3: " +
				// token );
				return false;
			}
			for (int i = 0; i < token.length(); i++) {
				if (!Character.isDigit(token.charAt(i))) {
					// System.out.println(
					// "text is not encrypted: token is not a digit" );
					return false;
				}
			}
		}
		// System.out.println( "text is encrypted" );
		return true;
	}

	/**
	 * Gets the string.
	 * 
	 * @param bytes
	 *            the bytes
	 * @return the string
	 */
	private static String getString(byte[] bytes) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			byte b = bytes[i];
			sb.append((int) (0x00FF & b));
			if (i + 1 < bytes.length) {
				sb.append("-");
			}
		}
		return sb.toString();
	}

	/**
	 * Gets the bytes.
	 * 
	 * @param str
	 *            the str
	 * @return the bytes
	 */
	private static byte[] getBytes(String str) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		StringTokenizer st = new StringTokenizer(str, "-", false);
		while (st.hasMoreTokens()) {
			int i = Integer.parseInt(st.nextToken());
			bos.write((byte) i);
		}
		return bos.toByteArray();
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		System.out.println(encrypt("mycity", getKey()));
		System.out.println(encrypt("mycity@2013", getKey()));
	}

	/**
	 * s Show providers.
	 */
	public static void showProviders() {
		try {
			Provider[] providers = Security.getProviders();
			for (int i = 0; i < providers.length; i++) {
				System.out.println("Provider: " + providers[i].getName() + ", "
						+ providers[i].getInfo());
				for (Iterator<Object> itr = providers[i].keySet().iterator(); itr
						.hasNext();) {
					String key = (String) itr.next();
					String value = (String) providers[i].get(key);
					System.out.println("\t" + key + " = " + value);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getSHA2Hash(String input)
			throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance(SHA_256);
		md.update(input.getBytes());
		byte tokenBytes[] = md.digest();
		// convert token byte to token string in hex format
		StringBuffer tokenBuf = new StringBuffer();
		for (int i = 0; i < tokenBytes.length; i++) {
			tokenBuf.append(Integer
					.toString((tokenBytes[i] & 0xff) + 0x100, 16).substring(1));
		}
		return tokenBuf.toString();
	}

	public static String decryptAuthData(String authData, String key,
			String salt, int iterationCount) throws NoSuchAlgorithmException,
			InvalidKeySpecException, NoSuchPaddingException,
			InvalidAlgorithmParameterException, InvalidKeyException,
			BadPaddingException, IllegalBlockSizeException {
		String algorithm = "PBEWithMD5AndDES";
		byte[] saltByte = salt.getBytes();
		KeySpec keySpec = new PBEKeySpec(key.toCharArray());
		SecretKey keyData = SecretKeyFactory.getInstance(algorithm)
				.generateSecret(keySpec);
		AlgorithmParameterSpec paramSpec = new PBEParameterSpec(saltByte,
				iterationCount);
		// convert authdata in hex format to bytes
		int len = authData.length();
		byte[] authBytes = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			authBytes[i / 2] = (byte) ((Character.digit(authData.charAt(i), 16) << 4) + Character
					.digit(authData.charAt(i + 1), 16));
		}
		// decrypt authbytes to token
		Cipher decryptor = Cipher.getInstance(algorithm);
		decryptor.init(Cipher.DECRYPT_MODE, keyData, paramSpec);
		byte[] tokenBytes = null;
		tokenBytes = decryptor.doFinal(authBytes);
		return new String(tokenBytes);
	}

	public static String encryptAuthData(String token, String key, String salt,
			int iterationCount) throws NoSuchAlgorithmException,
			InvalidKeySpecException, NoSuchPaddingException,
			InvalidAlgorithmParameterException, InvalidKeyException,
			BadPaddingException, IllegalBlockSizeException {
		String algorithm = "PBEWithMD5AndDES";
		byte[] saltByte = salt.getBytes();
		KeySpec keySpec = new PBEKeySpec(key.toCharArray());
		SecretKey keyData = SecretKeyFactory.getInstance(algorithm)
				.generateSecret(keySpec);
		AlgorithmParameterSpec paramSpec = new PBEParameterSpec(saltByte,
				iterationCount);
		Cipher encryptor = Cipher.getInstance(algorithm);
		encryptor.init(Cipher.ENCRYPT_MODE, keyData, paramSpec);
		byte[] rawBytes = encryptor.doFinal(token.getBytes());
		// convert raw byte to raw string in hex format
		StringBuffer rawBuf = new StringBuffer();
		for (int i = 0; i < rawBytes.length; i++) {
			rawBuf.append(Integer.toString((rawBytes[i] & 0xff) + 0x100, 16)
					.substring(1));
		}
		return rawBuf.toString();
	}
	public static  String encryptPassword(String plaintext,String salt) throws Exception {
        MessageDigest md = null;
        String hash = null;
        try {
        	if(salt != null) {
        		plaintext = salt.trim() + plaintext;
			}
            md = MessageDigest.getInstance("SHA-1"); //step 2
            md.update(plaintext.getBytes("UTF-8")); //step 3
            byte raw[] = md.digest(); //step 4
            hash = (new BASE64Encoder()).encode(raw); //step 5
        } catch (NoSuchAlgorithmException e) {
           e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
        	e.printStackTrace();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return hash; //step 6
    }
}