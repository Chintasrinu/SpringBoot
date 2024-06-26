package com.nt.comp;

public class Employee extends Person{

	@Override
	public String toString() {
		return "Employee [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
