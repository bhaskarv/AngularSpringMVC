package org.learn.sys.controller;

import java.util.List;

import org.learn.sys.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	
	public @ResponseBody String addEmployee(@RequestBody Employee emp) {
		System.out.println(" ADD EMPLOYEEEE *** "+emp);
		if (service.addEmployee(emp)){
			return "EMPLOYEE ADDED SUCCESSFULLY";
		}
		return "EMPLOYEE COULD NOT BE ADDED";
	}

	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody List<Employee> getAll() {
		System.out.println(" GET ALL ******* ");
		return service.getAll();
	}

}
