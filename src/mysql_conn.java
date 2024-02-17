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
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + schema, "root", getPwd());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            return resultSet;
        } catch (SQLException e) {
            throw new src.DBException("Error running the query!");
        }
    }

    public static String getPwd() {
        return "";
    }

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager .getConnection("jdbc:mysql://localhost:3306/banking", "root", "replace_with_encryption");
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("select * from banking.users");
            while (result.next()) {
                System.out.println(result.getString("firstname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
