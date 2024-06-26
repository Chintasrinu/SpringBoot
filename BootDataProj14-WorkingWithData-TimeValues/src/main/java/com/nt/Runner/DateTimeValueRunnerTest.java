package com.nt.Runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.PersonInfo;
import com.nt.service.IPersonInfoMgmtService;
@Component
public class DateTimeValueRunnerTest implements CommandLineRunner {
	@Autowired
	private IPersonInfoMgmtService service ;
	@Override
	public void run(String... args) throws Exception {
		PersonInfo info = new PersonInfo();
		info.setPname("KalaBhyravaswaminamaha"); 
		info.setPage(23.f);
		info.setDob(LocalDate.of(1898, 05, 06));
		info.setTob(LocalTime.of(05, 05)); 
		info.setDoj(LocalDateTime.of(2011,10, 05, 10, 05, 05));
		System.out.println(service.registerPerson(info));
		System.out.println("==================");
	service.fetchAllPersonDetails().forEach(System.out::println);
	}
}	