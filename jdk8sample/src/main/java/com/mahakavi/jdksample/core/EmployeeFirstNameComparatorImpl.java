package com.mahakavi.jdksample.core;

import java.util.Comparator;

public class EmployeeFirstNameComparatorImpl implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getFirstName().compareTo(o2.getFirstName()) > 0){
			return 1;
		}else if(o1.getFirstName().compareTo(o2.getFirstName()) < 0){
			return -1;
		}else{
			return 0;
		}
			
	}

}
