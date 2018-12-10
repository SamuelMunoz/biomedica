
package biomedica;

import java.sql.*;

public class Conexion {
    Connection conn;
    public Connection CreateConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/biomedica","root","");
        }
        catch(Exception e) {
            System.out.println(e.getMessage()); 
        }
        return conn;
    }
    
    Statement createStatement() {
        throw new UnsupportedOperationException(" No soportado ");
    }
}
