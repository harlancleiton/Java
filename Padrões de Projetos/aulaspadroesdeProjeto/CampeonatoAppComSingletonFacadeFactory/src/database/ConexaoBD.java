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

  private static ConexaoBD conexaoBD = null;
  public static Connection con = null;
 
 private ConexaoBD(){   }


      public static ConexaoBD getInstance(){

            if(conexaoBD == null)
               conexaoBD = new ConexaoBD();

            return conexaoBD;

      }

        
   public Connection getConexao(){
   
	
	try{
	/* Instanciando a classe do driver atrav�s do seu nome */
             Class.forName( DRIVER );
            if (con==null){
             con = DriverManager.getConnection(CAMINHOBANCO, USUARIO, SENHA);
            
            }
            
	}
	  catch ( Exception sqle ) {
		System.out.println( "Erro na conex�o ao Bando de Dados : " +
							            sqle.getMessage() );
	}
	     return con;
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
