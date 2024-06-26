package com.nt.Runner;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;

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
	System.out.println("========================");
	try {
		//Logic to retrive the object
		PersonInfo info = service.fetchPersonDetailsById(2);
		if(info!=null) {
			System.out.println(info.getPid()+" "+info.getPname()+" "+info.getDob());
			byte[] photoContent = info.getPhoto()	;
			OutputStream os = new FileOutputStream("retrive_photo.jpg");
			os.write(photoContent);
			os.flush();
			os.close();
			System.out.println("Photo retrieved from db table col");
			char[] resumeContent = info.getResume();
			Writer writer = new FileWriter("retrive_resume.txt");
			writer.write(resumeContent);
			writer.flush();
			writer.close();
			System.out.println("resource retrived from db table cal");
					}// if
		else {
			System.out.println("record not found");
		}
			
	} // try
		catch(Exception e) {
			e.printStackTrace();
		}
}	
}