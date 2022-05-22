package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/**
 * 
 * @author Tathagata
 *
 */
public class RootCaController 
{
	
	@GetMapping("/home")
	public Employee getEmployee() {
		Employee employee= new Employee();
		employee.setAge(2);
		employee.setName("Amar");
		return employee;

	}
	
	@GetMapping("/home1")
	public String  getEmployee1() {
		return "welcome";

	}
}
