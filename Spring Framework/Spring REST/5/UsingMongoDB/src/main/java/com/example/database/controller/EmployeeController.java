package com.example.database.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.model.Employee;
import com.example.database.repository.MainRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private MainRepository mainRepository;
	
	//save the employee
	@PostMapping("/saveEmployee")
	public String save(@RequestBody Employee employee) {
		mainRepository.save(employee);
		return "Added Employee with id: "+employee.getEmployeeID();
	}
	
	//find all employee
	@GetMapping("/findAllEmployee")
	public List<Employee> getAll(){
		return mainRepository.findAll();
	}
	
	//find the employee by id
	@GetMapping("/findAllEmployee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id){
		return mainRepository.findById(id);
	}
	
	//delete the employee by id
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		 mainRepository.deleteById(id);
		 return "Delete Employee with id: "+id;
	}
	
	//update the employee by id
	@PutMapping("/update/{id}")
	public String updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		mainRepository.findById(id);
		mainRepository.save(employee);
		return "Update Employee with id: "+id;
		
	}
}
