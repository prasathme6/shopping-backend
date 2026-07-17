//package com.trySpring.trySpring.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.trySpring.trySpring.model.Employee;
//import com.trySpring.trySpring.service.EmpService;
//
//@RestController
//@CrossOrigin
//public class EmpController {
//	
//	@Autowired
//	EmpService emp;
//	
//	@GetMapping("/emp")
//	public List<Employee> getEmp(){
//		return emp.getEmp();
//	}
//	
//	@PostMapping("/emp")
//	public void createEmp(@RequestBody Employee empl) {
//		emp.createEmp(empl);
//	}
//	
//	@GetMapping("/emp/{id}")
//	public Employee getEmpId(@PathVariable int id) {
//		return emp.getByID(id);
//	}
//	
//	@PutMapping("/emp")
//	public void updateEmp(@RequestBody Employee empl) {
//		emp.updateEmp(empl);
//	}
//	
//	@DeleteMapping("/emp/{id}")
//	public void deleteEmp(@PathVariable int id) {
//		emp.deleteEmp(id);
//	}
//}
