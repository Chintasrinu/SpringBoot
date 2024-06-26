package com.nt.Interceptor;

import java.time.LocalDateTime;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class TimeCheckInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
	System.out.println("TimeCheckInterceptor.preHandle()");
	// get system date and time
	LocalDateTime ldt = LocalDateTime.now();
	// get current hour of the day
	int hour = ldt.getHour();
	if(hour<12||hour>17) {
		RequestDispatcher rd = req.getRequestDispatcher("/timeout.jsp");
		rd.forward(req, res);
		return false;
	}
	return true;
	}
}
