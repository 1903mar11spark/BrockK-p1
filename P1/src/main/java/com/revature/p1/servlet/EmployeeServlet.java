package com.revature.p1.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import com.revature.p1.beans.*;
import com.revature.p1.service.*;
import com.revature.p1.model.*;
import com.revature.p1.main.*;
import com.revature.p1.util.*;
import com.revature.p1.dao.*;


@WebServlet("/home")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 2463705930494450946L;
	
	// we will use this to convert Java objects to JSON-formatted data to include in
	// response bodies
	private ObjectMapper om;

	// this is our service class whose methods we will call
	private EmployeeDao employeeDao;

    public EmployeeServlet() {
        employeeDao = new EmployeeDaoImpl();
        om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());        
        om.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idString = req.getParameter("empId");
		
		if(idString != null ) {
			try {
				int id = Integer.parseInt(idString);
						String bearJSON = om.writeValueAsString(employeeDao.getEmpById(id));
				
						if (bearJSON != null) {
							resp.getWriter().write(bearJSON);
						} else {
							resp.sendError(404);
						}
					} catch (Exception e) {
						resp.sendError(400);
					}
				} else {
					resp.getWriter().write(om.writeValueAsString(employeeDao.getAllEmployees()));
				}
			
			
		
		
		
		
		resp.getWriter().append("Served at: ").append(req.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
}