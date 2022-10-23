package baocaodoan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectJdbc {
    public static Connection getJDBC() {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "c##baocaodoan";
        String password = "password";
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
