package com.revature.p1.dao;

import com.revature.p1.beans.*;
import java.util.*;

public interface EmployeeDao {
	

	    public List<Employee> getAllEmployees();
	    public List<Employee> getAllEmployees(int empId);
	    public Employee getEmpById(int empId);
//	    public Employee getEmpById(int empId);
//	    public Employee getEmpByName(String lname, String fname)
//	    
//	    boolean insertEmployee(Employee employee);
//	    boolean updateEmployee(Employee employee);
//	    boolean deleteEmployee(Employee employee);
//	    
//	   
//	    
//	    	List<Emplpoyee> getAll();
//	    	T getById(int id);
//	    	T add(T obj);
//	    	T update(T updatedObj);
//	    	boolean delete(int id);
		

}


