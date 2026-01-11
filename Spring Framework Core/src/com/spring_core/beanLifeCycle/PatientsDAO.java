package com.spring_core.beanLifeCycle;


import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

import java.sql.*;

@Component
public class PatientsDAO {

    Connection con;

//    @Value("com.mysql.jdbc.Driver") This is Deprecated
    @Value("com.mysql.cj.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://127.0.0.1:3306/myHospital")
    private String url;
    @Value("root")
    private String username;
    @Value("Niyamat@2005")
    private String password;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Once patientDAO Bean is created, it call dbConnection by itSelf Automatically
    // Don't wait for us to call this method
    // JPA Annotation
    @PostConstruct
    // init / xyz  method is called as the Bean is initialized , we can also alter using this method
    public void init() throws SQLException, ClassNotFoundException {
        System.out.println("Init Method is Called..!!");
        dbConnection();
    }

    public void dbConnection () throws ClassNotFoundException, SQLException {
        // Load Driver
        Class.forName(driver);

        // Est Connection;
        con = DriverManager.getConnection(url, username, password);
    }

    public void selectAllRows() throws ClassNotFoundException, SQLException {


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

    }
    public void deleteRecord(int patientId) throws ClassNotFoundException, SQLException {

        Statement stmt = con.createStatement();

        stmt.executeUpdate("DELETE FROM patients WHERE pId = "+patientId);

        System.out.println("Patient With Patient ID : "+patientId+" is Deleted..!!");

    }


    public void closeConnection() throws SQLException {
        System.out.println("Connection is closed");
        // Close Connection :
        con.close();
    }

    @PreDestroy
    public void destroy() throws SQLException {
        closeConnection();
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
