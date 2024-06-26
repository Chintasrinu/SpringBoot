package com.nt.Service;

import com.nt.Repository.IjobSeekerRepo;
import com.nt.entity.JobSeekerInfo;

public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	
	private IjobSeekerRepo repo;

	@Override
	public String registerJobSeeker(JobSeekerInfo info) {
		return "job seeker is saved with::"+repo.save(info).getJsId()+"id value";
	}
}
