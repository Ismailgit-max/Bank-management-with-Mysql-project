package bankmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    public Connection c;
    public Statement s;

    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankmanagementsystem" +
                            "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                    "root",
                    "ismail"
            );

            s = c.createStatement();

            System.out.println("DB CONNECTED"); // 🔥 DEBUG LINE

        } catch (Exception e) {
            System.out.println("DB CONNECTION FAILED");
            e.printStackTrace(); // 🔥 MUST SEE ERROR
        }
    }
}
