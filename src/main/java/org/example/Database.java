package org.example;
import javax.xml.transform.Result;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.Statement;
public class Database {
    Connection con;
    ResultSet resultSet;
    Statement statement;
    Database() {
        try {
            String url = "jdbc:mysql://localhost:3306/users";
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection(url, "root", "your_password");
            System.out.println("Все удачно");
            this.statement = con.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
            ;
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            ;
        }
    }
    public ResultSet GetNameOfCurrentUser(int id){
        try {
            resultSet = statement.executeQuery(String.format("SELECT * FROM user WHERE iduser = %d", id));
        } catch(SQLException e) {
            System.out.println(e);
        }
        return resultSet;
    }
    public ResultSet getName() throws SQLException {
        try {
            resultSet = statement.executeQuery("SELECT * FROM user");
        } catch(SQLException e) {
            System.out.println(e);
        }
        return resultSet;
    }

    public void AddUser(String name, String email, String pass) throws SQLException {
        try {
            statement.execute(String.format("INSERT INTO user (name, email, password) VALUES (\"%s\", \"%s\", \"%s\")",name, email, pass));
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}
