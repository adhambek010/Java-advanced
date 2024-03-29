package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

    public static void main(String[] args) {
        // Creating the connection
        String url = "jdbc:postgresql://127.0.0.1:5432/demo";
        Connection con = null;

        int rollno = 1;
        String name = "Adkham";
        int age = 22;

        String sql = "insert into student(rollno, name, age) " +
                "values(" + rollno + ", '" + name + "', " + age +")";

        try {
            con = DriverManager.getConnection(url, "postgres", "2301");
            Statement st = con.createStatement();

            int m = st.executeUpdate(sql);
            if(m == 1) {
                System.out.println("inserted successfully : " + sql);
            }else {
                System.out.println("insertion failed");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}