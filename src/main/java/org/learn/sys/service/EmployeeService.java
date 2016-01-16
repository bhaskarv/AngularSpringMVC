package org.learn.sys.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.learn.sys.controller.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private static final Map<String, String> employees = new HashMap<String, String>();
	
	public boolean addEmployee(Employee emp) {
		boolean isAdded = false;
		if (!employees.containsKey(emp.getId())) {
			employees.put(emp.getId(), emp.getName());
			isAdded = true;
		}
		return isAdded;
	}
	
	public List<Employee> getAll() {
		List<Employee> emps = new ArrayList<Employee>();
		for (String id : employees.keySet()) {
			emps.add(new Employee(employees.get(id),id));
		}
		
		return emps;
	}
	
}
