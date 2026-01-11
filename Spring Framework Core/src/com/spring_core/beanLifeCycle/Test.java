package com.spring_core.beanLifeCycle;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        PatientsDAO dao = new PatientsDAO();
        dao.selectAllRows();
//        dao.deleteRecord(5);
    }
}
