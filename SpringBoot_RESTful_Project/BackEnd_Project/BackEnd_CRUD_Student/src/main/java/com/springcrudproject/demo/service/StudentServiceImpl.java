package com.springcrudproject.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.springcrudproject.demo.model.Student;
import com.springcrudproject.demo.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentRepository sr;

	@Override
	public Student saveStudent(Student student) {
		Student savestu=new Student();
		try
		{
			savestu=sr.save(student);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception while adding Student");
			
		}
		return savestu;
	}

	@Override
	public List<Student> getStudents() {
		List<Student> liststu=new ArrayList<>();
		try
		{
		liststu=sr.findAll();
		}
		catch(Exception e)
		{
			System.out.println("Exception while getting list of Student");
			
		}
		return liststu;
	}

	@Override
	public String deleteStudentById(int student_id) {
    String result;
		
		try {
			sr.deleteById(student_id);
			
			result="Studet Data Succesfully Deleted";
		}
		catch(Exception e)
		{
			result="Exception while removing Student";
			
		}
		return result;
	}

	@Override
	public Student getStudentById(int student_id) {
		Optional<Student>op= sr.findById(student_id);
		if(op.isPresent())
		{
			Student stu=op.get();
			
			 return stu;
		}
		else 
		{
			System.out.println("Student Data Not Available");
			return null;
		}
	}

	@Override
	public Student updateStudent(int student_id, Student student) {
		Optional<Student>op=sr.findById(student_id);
		if(op.isPresent())
		{
			Student stu=op.get();
			stu.setStudent_name(student.getStudent_name());
			stu.setStudent_email(student.getStudent_email());
			stu.setStudent_branch(student.getStudent_branch());
			
			
			sr.save(stu);
			System.out.println("Student Data Updating Successfully ");
		}
		else
		{
			System.out.println("Student Data not available");
		}
		return student;
	}
	
}
