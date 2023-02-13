package com.Infosys.in.Sample.of.Messaging.Service;

import java.util.List;

import com.Infosys.in.Sample.of.Messaging.Entity.Department;
import com.Infosys.in.Sample.of.Messaging.Repository.DepartmentRepository;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> getAllDepartmentList();

	public Department getDepartmentById(Long departmentId);
   
	

//	public List<Department> updateAllDepartmentList();

	

}
