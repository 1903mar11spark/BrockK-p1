SELECT ee.exp_dt, ee.exp_amt, ee.status, et.exp_name, e.fname, e.lname, e.emp_id, e.emp_mgr_id
FROM employee_expensetype ee 
JOIN expensetype et ON ee.exp_id = et.exp_id
JOIN employee e ON ee.emp_id = e.emp_id
WHERE e.emp_id = 1;