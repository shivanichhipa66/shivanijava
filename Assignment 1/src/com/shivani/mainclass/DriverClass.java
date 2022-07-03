package com.shivani.mainclass;

import com.shivani.modelclass.*;


public class DriverClass{
	
public static void main(String args[]) {

	SuperDepartment	main = new  SuperDepartment();
	
	System.out.println(main.departmentName());
	System.out.println(main.getTodaysWork());
	System.out.println(main.getWorkDeadline());
	System.out.println(main.isTodayAHoliday());
	
	System.out.println();
	
	AdminDepartment	admin = new  AdminDepartment();
	
	System.out.println(admin.departmentName());
	System.out.println(admin.getTodaysWork());
	System.out.println(admin.getWorkDeadline());
	System.out.println(admin.isTodayAHoliday());
	
	System.out.println();
	
	HrDepartment	hr = new  HrDepartment();
	
	System.out.println(hr.departmentName());
	System.out.println(hr.getTodaysWork());
	System.out.println(hr.getWorkDeadline());
	System.out.println(hr.doActivity());
	System.out.println(hr.isTodayAHoliday());
	
	System.out.println();
	
	TechDepartment	tech = new  TechDepartment();
	
	System.out.println(tech.departmentName());
	System.out.println(tech.getTodaysWork());
	System.out.println(tech.getWorkDeadline());
	System.out.println(tech.getTEchInformation());
	System.out.println(tech.isTodayAHoliday());

}
}

	