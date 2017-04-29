package design;

import java.util.Scanner;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
	
		
		EmployeeInfo object = new EmployeeInfo("Ishrat",15,"full time",10,"good");
		
		String name = object.employeeName();
		int employeeId = object.employeeId();
		String employeeType = object.employeeType();
		String performance = object.performance();
		String department = object.assignDepartment(employeeId);
		int salary = object.calculateSalary();
		int bonus = object.calculateEmployeeBonus();
		int pension = object.calculateEmployeePension();
		String benefitLayout = object.benefitLayout(employeeType);
		
		System.out.println("Name of the Employee is : " + name);
		System.out.println("Employee ID             : " + employeeId);
		System.out.println("Assigned Department     : " + department);
		System.out.println("Salary is               : " + salary);
		System.out.println("Fulltime or Part-time   : " + employeeType);
		System.out.println(name+" received         : " + benefitLayout);
		System.out.println("Bonus is                : " + bonus);
		System.out.println("Pension is              : "+ pension);
	
	}

}
