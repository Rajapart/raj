package com.example.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empsr;
	
	@PostMapping(value="/add")
	public String addDetail(@RequestBody Employee e) {
	return empsr.addDetail(e);
}
	@PostMapping("/list")
	public String addList(@RequestBody List<Employee>e) {
		return empsr.addList(e);
	}
		@GetMapping("/find")
		public List<Employee>getList(){
			return empsr.getList();
		}
 @GetMapping("/id/{a}")
 public Employee getbyid(@PathVariable int a) {
	 return empsr.getbyid(a);
 }
 @DeleteMapping("/i/{a}")
 public String deletebyid(@PathVariable int a) {
	 return empsr.deletebyid(a);
 }
 @GetMapping("/lists")
   public List<Employee> viewList() {
   return empsr.viewList();
 }
	
}
