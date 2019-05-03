<%@page import="com.revature.beans.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@page import="com.revature.beans.EmployeeExpenseType"%>

<!DOCTYPE html>
 <html class="no-js"> 
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Employee Home Page</title>
        <meta name="Employee Home Page" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="P1.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


        <script src="P1.js" async defer></script>
    </head>
    <body class="container" background="https://autoweek.com/sites/default/files/styles/gen-1200-675/public/180915-bytedrickmealy-2.jpg" width=100% color="white">
        <nav>
            <ul>
                <li><a href="login.html">Home</a></li>
                <li><a href="employee">Employee Home</a></li>
                <li><a href="P1MgrPg.html">Manager Home Page</a></li>
                <!-- <li><a href="P1ReptPg.html">Reports</a></li> -->
            </ul>
        </nav>
        <div class="container" color="rgb(252, 247, 247)" font-weight=900></div>
        <header>
        	<% Employee emp = (Employee)request.getSession().getAttribute("employee"); %>
        	<% String action = request.getParameter("action"); %>
            <h1>Welcome,  <%=emp.getFname() %></h1>
         </header>
         <!--div>
             <br>
             <p id="username"></p>
             <br>
             <p id="firstname"></p>
             <br>
             <p id="lastname"></p>
             <br>
             <p id="email"></p>
             <br>
         </div-->
         <% if( action != null && !action.isEmpty()) { %>
	         <table id="t01" style="background: white" width="50%">
			  <tr>
			    <th>Expense Type</th>
			    <th>Amount</th>
			    <th>Date</th> 
			    <th>Approval</th>
			  </tr>
			  <% List<EmployeeExpenseType> employeeExpenses = (List<EmployeeExpenseType>) request.getAttribute("expenses"); %>
			  <% for(EmployeeExpenseType ex: employeeExpenses) {%>
			  <tr>
			    <td><%= ex.getExpenseType().getExpName() %></td>
			    <td><%= ex.getExpAmt() %></td>
			    <td><%= ex.getExpDt() %></td>
			    <td><%= ex.getStatus() %></td>
			  </tr>
			  <% } %>
			</table>
		<% } %>
            
            <script src="scripts/check.js"></script>

                <div class="container" color="rgb(252, 247, 247)" font-weight=900>
                <h2 color="white">Please select an option below.</h2>
                </div>  
                <br>
            <a href="newExpense.html"><button  type="button" id="EmpNewReq">Create New Expense Request</button></a>
            <a href="employee?action=listpending"><button type="button" id="EmpPendingReqs">See Pending Requests</button></a>
            <a href="employee?action=listdenied"><button type="button" id="EmpCompleteReqs">See Denied Requests</button></a>
            <a href="employee?action=listapproved"><button type="button" id="EmpCompleteReqs">See Approved Requests</button></a>
            <br>  <br>
        </div>
      
        <div>
            <form action="logout" method="get">
                <input type="submit" value="logout"/>
            </form>
        </div>
    </body>
    </html>