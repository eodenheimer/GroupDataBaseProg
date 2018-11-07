import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*; 
import java.util.Calendar;
import java.io.*;






//Searcher class used to run queries and return a DataObject that can be used to display into a table of results

//Movies function is passed searchBy(genre, director,title...) a searchTerm , a boolean for search by award winning , and a boolean for search by prevoisly rented.

//classes uses by front end to take input from fields and display results into a table



class Searcher
{
    ConnectionMaker connectionM;
    Statement statement;
    String query;
    ResultSet resultSet;

    public Searcher()
    {}
    public void MoviesQuery(String searchBy, String searchTerm, boolean awardWinning,boolean notPrevoiuslyRented)
    {
       
        
        
        
        
        
        
        
        
        
        query = "SELECT * FROM Movies M Where M."+searchBy+" = '"+ searchTerm+"'";
            
        connectionM =  new ConnectionMaker();
        try
        {
            statement = connectionM.getConnection().createStatement();
            resultSet = statement.executeQuery(query);

            // new MoviesDataObject(ResultSet);

            statement.close();
            connectionM.closeConnection();
            System.out.println("query executed and connection closed succesfully");

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            // should return MoviesDataObject;   
        }
        catch(Exception e)
        {
        
            System.out.println("a problem has occured in Searchers Movies Function");
            e.printStackTrace();
        
        }
    }
    
    public static void main(String args[])
    {
        Searcher s = new Searcher();
        s.Movies("genre","TEST2",false,false );
        
        
    }
    public void Games()
    {
    
    }
    
    
}
class Deleter
{
    public Deleter()
    {
        
        
    }
    
    
    
    
    
}
class Inserter
{
    public Inserter()
    {
        
        
        
        
    }
    
    
    
    
    
}