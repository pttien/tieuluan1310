/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tieuluan.struts2.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;

/**
 * The Class FileUtility.
 * 
 * @author dinhthaiha
 */
public class FileUtil {

	public static final String _SEPARATOR = "/";
    /**
     * Save buffered image to png file.
     * 
     * @param image
     *            the image
     * @param fileName
     *            the file name
     */
    public static void saveBufferedImageToPNGFile(BufferedImage image,
            String fileName) {
        File output = new File(fileName);
        if (!isFolderExist(getOnlyPathName(fileName))) {
            createDirectory(getOnlyPathName(fileName));
        }
        try {
            ImageIO.write(image, "png", output);
        } catch (IOException ex) {
            Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    /**
     * Save buffered image to gif file.
     * 
     * @param image
     *            the image
     * @param fileName
     *            the file name
     */
    public static void saveBufferedImageToGIFFile(BufferedImage image,
            String fileName) {
        File output = new File(fileName);
        try {
            ImageIO.write(image, "gif", output);
        } catch (IOException ex) {
            Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    /**
     * Save buffered image to jpeg file.
     * 
     * @param image
     *            the image
     * @param fileName
     *            the file name
     */
    public static void saveBufferedImageToJPEGFile(BufferedImage image,
            String fileName) {
        File output = new File(fileName);
        try {
            ImageIO.write(image, "jpeg", output);
        } catch (IOException ex) {
            Logger.getLogger(FileUtil.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    /**
     * Checks if is file exist.
     * 
     * @param fileName
     *            the file name
     * @return true, if is file exist
     */
    public static boolean isFileExist(String fileName) {
        File f = new File(fileName);
        return f.exists();
    }

    // get only path include last /
    /**
     * Gets the only path name.
     * 
     * @param path
     *            the path
     * @return the only path name
     */
    public static String getOnlyPathName(String path) {
        int l = Math.max(path.lastIndexOf("\\"), path.lastIndexOf("/") + 1);

        // String path
        return path.substring(0, l);
    }

    /**
     * Checks if is folder exist.
     * 
     * @param folderName
     *            the folder name
     * @return true, if is folder exist
     */
    public static boolean isFolderExist(String folderName) {
        File f = new File(folderName);
        if (f.exists()) {
            return true;
        } else {
            return false;
        }
    }

    // create Directory
    // return true if create successfully else return false

    /**
     * Creates the directory.
     * 
     * @param directoryName
     *            the directory name
     * @return true, if successful
     */
    public static boolean createDirectory(String directoryName) {

        // Create a directory; 
        File folder = new File(directoryName);
        boolean success = folder.mkdir();
        if (!success) {
            // Create directory and all ancestor directories
            success = folder.mkdirs();
        }
        return success;
    }

    /**
     * Delete file.
     * 
     * @param fileName
     *            the file name
     * @return true, if successful
     */
    public static boolean deleteFile(String fileName) {
        File f = new File(fileName);
        return f.delete();

    }

    /**
     * Copy file.
     * 
     * @param fromFileName
     *            the from file name
     * @param toFileName
     *            the to file name
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static void copyFile(String fromFileName, String toFileName)
            throws IOException {
        File fromFile = new File(fromFileName);
        File toFile = new File(toFileName);

        if (!fromFile.exists()) {
            throw new IOException("FileCopy: " + "no such source file: "
                    + fromFileName);
        }
        if (!fromFile.isFile()) {
            throw new IOException("FileCopy: " + "can't copy directory: "
                    + fromFileName);
        }
        if (!fromFile.canRead()) {
            throw new IOException("FileCopy: " + "source file is unreadable: "
                    + fromFileName);
        }
        if (toFile.isDirectory()) {
            toFile = new File(toFile, fromFile.getName());
        }
        if (toFile.exists()) {
            if (!toFile.canWrite()) {
                throw new IOException("FileCopy: "
                        + "destination file is unwriteable: " + toFileName);
            }
            return;
        } else {
            String parent = toFile.getParent();
            if (parent == null) {
                parent = System.getProperty("user.dir");
            }
            File dir = new File(parent);
            if (!dir.exists()) {
                throw new IOException("FileCopy: "
                        + "destination directory doesn't exist: " + parent);
            }
            if (dir.isFile()) {
                throw new IOException("FileCopy: "
                        + "destination is not a directory: " + parent);
            }
            if (!dir.canWrite()) {
                throw new IOException("FileCopy: "
                        + "destination directory is unwriteable: " + parent);
            }
        }

        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(fromFile);
            to = new FileOutputStream(toFile);
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = from.read(buffer)) != -1) {
                to.write(buffer, 0, bytesRead); // write

            }
        } finally {
            if (from != null) {
                try {
                    from.close();
                } catch (IOException e) {
                    ;
                }
            }
            if (to != null) {
                try {
                    to.close();
                } catch (IOException e) {
                    ;
                }
            }
        }
    }

    /**
     * Save file.
     * 
     * @param file
     *            the file
     * @param fileName
     *            the file name
     * @throws Exception
     *             the exception
     */
    public static void saveFile(File file, String fileName) throws Exception {
        try {

            File theFile = new File(fileName);

            FileUtils.copyFile(file, theFile);

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    /**
     * Creates the file from data.
     * 
     * @param filename
     *            the filename
     * @param data
     *            the data
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static void createFileFromData(String filename, byte[] data)
            throws IOException {
        FileOutputStream fout = new FileOutputStream(filename);
        fout.write(data);
        fout.close();
    }

    /**
     * Gets the file name from path.
     * 
     * @param path
     *            the path
     * @return the file name from path
     */
    public static String getFileNameFromPath(String path) {

        String filename = path.substring(path.lastIndexOf("/") + 1);
        return filename;
    }

    /*
     * Add number to filename when this file is existed
     */
    /**
     * Gets the non exist file name.
     * 
     * @param rootPath
     *            the root path
     * @param fileName
     *            the file name
     * @return the non exist file name
     */
    public static String getNonExistFileName(String rootPath, String fileName) {
        int j = 0;
        String tmpFileName = fileName;
        String onlyName =
                tmpFileName.substring(0, tmpFileName.lastIndexOf("."));
        String ext =
                tmpFileName.substring(tmpFileName.lastIndexOf("."), tmpFileName
                        .length());
        if (!isFileExist(rootPath + tmpFileName)) {
            return tmpFileName;
        }
        do {
            tmpFileName = onlyName + "(" + String.valueOf(j) + ")" + ext;
            j++;
        } while (isFileExist(rootPath + tmpFileName));
        return tmpFileName;
    }
    
    public static String getFileExtension(String filename) {
        if (!StringUtil.isNullOrEmpty(filename)) {
            int index = filename.lastIndexOf(".");
            if (index != -1) {
                return filename.substring(index).toLowerCase();
            }
        }
        return StringUtil.EMPTY;
    }
    
    
}
