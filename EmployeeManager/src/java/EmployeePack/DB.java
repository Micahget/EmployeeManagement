package EmployeePack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

   public static Connection getConnection() {
       Connection con = null;
       try {
           Class.forName("com.mysql.jdbc.Driver");
           //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_test", "root", "");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javamini", "root", "");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("Debugging");
           System.out.println(e);
       }
       return con;
   }
}
