/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package database.factory;


import database.IDatabase;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Locale;



public class ConexaoBDPost extends Conexao implements IDatabase {

  private static ConexaoBDPost conexaoBDpost = null;
  public static Connection con = null;

 private ConexaoBDPost(){   }


      public static ConexaoBDPost getInstance(){

            if(conexaoBDpost == null)
               conexaoBDpost = new ConexaoBDPost();

            return conexaoBDpost;

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
