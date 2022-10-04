package com.springcrudproject.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcrudproject.demo.model.Student;
import com.springcrudproject.demo.service.StudentService;




@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders={"Accept"})
@RequestMapping(value="/api")
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping(value="/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		 return ss.saveStudent(student);
		
	}
	
	@GetMapping(value = "/getAllStudent")
	public List<Student> getStudentList() {
		List<Student> slist=new ArrayList<>();
		slist=ss.getStudents();
		return slist;
	}
	
	
	@DeleteMapping(value = "deleteStudent/{student_id}")
	public String deleteStudentById(@PathVariable int student_id) {
		return ss.deleteStudentById(student_id);
	}

	@GetMapping(value="/getStudent/{student_id}")
    public Student getStudentById(@PathVariable int student_id)
    {
    	Student stu=ss.getStudentById(student_id);
		return stu;
    	
    }
	
	@PutMapping(value="updateStudent/{student_id}")
	public Student updateStudent(@RequestBody Student student,@PathVariable int student_id) {
		Student stu=ss.updateStudent(student_id,student);
	      return stu;
	}
}


