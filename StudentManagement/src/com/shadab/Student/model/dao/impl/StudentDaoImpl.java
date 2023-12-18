package com.shadab.Student.model.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.shadab.Student.model.dao.StudentDao;
import com.shadab.Student.model.entity.Student;

public class StudentDaoImpl implements StudentDao{

	public List<Student> studentList = new ArrayList<Student>();


	public Student register(Scanner scanner) {
		Student student = new Student();
		System.out.println("Enter your Name");
		scanner.nextLine();
		student.setName(scanner.nextLine());
		System.out.println("Enter your phoneNo");
		student.setPhoneNo(scanner.nextLong());
		System.out.println("Enter your address");
		scanner.nextLine();
		student.setAddress(scanner.nextLine());
		System.out.println("Enter your city");
		student.setCity(scanner.nextLine());
		student.setId();
		studentList.add(student);
		return student;
	}

	public List<Student> findAll() {

		return studentList;
	}

	public Student fetch(Scanner scanner) {
		System.out.println("Enter id you want to fetch");
		int fetchid =scanner.nextInt();
		boolean flag = false;
		for (Student i : studentList) {
			if(i.getId()==fetchid) {
				flag = true;
				System.out.println(i);
				break;
			}else {
				flag = false;
			}
		}
		if(!flag) {
			System.out.println("No Data Available for this Id.");        	
		}

		return null;
	}

	public Student update(Scanner scanner) {
		System.out.println("Enter id you want to update Details");
		int updinfo = scanner.nextInt();
		boolean flag = false;
		for (Student inn : studentList) {
			if(inn.getId()==updinfo) {
				flag = true;
				System.out.println(inn);
				System.out.println("Enter your New Name");
				scanner.nextLine();
				inn.setName(scanner.nextLine());
				System.out.println("Enter your New phoneNo");
				inn.setPhoneNo(scanner.nextLong());
				System.out.println("Enter your New address");
				scanner.nextLine();
				inn.setAddress(scanner.nextLine());
				System.out.println("Enter your New city");
				inn.setCity(scanner.nextLine());

				break;
			}else {
				flag = false;
			}
		}
		if(!flag) {
			System.out.println("No Data Available for this Id.");        	
		}

		return null;
	}

	public Student delete(Scanner scanner) {
		System.out.println("Enter id you want to delete");
		int delid =scanner.nextInt();
		boolean flag = false;
		ListIterator<Student> iterator = studentList.listIterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();

			if(student.getId()==delid) {
				iterator.remove();
			}

		}
		return null;
	}



}
