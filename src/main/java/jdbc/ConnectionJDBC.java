package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) {
        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";

        try (Connection connection = DriverManager.getConnection(urlConnection, "root", "password");){
            System.out.println("SUCESSO!");
        } catch (Exception throwables) {
            throwables.printStackTrace();
            System.out.println("FALHA!");
        }

    }

}
