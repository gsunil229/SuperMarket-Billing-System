/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket.billing.system;

import java.sql.Connection;
import java.sql.DriverManager;
//import javax.swing.JOptionPane;

/**
 *
 * @author Sunil Kumar Gupta
 */
public class DatabaseWork {
public static Connection getConnection()
    {
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver");// register driver
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Billing","root","root");
            return con;
        } catch(Exception e)
        {
           return null;
        }
    }
    
}
