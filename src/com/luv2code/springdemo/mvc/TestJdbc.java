package com.luv2code.springdemo.mvc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc
{
    public static void main( String[] args )
    {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/spring_mvc";
        String user = "postgres";
        String password = "1111";

        try
        {
            System.out.println("Connecting to database" + jdbcUrl);

            Connection connection = DriverManager.getConnection( jdbcUrl, user, password );

            System.out.println("Connected successful!!!");
            connection.close();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}
