package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.beans.*;
import com.revature.dao.EmployeeExpenseTypeDao;
import com.revature.dao.EmployeeExpenseTypeDaoImpl;
import com.revature.model.ExpenseStatus;


public class EmployeeServlet extends HttpServlet {
	
  
	private static final long serialVersionUID = -1044520479033297855L;

	public EmployeeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getSession().getAttribute("employee") == null) {
			response.sendRedirect("login.html");
		}
		Employee currentEmployee = (Employee)request.getSession().getAttribute("employee");
		EmployeeExpenseTypeDao eetd = new EmployeeExpenseTypeDaoImpl();
		List<EmployeeExpenseType> employeeExpenses = new ArrayList();
		String action = request.getParameter("action");
		if (action == null) {
			
		} else if (action.equals("listpending")) {
			employeeExpenses = eetd.getEmployeeExpenses(currentEmployee.getEmpId(), ExpenseStatus.NEW);
		} else if (action.equals("listdenied")) {
			employeeExpenses = eetd.getEmployeeExpenses(currentEmployee.getEmpId(), ExpenseStatus.DENIED);
		} else if (action.equals("listapproved")) {
			employeeExpenses = eetd.getEmployeeExpenses(currentEmployee.getEmpId(), ExpenseStatus.APPROVED);
		}
		
		request.setAttribute("expenses", employeeExpenses);
		request.getRequestDispatcher("employeeHome.jsp").include(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
		ServletResponse s = response;
		PrintWriter out = response.getWriter();

	}

}


