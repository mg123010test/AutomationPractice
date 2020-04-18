package com.test.modules.practices.tutorialspointtestNGExamples;

public class EmployeeBusinessLogics {

	
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		
		double calculatedSalary = 0;
		
		calculatedSalary = employeeDetails.getMonthlySalary()*12;
		
		return  calculatedSalary;
	}
	
	
	public double calculateAppraisal(EmployeeDetails employeeDetails) {
		
		  double appraisal = 0;
	      
	      if(employeeDetails.getMonthlySalary() < 10000) {
	         appraisal = 2000;
	         
	      } else {
	         appraisal = 1000;
	      }
	      
	      return appraisal;
	}
}
