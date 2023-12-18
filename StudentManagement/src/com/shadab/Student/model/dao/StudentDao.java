package com.shadab.Student.model.dao;

import java.util.List;
import java.util.Scanner;

import com.shadab.Student.model.entity.Student;

public interface StudentDao {

	Student register(Scanner scanner);

	List<Student> findAll();

	Student fetch(Scanner scanner);

	Student update(Scanner scanner);

	Student delete(Scanner scanner);
    
}
