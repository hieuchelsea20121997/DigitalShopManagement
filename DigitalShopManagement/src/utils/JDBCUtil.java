package utils;

import java.sql.*;

public class JDBCUtil {

    public static Connection getConnection() {
        Connection connect = null;
        final String url = "jdbc:mySQL://localhost:3306/digitalshopmanagement";
        final String user = "root";
        final String password = "";
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            connect = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connect;
    }
    
    public static void closeConnection(Connection connect){
        try {
            if(connect != null){
                connect.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void printDatabaseInfo(Connection connect){
        try {
            if(connect != null){
                DatabaseMetaData metaData = connect.getMetaData();
                System.out.println(metaData.getDatabaseProductName());
                System.out.println(metaData.getDatabaseProductVersion());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
