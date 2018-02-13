/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package database.factory;

import java.sql.Connection;

public abstract class Conexao {
  
     public abstract Connection getConexao();
         
}