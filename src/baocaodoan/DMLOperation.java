package baocaodoan;

import java.sql.*;
public class DMLOperation {
    public static void insert(){
        try {
            Connection con = ConnectJdbc.getJDBC();
            //Prepare to insert new Employee in the EMPLOYEE table
            String SQL = "INSERT INTO EMPLOYEE(EMP_ID, FIRST_NAME, LAST_NAME, GENDER, PHONE, ADDRESS, SALARY, ROLE)"
                    + "VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, 6);
            ps.setString(2, "Ho Bao");
            ps.setString(3, "An");
            ps.setString(4, "Male");
            ps.setString(5, "0981831239");
            ps.setString(6, "Ktx Khu A");
            ps.setInt(7, 5000000);
            ps.setString(8, "Guard Security");
            //Do the insertion
            ps.executeUpdate();
            con.close();
            System.out.println("INSERTED");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //execute inserting function
        insert();
    }
}
