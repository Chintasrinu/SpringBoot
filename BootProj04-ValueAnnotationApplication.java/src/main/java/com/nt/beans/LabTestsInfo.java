package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("linfo")
public class LabTestsInfo {
	
	@Value("${lab.bpPrice}")
	private float bloodProfilePrice;
	
	@Value("${lab.rtpcrPrice}")
	private float rtpcrPrice;
	
	@Value("${lab.echo2DPrice}")
	private float echo2DPrice;

	@Override
	public String toString() {
		return "LabTestInfo [bloodProfilePrice=" + bloodProfilePrice + ", rtpcrPrice=" + rtpcrPrice + ", echo2DPrice="
				+ echo2DPrice + "]";
	}
	
}


