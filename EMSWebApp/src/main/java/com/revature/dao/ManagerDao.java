/**
 * 
 */
package com.revature.dao;

import java.util.List;
import com.revature.beans.*;

public interface ManagerDao {


				public void updateEmployee(Employee emp, String User);
				public void createNewEmployee(int deptId, String fname, String lname, int mgrId, String username, String pass);

				public void apprExp(Integer apprInt);
				public void denyExp(Integer denyInt);
				
				public boolean getEmp (String username, String pass);
				public Employee getEmpById(int empId);
				public Employee getEmp(String email);
				
				public List<Employee> getAllEmployees();
				

}
