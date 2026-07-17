//package com.trySpring.trySpring.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.trySpring.trySpring.Repository.EmpRepo;
//import com.trySpring.trySpring.model.Employee;
//
//@Service
//public class EmpService {
//	
//	@Autowired
//	EmpRepo repo;
//	
//	public List<Employee> getEmp(){
//		return repo.findAll();
//	}
//	
//	public void createEmp(Employee emp) {
//		repo.save(emp);
//	}
//	
//	public Employee getByID(int id) {
//		return repo.findById(id).orElse(new Employee());
//	}
//	
//	public void updateEmp(Employee emp) {
//		repo.save(emp);
//	}
//	
//	public void deleteEmp(int id) {
//		repo.deleteById(id);
//	}
//}
