package com.briglabz;

public class Employeeuc10 {
	private final String company;
	final int empRatePerHour;
	final int numOfWorkingDays;
	final int maxHoursPerMonth;
	private int totalEmpWage;
	public Employeeuc10(String company, int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	public void setTotalEmpWage(int totalEmpWage) {

		this.totalEmpWage = totalEmpWage;
	}

	public String toString() {
		return "Total Emp wage for Company:"+company+"is:"+totalEmpWage;
	}

}
