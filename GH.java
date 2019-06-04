/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author 5555555555555555555
 */
public class GH {
    public static void main (String[] bb)
    {
      try
      {
          Class.forName("org.gjt.mm.mysql.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/","root","");
          PreparedStatement stmt=con.prepareStatement("Create Database quizexam");
          stmt.executeUpdate();
          stmt=con.prepareStatement("Use quizexam");
          stmt.executeUpdate();
          stmt=con.prepareStatement(" Create table USERS (ulogin varchar(20),upassword varchar(20))");
          stmt.executeUpdate();
          stmt=con.prepareStatement(" Create table Subjects (scode varchar(10),name varchar(100),marks int)");
          stmt.executeUpdate();
          stmt=con.prepareStatement(" Create table Questions (Qcode varchar(5),scode varchar(10),Question varchar(200),op1 varchar(50),op2 varchar(50),op3 varchar(50),op4 varchar(50),answer int)");
          stmt.executeUpdate();
          stmt=con.prepareStatement(" Create table Exams (rollno varchar(12),name varchar(30),scode varchar(10),EDate date,marks int)");
          stmt.executeUpdate();
          stmt=con.prepareStatement(" Create table Faculty (name varchar(30),Designation varchar(30))");
          stmt.executeUpdate();
          System.out.println("Database Created");
      }catch(Exception ee){System.out.println(ee);}
    }
}
