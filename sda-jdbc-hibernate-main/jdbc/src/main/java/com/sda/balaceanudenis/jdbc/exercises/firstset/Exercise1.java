package com.sda.balaceanudenis.jdbc.exercises.firstset;

import com.sda.balaceanudenis.jdbc.utils.DatabaseConnectionUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Exercise1 {
    public static void main(String[] args) {
        query2();
    }

    public static void query() {
        try {
            Connection connection = DatabaseConnectionUtils.getConnection(DatabaseConnectionUtils.HUMAN_RESOURCES_DATABASE);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT projectId, description FROM projects");
            while (resultSet.next()) {
                Integer projectId = resultSet.getInt("projectId");
                String description = resultSet.getString("description");

                System.out.println(projectId + " " + description);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
e.printStackTrace();
        }
    }



        public static void query2() {
            try {
                Connection connection = DatabaseConnectionUtils.getConnection(DatabaseConnectionUtils.HUMAN_RESOURCES_DATABASE);

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT employeeId, firstName, lastName, dateOfBirth FROM employees");
                while (resultSet.next()) {
                    Integer employeeId = resultSet.getInt("employeeId");
                    String firstName = resultSet.getString("firstName");
                    String lastName = resultSet.getString("lastName");
                    Date  dateOfBirth = resultSet.getDate("dateOfBirth");

                    System.out.println(employeeId + " " + firstName + " " + lastName + " " + dateOfBirth);
                }

                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


