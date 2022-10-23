package baocaodoan;

import java.sql.*;

public class StoredProcedures {
    public static void main(String[] args) {
        try {
            Connection con = ConnectJdbc.getJDBC();
            //Prepare to call stored procedure
            CallableStatement cst = con.prepareCall("{call deleteEmp(?)}");
            cst.setInt(1, 6);
            //execute the procedure
            cst.execute();
            con.close();
            System.out.println("CALL STORED PROCEDURE SUCCESSFULLY!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
