package VersionG;

import java.util.Scanner;

public class Employee {
	private String EmpId;
	private String name;
	private String address;
	
	public Employee() {
		
	}
	
	public Employee(String EmpId, String name, String address) {
		this.EmpId = EmpId;
		this.name = name;
		this.address = address;
	}
	
	public void Read() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter EmpId: ");
		EmpId = scan.nextLine();
		System.out.println("Enter name: ");
		name = scan.nextLine();
		System.out.println("Enter addres: ");
		address = scan.nextLine();
	}
	
	public void Print() {
		System.out.println("Employee ID: " + EmpId);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Address: " + address);
	}
}
