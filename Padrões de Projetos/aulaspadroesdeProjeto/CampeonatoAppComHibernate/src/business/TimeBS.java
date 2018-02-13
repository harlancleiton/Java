
package business;

import modelo.Time;
import dao.TimeDAO;
import java.util.*;
import net.sf.jasperreports.engine.JRResultSetDataSource;

/** 
 * Esta classe eh responsavel pela camada de negócio.
 * @author  Helder Aragao
 *
 */
 
public class TimeBS {
    
      
    TimeDAO timeDAO;
    
    public TimeBS()
    {
        timeDAO = new TimeDAO();
    }
    
    /*
  	 *validarDados eh responsável por fazer a validacao dos dados a serem cadastrados no sistema.
  	 *Verifica se o usu�rio preencheu todos os campos nao-nulos.
  	 *
  	 */      
    private void validarDados(Time time) throws Exception
    {
        
        if(time.getCodigo()==0)
        {
            throw new Exception("O campo Codigo e obrigatorio.");
        }
         if(time.getNome() == null || time.getNome().equals(""))
        {
            throw new Exception("O campo nome e obrigatorio.");
        }
        
        
        
        
    }
    
    
    /*
  	 *adicionar - responsavel por inserir os valores dos campos a serem cadastrados apas a validcao dos dados.
  	 *Invoca o m�todo adicionarAnaliseBacteriologica do DAO.
  	 */     
    public void adicionarTime(Time time) throws Exception
    {
       validarDados(time);
       timeDAO.adicionarTime(time);
    }
    
    
    /*
  	 *consultar � respons�vel por invocar o m�todo consultarAnaliseBacteriologica do DAO, ap�s a valida��o dos dados.
  	 *Esta consulta � feita utilizando apenas dois par�metros(codigo e data).
  	 */       
    public Iterator consultarTimes() throws Exception {
        return timeDAO.consultarTimes();
    }

    public Time consultarTime(int codigo) throws Exception {
        return timeDAO.consultarTime(codigo);
    }

    /*
  	 *editar � respons�vel por invocar o m�todo editarAnaliseBacteriologica do DAO, ap�s a valida��o dos dados.
  	 *
  	 */       
    public void editarTime(Time time) throws Exception
    {
       validarDados(time);
       timeDAO.editarTime(time);
    }
    
    /*
  	 *excluir � respons�vel por invocar o m�todo excluirAnaliseBacteriologica do DAO.
  	 *
  	 */       
    public void excluirTime(Time time) throws Exception
    {
       timeDAO.excluirTime(time);
    }

    public JRResultSetDataSource retornarRelatorio(){
       // return timeDAO.retornarRelatorio();
        return null;
    }
    
}
