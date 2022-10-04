package com.springcrudproject.demo.service;

import java.util.List;

import com.springcrudproject.demo.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);

	public List<Student> getStudents();

	public String deleteStudentById(int student_id);

	public Student getStudentById(int student_id);

	public Student updateStudent(int student_id, Student student);

	

}
