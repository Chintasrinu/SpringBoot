package com.nt.Service;

import java.util.List;

import com.nt.entity.JobSeekerInfo;

public interface IJobSeekerMgmtService {
	
	public String registerJobSeeker(JobSeekerInfo info);
	
	public List<JobSeekerInfo> fetchAllJobSeekers();
	
	public String fecthResumePathById(Integer jsId);
	public String fecthPhotoPathById(Integer jsId);

}
