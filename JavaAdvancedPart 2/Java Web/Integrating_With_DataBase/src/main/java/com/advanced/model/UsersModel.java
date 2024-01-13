package com.advanced.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.advanced.config.DatabaseConfig;
import com.advanced.entity.User;

public class UsersModel {

    public List<User> listUser() {
        List<User> listUsers = new ArrayList<User>();

        // Step 1: Connection object init.
        Connection connect = DatabaseConfig.getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        // Step 2: Create the DB query.
        String query = "SELECT * FROM users"; // Fix: Corrected the SQL query

        try {
            stmt = connect.createStatement();

            // Step 3: Execution of Statement.
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                listUsers.add(new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("email")));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            // Step 4: Close resources in the finally block to ensure they are always closed
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());
                e.printStackTrace();
            }
            DatabaseConfig.closeConnection(connect);
        }

        return listUsers;
    }
}
