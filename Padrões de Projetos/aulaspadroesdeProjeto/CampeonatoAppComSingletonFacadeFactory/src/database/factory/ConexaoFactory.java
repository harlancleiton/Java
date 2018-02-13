/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package database.factory;

public class ConexaoFactory {


    public static Conexao obterConexao( String tipoConexao ) {
        if( tipoConexao == null )
            return null;
        else if( tipoConexao.equals("Post") ){
            System.out.println("tou aqui retornando oa coenxao de post");
            return ConexaoBDPost.getInstance();

        }
            
        
         else
             return null;
      }
 }