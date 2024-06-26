package com.nt.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service("purchese")
public class purchaseOrderIml implements IPurchaseOrder {
	
	@Autowired
	private JavaMailSender sender;
	@Value("${spring.mail.username")
	private String fromEmail;

	@Override
	public String purchase(String[] items, double[] prices, String[] toEmails) throws Exception {
		// calculate the bill amout
		double billAmt=0;
		for(double p:prices)
			billAmt=billAmt+p;
		String msg =Arrays.toString(items)+"with prices"+Arrays.toString(prices)+"are purchsed eith BillAmout"+billAmt;
		// send mail
	String status = sendMail(msg,toEmails);
		return msg+"--->"+status;
	}
	private String sendMail(String msg, String[] toEmails) throws Exception {
		MimeMessage mesage = sender.createMimeMessage();   // empty email message
		MimeMessageHelper helper = new MimeMessageHelper(mesage, true);
		helper.setFrom(fromEmail);
		helper.setCc(toEmails);
		helper.setSubject("open it know it");
		helper.setSentDate(new Date());
		helper.setText(msg);
		//helper.setA("nit.jpg", new ClassPathResource("nit.jpg"));
		sender.send(mesage);
		return "mail sent";
	}
	}


