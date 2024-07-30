package org.example;

import org.example.to_do.model.User;
import org.example.to_do.repository.UserRepository;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();

//        System.out.println(userRepository.save(new User("qwer", "salom", "jamshid")));

        ArrayList<User> all = userRepository.getAll();
        System.out.println(all);

        System.out.println(userRepository.findById(all.get(0).getId()).get());
//        dbConnection();
    }

    private static void dbConnection() {
        //        "jdbc:postgresql://localhost:5432/db_name"
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/to_do",
                    "postgres",
                    "8463"
            );


            System.out.println("connection.getSchema() = " + connection.getSchema());
//            get info from db
//
//            PreparedStatement preparedStatement = connection.prepareStatement("select * from users");
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                System.out.print(resultSet.getLong("id") + "\t");
//                System.out.print(resultSet.getString("name") + "\t");
//                System.out.print(resultSet.getString("username") + "\t");
//                System.out.print(resultSet.getString("password") + "\n");
//            }

            PreparedStatement insertStatement =
                    connection.prepareStatement(
                            "insert into users(name, username, password) values('Jamshid', 'JE', 'jksdjfakjs')");
            boolean execute = insertStatement.execute();


            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}