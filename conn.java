public class conn {

    package bank.management.system;

import java.sql.*;


public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try{
         //   C=forName(com.mysql.cj.jdbc.Driver);
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem" , "root" , "9798507427");
            s =c.createStatement();
        }
        catch(Exception e){
            System.out.print(e);
        }
    }   
}

    
}
