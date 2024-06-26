package com.nt.test;

import com.nt.service.Arithmetic;

import com.nt.service.Arithmetic;

public class LAMDATest {

	public static void main(String[] args) {
		// step: 1
//		Arithmetic ar = (int  a , int b)->{
//			int c = a+b;
//			return c;
//		};
		
		// step: 2
//		Arithmetic ar = (int  a , int b)->{
//		return a+b;
//	};
		
		// step: 3
//		Arithmetic ar = (int  a , int b)->a+b;
		
		//step: 4
		///Arithmetic ar = ( a , b)->a+b;
		
		Arithmetic ar = (x , y)-> x+y;
		System.out.println("sum::"+ar.add(10, 20));

	}

}
