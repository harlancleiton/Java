/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dados.BaseDados;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import principal.Banda;
import principal.ComponenteBanda;

/**
 *
 * @author vncserver
 */
public class ListaBandas extends JFrame {
    public ListaBandas(){
        super();
        this.setSize(400, 450);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        final JTable tbBandas = new JTable();
        
        String[] nomesColunas = new String[] {"Nome", "Data Fundação"};
        DefaultTableModel model = new DefaultTableModel(nomesColunas, 0);
       
        for(Banda b : BaseDados.bandas){  
            String[] linha = new String[]{b.getNome(), b.getDataFundacao()};
            model.addRow(linha);
        }
        
        tbBandas.setModel(model);

        final JTextArea txaComponentes = new JTextArea(7, 20);
        txaComponentes.setBounds(10, 330, 80, 200);

        tbBandas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt){
                int linha = tbBandas.getSelectedRow();
                String nomeBandaClicada = tbBandas.getValueAt(linha, 0).toString();
                for(Banda b : BaseDados.bandas){
                    if(b.getNome().equals(nomeBandaClicada)){
                        String nomesComponentes = "";
                        for(ComponenteBanda c : b.getComponentes()){
                            nomesComponentes += c.getNome() + "\n";
                        }
                        txaComponentes.setText(nomesComponentes);
                    }
                } 
            }
        });
        
        JScrollPane jspTabela = new JScrollPane();
        jspTabela.setViewportView(tbBandas);
        jspTabela.setBounds(10, 10, 350, 300);
        
        
        this.add(jspTabela);
        this.add(txaComponentes);
    }
}
