package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    private final static String host = "localhost";
    private final static String dbname = "postgres";
    private final static String username = "postgres";
    private final static String password = "MyPostgres&";
    static Connection con;

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:postgresql://" + host + "/" + dbname + "?user=" + username + "&password=" + password;
//        try {
            con = DriverManager.getConnection(url, username, password);
            if(con==null)
                System.out.println("Нет соединения с БД");
            else
                System.out.println("Соединение с БД установлено");
    }
}