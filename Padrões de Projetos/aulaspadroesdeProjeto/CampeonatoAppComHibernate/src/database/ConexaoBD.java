package database;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Locale;



public class ConexaoBD implements IDatabase {

public static Connection con = null;
 

   public void carregarDriver(){
    try{   
       
        Class.forName( DRIVER );
       
   }
        catch ( ClassNotFoundException cnfe ) {
		System.out.println( "Driver JDBC n�o encontrado : " +
							   cnfe.getMessage() );
	}
    
		
		
   }
        
   public Connection getConexao(){
   
	
	try{
	/* Instanciando a classe do driver atrav�s do seu nome */
            
            //if (con==null)
             con = DriverManager.getConnection(CAMINHOBANCO, USUARIO, SENHA);
             return con;
            
	}
	  catch ( SQLException sqle ) {
		System.out.println( "Erro na conex�o ao Bando de Dados : " +
							            sqle.getMessage() );
	}
	    return null;
	}
	
	public void fecharConexao(){
            
          try {
                    con.close();
	
	   }
	    catch ( SQLException sqle ) {
		System.out.println( "Erro na conex�o ao Bando de Dados : " +
							            sqle.getMessage() );
	    }
            
            
	
		
	}	
		
		
	
		
	
   
}
