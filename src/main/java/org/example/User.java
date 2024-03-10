package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;


public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    Database db = new Database();
    public User() {

    }
    public User(int id) {
        try{
            ResultSet user_info = db.GetNameOfCurrentUser(id);
            this.id = id;
            while(user_info.next()) {
                this.name = user_info.getString("name");
                this.email = user_info.getString("email");
                this.password = user_info.getString("password");
            }
        } catch(SQLException e) {
            System.out.println(e);
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
}
