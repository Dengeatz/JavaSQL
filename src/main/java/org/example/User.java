package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;


public class User {
    int id;
    String name;
    String email;
    String password;
    Database db = new Database();
    User() {
        System.out.println("Зарегистрируйтесь в системе");
    }
    User(int id) {
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
}
