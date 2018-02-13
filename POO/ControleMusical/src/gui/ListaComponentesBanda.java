/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dados.BaseDados;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import principal.ComponenteBanda;

/**
 *
 * @author vncserver
 */
public class ListaComponentesBanda extends JFrame {
    public ListaComponentesBanda(){
        super();
        this.setSize(400, 450);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        JTable tbComponentes = new JTable();
        
        String[] nomesColunas = new String[] {"Nome", "Função", "Sexo"};
        DefaultTableModel model = new DefaultTableModel(nomesColunas, 0);
                
        for(ComponenteBanda c : BaseDados.componentes){  
            String[] linha = new String[]{c.getNome(), c.getFuncao(), ""+c.getSexo()};
            model.addRow(linha);
        }
        
        tbComponentes.setModel(model);

        JScrollPane jspTabela = new JScrollPane();
        jspTabela.setViewportView(tbComponentes);
        jspTabela.setBounds(10, 10, 350, 300);
        
        this.add(jspTabela);
    }
}
