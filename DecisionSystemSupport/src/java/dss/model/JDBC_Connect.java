package dss.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect {

    private final String url = "jdbc:mysql://localhost:3306/dssdatabse?characterEncoding=UTF8";
    private final String username = "root";
    private final String password = "1234";

    private Connection connection = null;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                connection = DriverManager.getConnection(url, username, password);
//              System.out.println("Kết nối thành công");
            } catch (SQLException e) {
                System.out.println("Có lỗi rồi, chi tiết : " + e.getMessage());
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Load driver kết nối không thành công");
        }
        
        return connection;
    }
    
    public void closeConnection() throws SQLException{
        connection.close();
    }
}
