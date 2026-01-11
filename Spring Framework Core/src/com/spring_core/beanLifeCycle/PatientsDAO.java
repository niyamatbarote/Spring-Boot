package com.spring_core.beanLifeCycle;


import java.sql.*;

public class PatientsDAO {

    private String driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://127.0.0.1:3306/myHospital";
    private String username="root";
    private String password="Niyamat@2005";

    public void selectAllRows() throws ClassNotFoundException, SQLException {
        // Load Driver
        Class.forName(driver);

        // Est Connection;
        Connection con = DriverManager.getConnection(url, username, password);

        // Statement:
        Statement stmt = con.createStatement();

        // Execute Query:
        stmt.executeQuery("SELECT * FROM patients");

        // ResultSet
        ResultSet rs = stmt.executeQuery("SELECT * FROM patients");

        while (rs.next()) {
            int pId = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);

            System.out.println(pId+" "+name+" "+age);
        }
        // Close Connection :
    con.close();
    }
    public void deleteRecord(int patientId) throws ClassNotFoundException, SQLException {

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, username,password);
        Statement stmt = con.createStatement();

        stmt.executeUpdate("DELETE FROM patients WHERE pId = "+patientId);

        System.out.println("Patient With Patient ID : "+patientId+" is Deleted..!!");

        con.close();
    }

//    public void addPatients(int patientId, String name, int age) throws ClassNotFoundException, SQLException {
//        Class.forName(driver);
//        Connection con = DriverManager.getConnection(url, username,password);
//        Statement stmt = con.createStatement();
//
//        String query = "insert into patients(name,age) VALUES("+ "'"+name+"'"+age+ ") ";
//        System.out.println("Patient Added Successfully...!!!");
//
//    }

}
