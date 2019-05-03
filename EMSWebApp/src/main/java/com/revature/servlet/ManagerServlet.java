package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ManagerServlet extends HttpServlet {


	private static final long serialVersionUID = -8286526797657178044L;

	// we will use this to convert Java objects to JSON-formatted data to include in
	// response bodies
	private ObjectMapper om;

	// this is our service class whose methods we will call

	// return all emps
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		if (managerDao.createNewEmployee(om.readValue(req.getReader(), null))) {
//			resp.setStatus(200);
//		} else {
//			resp.sendError(400);
//		}
	}
	
	
}
