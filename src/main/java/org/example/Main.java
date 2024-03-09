package org.example;
import org.example.Database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    static User user = new User(5);

    public static void main(String[] args) {
        System.out.println(user.getName());
    }
}