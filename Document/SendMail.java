package mycity.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import org.apache.struts2.ServletActionContext;

import com.viettel.core.common.utils.FileUtil;
import com.viettel.core.common.utils.LogUtility;
import com.viettel.core.entities.vo.MailContent;

import freemarker.cache.FileTemplateLoader;
import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;


public class SendMail {

	public static void sendMail(String mail,MailContent mailContent) throws Exception {

		Properties props = new Properties();
//		try {
//			props.load(new FileInputStream(new File("settings.properties")));
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}

		
		  props.put("mail.smtp.host", "smtp.gmail.com");
		  props.put("mail.smtp.socketFactory.port", "465");
		  props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory"); 
		  props.put("mail.smtp.auth","true"); 
		  props.put("mail.smtp.port", "465");
		 

		Session session = Session.getDefaultInstance(props,
				new Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(
								"viettelmycity@gmail.com", "mycity@123");
					}
				});

		try {
			String a=mail;
			String b=mailContent.getTopp();
			String c=mailContent.getBody1();
			String d=mailContent.getBody2();
			Message message = new MimeMessage(session);
//			MimeUtility.encodeText(subject, "utf-8", "B")
			message.setFrom(new InternetAddress("viettelmycity@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(mail));
			message.setSubject(MimeUtility.encodeText(mailContent.getSubJect(), "utf-8", "B"));

			BodyPart body = new MimeBodyPart();
			// freemarker stuff.
			Configuration cfg = new Configuration();
			FileTemplateLoader ftl1 = new FileTemplateLoader(new File(ServletActionContext.getServletContext().getRealPath("/")));
			cfg.setClassForTemplateLoading(cfg.getClass(), "/");
			cfg.setTemplateLoader(ftl1);
			Template template= null;
			template = cfg.getTemplate("resources/mycity_cms/templates/mail/html-mail-template.html","UTF-8");			
			
			
			Map<String, String> rootMap = new HashMap<String, String>();
			rootMap.put("to",mailContent.getTopp());
			rootMap.put("body1", mailContent.getBody1());
			rootMap.put("body2", mailContent.getBody2());
			Writer out = new StringWriter();
			template.process(rootMap, out);
			// freemarker stuff ends.

			/* you can add html tags in your text to decorate it. */
//			body.setContent(out.toString(),	"text/html");
			body.setContent(out.toString(), "text/html; charset=UTF-8");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(body);
//cfg
//			body = new MimeBodyPart();
//
//			String filename = "hello.txt";
//			DataSource source = new FileDataSource(filename);
//			body.setDataHandler(new DataHandler(source));
//			body.setFileName(filename);
//			multipart.addBodyPart(body);
//
			message.setContent(multipart, "text/html; charset=UTF-8;");
//
			Transport.send(message);

		} catch (MessagingException e) {
			LogUtility.logError(e, e.getMessage());
		}

		System.out.println("Done....");
	}
	public static void main(String[] args) throws Exception {
//		sendMail("viettelmycity@gmail.com");
	}
}
