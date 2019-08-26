/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia_de_aviacion;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author gabriel
 */
public class  Fuente {
    
    Connection s=null;
         
    protected void conectorBD(){
    
     
        try {
            
            
            Class.forName("com.mysql.jdbc.Driver");
            
             s=DriverManager.getConnection("jdbc:mysql://localhost:3306/Vuelos","root","iveth2020");
            
        } 
       
        
        catch (ClassNotFoundException ex) {
            
          System.out.println("NO SE PUDO UTILIZAR EL DRIVER");
          
        } catch (SQLException ex) {
              Logger.getLogger(Fuente.class.getName()).log(Level.SEVERE, null, ex);
          }
        
        
    }
    
    
    
        public Connection getS() {
        return s;
    
        
        
        }
    
        
        
    
    
        
        
  
    
    
    
    
    
    }
    
    
    
    

