/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString();
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.6);
		Jim.employeeToString();
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Pam.employeeToString();
		System.out.print("Michael you are getting a raise, your salary is now: ");
		michael.raiseSalary(15);
		System.out.println(michael.getSalary());
		System.out.print("And your new Annual Salary is: ");
		System.out.println(michael.getAnnualSalary());
		System.out.print("Dwight you are getting a raise, your salary is now: ");
		Dwight.raiseSalary(15);
		System.out.println(Dwight.getSalary());
		System.out.print("And your new Annual Salary is: ");
		System.out.println(Dwight.getAnnualSalary());
		System.out.print("Jim you are getting a raise, your salary is now: ");
		Jim.raiseSalary(15);
		System.out.println(Jim.getSalary());
		System.out.print("And your new Annual Salary is: ");
		System.out.println(Jim.getAnnualSalary());
		System.out.print("Pam you are getting a raise, your salary is now: ");
		Pam.raiseSalary(15);
		System.out.println(Pam.getSalary());
		System.out.print("And your new Annual Salary is: ");
		System.out.println(Pam.getAnnualSalary());
	}
}
