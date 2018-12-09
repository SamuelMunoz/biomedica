
package biomedica;

import java.sql.*;

public class conectate {
    Connection cone;
    public Connection conexion(){
       try{ 
        Class.forName("com.mysql.jdbc.Driver");
        
        cone= DriverManager.getConnection("jdbc:mysql://localhost/biomedica","root","7449");
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
