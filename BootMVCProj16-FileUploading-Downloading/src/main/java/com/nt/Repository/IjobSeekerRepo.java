package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.JobSeekerInfo;

public interface IjobSeekerRepo extends JpaRepository<JobSeekerInfo, Integer> {

}
