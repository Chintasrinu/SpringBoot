package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repository.IjobSeekerRepo;
import com.nt.entity.JobSeekerInfo;
@Service
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	@Autowired
	private IjobSeekerRepo repo;

	@Override
	public String registerJobSeeker(JobSeekerInfo info) {
		return "job seeker is saved with::"+repo.save(info).getJsId()+"id value";
	}

	@Override
	public List<JobSeekerInfo> fetchAllJobSeekers() {
		return repo.findAll();
	}

	@Override
	public String fecthResumePathById(Integer jsId) {
		return repo.getResumePathByJsId(jsId);
	}

	@Override
	public String fecthPhotoPathById(Integer jsId) {
		return repo.getPhotoPathByJsId(jsId);
	}
}
