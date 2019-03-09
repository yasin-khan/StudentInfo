package studentinfo;


import java.sql.*;
import javax.swing.JOptionPane;

public class connection {

    public static Connection connectDb() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "second", "12345");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
