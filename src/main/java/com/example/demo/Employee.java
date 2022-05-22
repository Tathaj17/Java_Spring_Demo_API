package com.example.demo;

/**
 * 
 * @author Tathagata
 *
 */
public class Employee 
{
	String name;
	Integer age;
	String department;
	Double salary;

	public String getName() {

		return name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
