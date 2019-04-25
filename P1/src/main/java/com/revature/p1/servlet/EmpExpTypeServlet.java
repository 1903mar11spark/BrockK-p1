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
import com.revature.p1.dao.EmployeeDao;
import com.revature.p1.dao.EmployeeDaoImpl;

import com.revature.p1.beans.*;
import com.revature.p1.service.*;
import com.revature.p1.model.*;
import com.revature.p1.main.*;
import com.revature.p1.util.*;
import com.revature.p1.dao.*;

/**
 * Servlet implementation class Manager
 */
@WebServlet("/expense")

public class EmpExpTypeServlet extends HttpServlet {
	
	private static final long serialVersionUID = -531328088581512748L;

	// we will use this to convert Java objects to JSON-formatted data to include in
		// response bodies
		private ObjectMapper om;

		// this is our service class whose methods we will call
		private EmpExpTypeDao empExpTypeDao;

	    public EmpExpTypeServlet() {
	        empExpTypeDao = new EmpExpTypeDaoImpl();
	        om = new ObjectMapper();
	        om.registerModule(new JavaTimeModule());        
	        om.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
	    }
	    
	    @Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String idString = req.getParameter("empId");
			
			if(idString != null ) {
				try {
					// * * * * * * * THIS ONE * * * * * * *
					int id = Integer.parseInt(idString);
							String bearJSON = om.writeValueAsString(empExpTypeDao.getAllEmpExpTypes());
					
							if (bearJSON != null) {
								resp.getWriter().write(bearJSON);
							} else {
								resp.sendError(404);
							}
						} catch (Exception e) {
							resp.sendError(400);
						}
					} else {
						resp.getWriter().write(om.writeValueAsString(empExpTypeDao.getAllEmployees()));
					}
				
				
			
			
			
			
			resp.getWriter().append("Served at: ").append(req.getContextPath());
		}
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			doGet(request, response);
		}
		
	}