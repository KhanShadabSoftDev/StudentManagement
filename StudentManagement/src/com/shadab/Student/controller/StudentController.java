package com.shadab.Student.controller;

import java.util.List;
import java.util.Scanner;

import com.shadab.Student.model.dao.StudentDao;
import com.shadab.Student.model.dao.impl.StudentDaoImpl;
import com.shadab.Student.model.entity.Student;

public class StudentController {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		StudentDao dao = new StudentDaoImpl();
		boolean f = true;
		while(f) {
			System.out.println("What you want to do");
			System.out.println("Press 1: To Register");
			System.out.println("Press 2: To Fetch");
			System.out.println("Press 3: To FetchAll");

			System.out.println("Press 4: To Update");
			System.out.println("Press 5: To Delete");
			System.out.println("Press 6: To Exit");
			byte nextByte = scanner.nextByte();

			switch (nextByte) {
			case 1: 
				Student s1 = dao.register(scanner); 
				System.out.println(s1);
				break;
			case 2:
				 Student s2 = dao.fetch(scanner) ; 
				break;
			case 3:
				List<Student>  listAll= dao.findAll();
				for (Student student2 : listAll) {
					System.out.println(student2);
				}
				break;
			case 4:
				Student s3= dao.update(scanner);
				break;
			case 5:
				Student s4 = dao.delete(scanner);
				break;
			case 6:	
				f=false;
				break;
			}

		}
	}
}
