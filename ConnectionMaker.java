import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


class ConnectionMaker
{
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/Movie4?useLegacyDatetimeCode=false&serverTimezone=America/New_York&autoReconnect=true&useSSL=false";
    private String uname = "root";
    private String pass = "Qw123456789?";
    private Connection connection;

    public ConnectionMaker()
    {
        try 
        {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, uname, pass);
        }
        catch(ClassNotFoundException ex) 
        {
            JOptionPane.showMessageDialog(null, "Failed to load JDBC driver!");
            System.exit(1);
        }
        catch(SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Access denied!");
            return;
        }
    }
    public Connection getConnection()
    {
        return connection;
    }  
    public void closeConnection()throws Exception
    {
     connection.close();   
    }
}
