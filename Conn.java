package university.management.system;

import java.sql.*; // for connection c

public class Conn {
    
    Connection c;
    Statement s;

    
    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //for registraion database
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem" , "root" , "vinayak2324");
            s = c.createStatement();
            
        } catch(Exception e) {
            e.printStackTrace();  //for getting info which exception is comin
        }
    } 
    
    public static void main(String[] args) {
        
    }
}
