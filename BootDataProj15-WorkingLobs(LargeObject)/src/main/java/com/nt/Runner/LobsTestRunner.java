package com.nt.Runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PersonInfo;
import com.nt.service.IPersonInfoMgmtService;
@Component
public class LobsTestRunner implements CommandLineRunner {
	@Autowired
	private IPersonInfoMgmtService service ;
	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name::");
		String name = sc.next();
		//-------------------
		System.out.println("Is Married::?");
		boolean married = sc.nextBoolean();
		//------------------------------
		System.out.println("Enter PhotoPath::");
		String photoPath = sc.next();
		System.out.println(photoPath);
		
		System.out.println("Enter resume path::");
		String resumePath = sc.next();
		System.out.println(resumePath);
		// create byte[]  representing photo file content
		InputStream is = new FileInputStream(photoPath);
		byte[] PhotoContent = new byte[is.available()];
		PhotoContent = is.readAllBytes();
		
		// Create char[] representing resume file content
		Reader reader = new FileReader(resumePath);
		File file = new File(resumePath);
		char[] resumeContent = new char[(int)file.length()];
		reader.read(resumeContent);
		
		// Prepare with Entity with object
		PersonInfo info = new PersonInfo(-1, name , LocalDateTime.of(1998,05,06, 07,07), married, PhotoContent, resumeContent);
		try {
			System.out.println(service.registerPerson(info));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
}	
}