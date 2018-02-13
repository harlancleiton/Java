

package dao;

import modelo.Time;
import database.*;
import java.util.*;
import java.sql.*;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import database.HibernateUtil;
 
public class TimeDAO {
    
   private ConexaoBD database = null;
   private PreparedStatement ps;
   private Connection con;
   private ResultSet rs;
    
    
    public TimeDAO()
    {  }
    
    /**
   * M�todo para adicionar os dados de ponto de coleta.
   *
   */
    public void adicionarTime(Time time) throws Exception
    {
         
        try
        {   Session sessao = null;
		Transaction transacao = null;

		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.save(time);
			transacao.commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possível inserir o contato. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de inserção. Mensagem: " + e.getMessage());
			}
		}
        }
        catch(Exception e)
        {    
            throw new Exception("Nao foi possivel adicionar um novo time. Time ja cadastrado ou houve algum erro. Erro de Sistema: " + e.getMessage());
        }
        finally
        {
          
        }         
       
    }

    	public void editarTime(Time time) {
		Session sessao = null;
		Transaction transacao = null;

		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.update(time);
			transacao.commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possível alterar o contato. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de atualização. Mensagem: " + e.getMessage());
			}
		}
	}

	public void excluirTime(Time time) {
		Session sessao = null;
		Transaction transacao = null;

		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.delete(time);
			transacao.commit();
		} catch (HibernateException e) {
			System.out.println("Não foi possível excluir o contato. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de exclusão. Mensagem: " + e.getMessage());
			}
		}
	}

	public Iterator consultarTimes() {
		Session sessao = null;
		Transaction transacao = null;
		Query consulta = null;
		List<Time> resultado = null;

		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			consulta = sessao.createQuery("from Time"); //nome da classe mapeada
			resultado = consulta.list();
			transacao.commit();
			return resultado.iterator();
		} catch (HibernateException e) {
			System.out.println("Não foi possível selecionar contatos. Erro: " + e.getMessage());
			throw new HibernateException(e);
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de consulta. Mensagem: " + e.getMessage());
			}
		}
	}

	public Time consultarTime(int codigo) {
		 Time time = null;
		Session sessao = null;
		Transaction transacao = null;
		Query consulta = null;

		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			consulta = sessao.createQuery("from Time where codigo = :parametro");
			consulta.setInteger("parametro", codigo);
			time = (Time) consulta.uniqueResult();
			transacao.commit();
			return time;
		} catch (HibernateException e) {
			System.out.println("Não foi possível buscar contato. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de buscar. Mensagem: " + e.getMessage());
			}
		}
		return time;
	}

    
       
}
