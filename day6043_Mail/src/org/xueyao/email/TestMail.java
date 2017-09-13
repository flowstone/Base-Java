package org.xueyao.email;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class TestMail {
	static String msgText = "今天天气真真好";

	public static void main(String[] args) {
		

		String to = "test02@flowstone.com"; //接收方
		String from = "admin@flowstone.com"; //发送方
		String host = "localhost"; //主机地址
		boolean debug = true; //是否开启debug模式

		// create some properties and get the default Session
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		if (debug)
			props.put("mail.debug", debug);

		Session session = Session.getInstance(props, null);
		session.setDebug(debug);

		try {
			// create a message
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(from));
			InternetAddress[] address = { new InternetAddress(to) };
			msg.setRecipients(Message.RecipientType.TO, address);
			msg.setSubject("JavaMail APIs 测试");
			msg.setSentDate(new Date());
			// If the desired charset is known, you can use
			// setText(text, charset)
			msg.setText(msgText);

			Transport.send(msg);
		} catch (Exception mex) {
			mex.printStackTrace();
		}
	}

	private static void usage() {
		System.out.println("usage: java msgsendsample <to> <from> <smtp> true|false");
	}
}
