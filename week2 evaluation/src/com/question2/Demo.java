package com.question2;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of  Students");
		int totalStudents = sc.nextInt();
		
		Student[] arr = new Student[totalStudents];
		int[] avgMarks =  new int[totalStudents];
		
		System.out.println("Enter Student detail :");
		for(int i=0; i<arr.length;i++) {		
			System.out.println("Enter Student" + " details");
			System.out.println("Enter Name :");
			String name = sc.next();
			
			System.out.println("Enter Roll no:");
			int roll = sc.nextInt();
			
			System.out.println("Enter Address :");
			String address = sc.next();
			
			System.out.println("Enter Marks :");
			int marks = sc.nextInt();
			
			arr[i] = new Student(roll,name,address,marks);
//			Student[i].setName(name);
//			arr[i].setRoll(roll);
//			arr[i].setAddress(address);
//			arr[i].setMarks(marks);
			avgMarks[i] = marks;
			
//			System.out.println("Student"+i+"Info"+arr[i].getMarks());
		}
		
		System.out.println("Student Details :");

		int avg =0;
		for(int k=0; k<avgMarks.length ;k++) {
			avg += avgMarks[k];
		}
		System.out.println("Average Marks :" + avg/avgMarks.length);
		for(int  j=0; j<arr.length;j++) {
			System.out.println("=====================");
			System.out.println("Student" + ++j +"Details :");
			System.out.println("Name :"+ arr[j].getName());
			System.out.println("ROll :"+ arr[j].getRoll());
			System.out.println("Address :"+ arr[j].getAddress());
			System.out.println("Marks :"+ arr[j].getMarks());
		}
		
		
		
//		System.out.println("length of studen: "+arr.length);
	}

}
