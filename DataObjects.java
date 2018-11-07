class Movies
{
    int     mid;
    int     copiesLeft;
    String  title;
    String  releaseDate;
    String  genre;
    int     awards;
    
    public Movies(ResultSet resultSet)
    {
        if(!resultSet.next()) 
        {
               JOptionPane.showMessageDialog(null,"No records found!");
               return; 
        }
        else
        
    }
    
}