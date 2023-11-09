
package com.mycompany.funcionarios.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionUtil {
    
    private static final String URL = "jdbc:postgresql://localhost:5433/Funcionarios";
    private static final String USER = "postgres";
    private static final String PASSWORD = "sost1234";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}