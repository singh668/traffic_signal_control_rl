package src;
//* Need to get password encrpytion functionality! */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysql_conn {
    public static ResultSet getMYSQL(String schema, String query) throws DBException {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + schema, "root", "encrypted_password");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            return resultSet;
        } catch (SQLException e) {
            throw new src.DBException("Error running the query!");
        }
    }

    public static String getMYSQLPwd() {
        return "";
    }

    public static void main(String[] args) {
        try {
            ResultSet result = getMYSQL("banking", "select * from users");
            while (result.next()) {
                System.out.println(result.getString("firstname"));
            } 
        } catch (Exception e) {
                e.printStackTrace();
            }
        
    }
}
