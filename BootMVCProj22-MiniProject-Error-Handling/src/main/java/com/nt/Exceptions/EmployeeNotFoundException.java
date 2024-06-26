package com.nt.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_GATEWAY)  // 502 error
@Component
public class EmployeeNotFoundException extends RuntimeException {
	
	public EmployeeNotFoundException() {
		super();
	}
	public EmployeeNotFoundException(String msg) {
		super(msg);
	}

}
