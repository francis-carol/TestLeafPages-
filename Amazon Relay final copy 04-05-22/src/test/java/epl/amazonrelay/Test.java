//package epl.amazonrelay;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.SimpleDateFormat;
//
//import org.apache.commons.io.FileUtils;
//import org.apache.commons.mail.EmailAttachment;
//import org.apache.commons.mail.EmailException;
//import org.apache.commons.mail.MultiPartEmail;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//public class Test extends Amazon_Relay_BassClass {
//
//	static String s = "Hi team,";
//	static String s2 = "Thanks,";
//	static String s3 = "Amazon Relay Wowtruck";
//
//	public static void main(String[] args) throws IOException, EmailException {
//		launchBrowser("head");
//		launchUrl("https://www.facebook.com/");
//		// System.out.println(s + "\n" + "\n" + "errormessage" + "\n" + "\n" + s2 + "\n"
//		// + s3);
//		String trNum = "FGH123";
//		tk = (TakesScreenshot) driver;
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm");
//		java.sql.Timestamp timestamp = new java.sql.Timestamp(System.currentTimeMillis());
//		String FileDate = sdf.format(timestamp).toString() + ".png";
//		System.out.println("FileName : " + FileDate);
//
//		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
//		File perm = new File(".//AmazonRelayBooking/" + trNum + "_" + FileDate);
//		System.out.println("File Path : " + perm.toString());
//		try {
//			FileUtils.copyFile(screenshotAs, perm);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		// Create the attachment
//		EmailAttachment attachment = new EmailAttachment();
//		attachment.setPath("mypictures/john.jpg");
//		attachment.setDisposition(EmailAttachment.ATTACHMENT);
//		attachment.setDescription("Picture of John");
//		attachment.setName("John");
//
//		// Create the email message
//		MultiPartEmail email = new MultiPartEmail();
//		email.setHostName("mail.myserver.com");
//		email.addTo("jdoe@somewhere.org", "John Doe");
//		email.setFrom("me@apache.org", "Me");
//		email.setSubject("The picture");
//		email.setMsg("Here is the picture you wanted");
//
//		// add the attachment
//		email.attach(attachment);
//
//		// send the email
//		email.send();
//		// Files.walk(Paths.get(perm.toString())).filter(Files::isRegularFile).forEach(System.out::println);
//	}
//
//}
