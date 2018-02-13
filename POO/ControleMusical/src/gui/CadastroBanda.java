/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dados.BaseDados;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import principal.Banda;
import principal.ComponenteBanda;

/**
 *
 * @author vncserver
 */
public class CadastroBanda extends JFrame {
    public CadastroBanda(){
        super();
        this.setSize(400, 450);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        JLabel lblNome = new JLabel("Nome:");
        JLabel lblDtNasc = new JLabel("Data Fund.:");
        JLabel lblComp = new JLabel("Componentes:");
        final JLabel lblMsg = new JLabel();
        
        lblNome.setBounds(10, 10, 80, 25);
        lblDtNasc.setBounds(10, 40, 80, 25);
        lblComp.setBounds(10, 70, 80, 25);  
        
        final JTextField txtNome = new JTextField();
        final JTextField txtDtFund = new JTextField();
        final JList lstComponentes = new JList(BaseDados.componentes.toArray());
        final JScrollPane scp = new JScrollPane();
        scp.setViewportView(lstComponentes);
       
        txtNome.setBounds(100, 10, 200, 25);
        txtDtFund.setBounds(100, 40, 80, 25);
        scp.setBounds(100, 70, 250, 120);  

        JButton btnSalvar = new JButton("Salvar");
        JButton btnCancelar = new JButton("Cancelar");
     
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!lstComponentes.isSelectionEmpty()){
                    Banda banda = new Banda();
                    banda.setNome(txtNome.getText());
                    banda.setDataFundacao(txtDtFund.getText());
                    
                    for(Object componente : lstComponentes.getSelectedValuesList()){
                        banda.adicionarComponente((ComponenteBanda)componente);
                    }

                    BaseDados.bandas.add(banda);
                    
                    lblMsg.setForeground(Color.BLACK);
                    lblMsg.setText(BaseDados.bandas.size() + " itens cadastrados!");
                }else{
                    lblMsg.setForeground(Color.RED);
                    lblMsg.setText("Selecione pelo menos 1 componente para formar a Banda!");
                }
            }
        });
        
        btnSalvar.setBounds(10, 200, 120, 30);
        btnCancelar.setBounds(160, 200, 120, 30);  
        lblMsg.setBounds(10, 250, 340, 25);  
        
        this.add(lblNome);
        this.add(lblDtNasc);
        this.add(lblComp);
        this.add(txtNome);
        this.add(txtDtFund);
        this.add(scp);
        this.add(btnSalvar);
        this.add(btnCancelar);             
        this.add(lblMsg);        
        
    }
}
