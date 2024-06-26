package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Doucement.Player;
import com.nt.repo.IMedalRepo;
import com.nt.repo.IPlayerRepo;
import com.nt.repo.ISportRepo;
@Service("Sportsmgmt")
public class SportsMgmtServiceImpl implements ISportMgmtService {
	@Autowired
	private IPlayerRepo playerRepo;
	@Autowired
	private ISportRepo sportsRepo;
	@Autowired
	private  IMedalRepo medalRepo;

	@Override
	public String registerPlayWithSportsAndMedals(Player player) {
		return "Player with Sports and medal info is saved with"+playerRepo.save(player).getPid()+"id value";
	}

	@Override
	public List<Player> fecthPlayerInfo() {
		return playerRepo.findAll();

	}

	
}
