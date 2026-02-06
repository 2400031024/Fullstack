package MyPackage;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee details:");
		int eno = sc.nextInt();
		String ename = sc.next();
		float salary = sc.nextFloat();
		char mstatus = sc.next().charAt(0);
		String job = sc.next();
		System.out.println("employee number = "+eno);
		System.out.println("employee name = "+ename);
		System.out.println("employee salary = "+salary);
		System.out.println("employee mstatus = "+mstatus);
		System.out.println("employee job = "+job);
	}

}
