package com.nt.runner;

import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.Doucement.Medal;
import com.nt.Doucement.Player;
import com.nt.Doucement.Sport;
import com.nt.service.ISportMgmtService;
@Component
public class OneToManyAssociationMappingTestRunner implements CommandLineRunner {
	@Autowired
	private ISportMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			//child class obj1
			Sport sports1 = new Sport(new Random().nextInt(1000),"banmottion",new String[] {"rocket","socket","net"});
			Sport sports2 = new Sport(new Random().nextInt(1000),"banmottion",new String[] {"rocket","socket","net"});
			//child class obj2
			Medal medal1 = new Medal("Bharatha-gold","gold","tokiya-gold","tokyo");
			Medal medal2 = new Medal("Japan-gold","silver","cwg-japan","tokyo");
					//parent class object
			Player player = new Player(new Random().nextInt(1000),"P.V.Sindhu","hyd",Set.of(sports1,sports2),Map.of("medal1",medal1,"medal2",medal2));
			//invoke  the Method
		System.out.println(service.registerPlayWithSportsAndMedals(player));
		}// try
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("=============findAll() operation===================");
					// access child 1 obj
		service.fecthPlayerInfo().forEach(per->{
			System.out.println("parent::"+per);
			// access child 2 obj
			Set<Sport> sports = per.getSports();
			sports.forEach(sport->{
				System.out.println("child1::"+sport);
			});
// access child obj2
			Map<String, Medal> medals = per.getMedals();
			medals.forEach((type,medal)->{
				System.out.println("child2::"+type+"......"+medal);
			});
		});		
		}
}
