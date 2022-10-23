package baocaodoan;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) {
        
        try {
            //Connect to the Oracle JDBC
            Connection con = ConnectJdbc.getJDBC();
            //Query the employee name
            Statement stmt = con.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT LAST_NAME FROM EMPLOYEE WHERE EMP_ID = 1");
            //Print the name out
            while(rset.next()){
                System.out.println(rset.getString("last_name"));
            }
            //Close the result set, statement, and the connection
            con.close();
            rset.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
