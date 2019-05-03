package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.revature.beans.*;

public class ManagerServlet extends HttpServlet {


	private static final long serialVersionUID = -8286526797657178044L;

	// we will use this to convert Java objects to JSON-formatted data to include in
	// response bodies
	private ObjectMapper om;

	// this is our service class whose methods we will call

	// return all emps
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////		String idString = req.getParameter("id");
//		if (idString != null) {
//			try {
//				int id = Integer.parseInt(idString);
//				String empsJSON = om.writeValueAsString(managerDao.getAllEmployees());
//				if (empsJSON != null) {
//					resp.getWriter().write(empsJSON);
//				} else {
//					resp.sendError(404);
//				}
//			} catch (Exception e) {
//				resp.sendError(400);
//			}
//		} else {
//			resp.getWriter().write(om.writeValueAsString(managerDao.getAllEmployees()));
//		}
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
