package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empDao;
	public String addDetail(Employee e) {
		return empDao.addDetail(e);
	}
	@PostMapping
	public String addList(@RequestBody List<Employee>e) {
		return empDao.addList(e);

}
	@GetMapping
	public List<Employee>getList(){
		return empDao.getList();
	}
	@GetMapping
	public Employee getbyid(@PathVariable int a) {
		return empDao.getbyid(a);
	}
	@DeleteMapping
	public String deletebyid(@PathVariable int a) {
	return empDao.deletebyid(a);
}
	@GetMapping
	public List<Employee>viewList(){
		return empDao.viewList();
	}
	}
	

