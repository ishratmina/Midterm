package design;

import java.util.ArrayList;

public class EmployeeInfo {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	static int employeeId;
	static String name;
	static int salary;
	static String department;
	static String employeeType;
	static String performance;
	static int workingYear;
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
		
	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;
	}
	
    public EmployeeInfo(String name, int employeeId, String employeeType, int workingYear, String performance){
		this.name = name;
		this.employeeId=employeeId;
		this.employeeType= employeeType;
		this.workingYear=workingYear;
		this.performance = performance;
    }
    
    
    public static int employeeId(){
    	return employeeId;
    }
    
    public static String employeeName(){
    	return name;
    }
    
    public static String employeeType(){
    	return employeeType;
    }
    
    public static String performance(){
    	return performance;
    }
    
    public static int salary(){
    	return salary;
    }
    
    public static String assignDepartment(int employeeId){
    	
    	if (employeeId<10){
    		department = "Sales";
    		return department;
    	}
    	else if (employeeId>=10 && employeeId<19){
    		department = "Production";
    		return department;
		}
    	else if (employeeId>=20 && employeeId<30){
    		department = "Admin";	
    		return department;
		}
    	return department;
    }
    
    public static int calculateSalary(){
    	
    	if (department == "Sales"){
    		salary = 50000;
    	    return salary;
    	}
    	else if (department == "Production"){
    		salary = 60000;
    		return salary;
    	}
    	else if (department == "Admin"){
    		salary = 70000;
    		return salary;
    	}
    	return salary;
    }
    
    public static String benefitLayout(String employeeType){
    	
       	if (employeeType == "full time") 
    		return "full benefit including medical";
    	else return "no benefit";
    }
    
    
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(){
		
		if (performance=="good")
			return (salary*10)/100;	
		
		else if (performance == "average")
			return (salary*8)/100;
		
		else return 0;
		
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeePension(){
		int total=0;
		ArrayList<Integer> bonusInEachYear = new ArrayList<Integer>();
		
		for (int i=0; i<workingYear; i++)
		bonusInEachYear.add((salary*5)/100);  	
		
		for (int j=0; j<bonusInEachYear.size(); j++)
			total = total+bonusInEachYear.get(j);
		
		return total;
	}
}
