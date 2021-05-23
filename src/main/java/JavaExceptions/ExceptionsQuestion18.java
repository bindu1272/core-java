package main.java.JavaExceptions;
import java.sql.Connection;
import java.sql.DriverManager;

public class ExceptionsQuestion18 {
    public static void main(String args[]) {
        Connection c = null;
        try {
            String serverName = "localhost";
            String serverPort = "1521";
            String sid = "mySchema";
            String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":" + sid;
            String username = "username";
            String password = "password";
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully Connected to the database!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
