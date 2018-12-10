
package biomedica;

import java.sql.*;

public class Conexion {
    Connection cone;
    public Connection CreateConnection(){
       try{ 
        Class.forName("com.mysql.jdbc.Driver");
        
        cone= DriverManager.getConnection("jdbc:mysql://localhost/biomedica","root","");
      }
      catch(Exception e){
        System.out.println(e.getMessage()); 
      }
      return cone;
    
    }
    Statement createStatement(){
    throw new UnsupportedOperationException(" No soportado ");
    }
}
