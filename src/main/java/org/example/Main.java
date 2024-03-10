package org.example;
import org.example.Database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    static User user = new User(5);

    public static void main(String[] args) {
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Id: " + user.getId());
    }
}