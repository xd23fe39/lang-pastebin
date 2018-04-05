package com.sample;

/**
 * Code sample.
 *
 * java -cp $JDBC_DRIVER/ojdbc7.jar;$SCRIPT_DIR OracleJDBCExample
 *
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.*;
import java.io.*;
// import java.sql.*;

public class Demo 
{
    public static void main(String[] args)throws IOException, SQLException
    {
        String sql = "select * from table" ;

        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","user","password");
            Statement stmt = con.createStatement();
            stmt.execute(sql);
            con.close();
        }

        catch(Exception e)
        {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
    }
}
