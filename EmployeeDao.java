package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;
	public String addDetail(Employee e) {
		empRepo.save(e);
		return"succesfully saved";
		
	}
	
	public String addList(@RequestBody List<Employee>e) {
		empRepo.saveAll(e);
		return "Success";

}
	
	public  List<Employee> getList() {
		return empRepo.findAll();
		
	}
	public Employee getbyid(@PathVariable int a) {
		return empRepo.findById(a).get();
	}
	public String deletebyid(@PathVariable int a) {
		empRepo.deleteById(a);
		return"deleted";
	}
	public List<Employee>viewList() {
		return empRepo.findAll();
	}
	}

