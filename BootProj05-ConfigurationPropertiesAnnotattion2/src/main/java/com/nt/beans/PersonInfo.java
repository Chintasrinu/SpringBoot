package com.nt.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component("pInfo")
@ConfigurationProperties(prefix = "per.info")
public class PersonInfo {
	// simple / wrapper type
	private Integer pid;
	private String pname;
	
	// array type
	private String[] favColor;
	
	// List-Collection type
	private List<String> studies;
	
	//set-Collection type
	private Set<Long> PhoneNumber;
	
	//map-Collection type
	private Map<String, Object> idDetils;
	
	// Has-A properties(Composition)
	private JobDetails jobInfo;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String[] getFavColor() {
		return favColor;
	}

	public void setFavColor(String[] favColor) {
		this.favColor = favColor;
	}

	public List<String> getStudies() {
		return studies;
	}

	public void setStudies(List<String> studies) {
		this.studies = studies;
	}

	public Set<Long> getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(Set<Long> phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public Map<String, Object> getIdDetils() {
		return idDetils;
	}

	public void setIdDetils(Map<String, Object> idDetils) {
		this.idDetils = idDetils;
	}

	public JobDetails getJobInfo() {
		return jobInfo;
	}

	public void setJobInfo(JobDetails jobInfo) {
		this.jobInfo = jobInfo;
	}

	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", favColor=" + Arrays.toString(favColor) + ", studies="
				+ studies + ", PhoneNumber=" + PhoneNumber + ", idDetils=" + idDetils + ", jobInfo=" + jobInfo + "]";
	}

}
