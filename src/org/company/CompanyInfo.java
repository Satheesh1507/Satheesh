package org.company;

public class CompanyInfo {
	
	private void mem1() {
		System.out.println("member11 done my codings");

	}
	private void companyName(String name) {
		System.out.println("The Employee Name is " + name);

	}

	private void companyName(int id, String name) {
		System.out.println("The Company Id is " + id + "\n" + "My name is " + name);

	}

	private void companyName(long phoneno, float salary, double avgsalary) {
		System.out.println("The Employee Phoneno is " + phoneno + "\n" + "The employee salary is " + salary + "\n"
				+ "The Employee Avg salary is " + avgsalary);

	}

	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName("Raj Kumar");
		c.companyName(8072930743l, 2548.123654f, 225324.02545154);
		c.companyName(12345, "Alpha");
		
	}

}
