package com.revature.p1.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.revature.p1.beans.*;
import com.revature.p1.dao.*;
import com.revature.p1.util.ConnectionUtility;

public class Driver {

public static void main(String[] args) {
        
        try {Connection con = ConnectionUtility.getConnectionFromFile();
            System.out.println(con);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }        
        }
}