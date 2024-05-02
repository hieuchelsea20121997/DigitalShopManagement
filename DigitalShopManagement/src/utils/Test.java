package utils;

import java.sql.Connection;

public class Test {

    public static void main(String[] args) {
        
        // Test DB connection
        Connection connect = JDBCUtil.getConnection();
        if(connect != null){
            System.out.println("Connected to database!");
            JDBCUtil.printDatabaseInfo(connect);
            JDBCUtil.closeConnection(connect);
        } else{
            System.out.println("Cannot connect to database!");
        }
        
        // Text email validation
        String email = "123gmail@gmail.com";
        if(CommonUtil.isValid(email)){
            System.out.println("valid email!");
        } else{
            System.out.println("invalid email!");
        }
    }
    
}
