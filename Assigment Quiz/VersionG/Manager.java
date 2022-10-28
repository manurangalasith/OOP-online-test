package VersionG;

import java.util.Scanner;

public class Manager extends Employee {
	private String Department;
	private int ProductNo1;
	private int ProductNo2;
	private int ProductNo3;
	
	public Manager() {
		
	}
	
	public Manager(String EmpId, String name, String address, String Department, int ProductNo1, int ProductNo2, int ProductNo3) {
		super(EmpId, name, address);
		this.Department = Department;
		this.ProductNo1 = ProductNo1;
		this.ProductNo2 = ProductNo2;
		this.ProductNo3 = ProductNo3;
	}
	
	public void Read() {
		super.Read();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter department: ");
		this.Department = scan.nextLine();
		try {
			System.out.println("Enter product1: ");
			this.ProductNo1 = scan.nextInt();
			System.out.println("Enter product2: ");
			this.ProductNo2 = scan.nextInt();
			System.out.println("Enter product3: ");
			this.ProductNo3 = scan.nextInt();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Print() {
		super.Print();
		System.out.println("Department: " + Department);
		System.out.println("Product 1: " + ProductNo1);
		System.out.println("Product 2: " + ProductNo2);
		System.out.println("Product 3: " + ProductNo3);
	}
}
