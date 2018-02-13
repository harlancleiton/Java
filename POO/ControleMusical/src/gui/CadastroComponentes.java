/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dados.BaseDados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import principal.ComponenteBanda;

/**
 *
 * @author vncserver
 */
public class CadastroComponentes extends JFrame {
    public CadastroComponentes(){
        super();
        this.setSize(400, 240);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        JLabel lblNome = new JLabel("Nome:");
        JLabel lblSexo = new JLabel("Sexo:");
        JLabel lblDtNasc = new JLabel("Data Nasc.:");
        JLabel lblFuncao = new JLabel("Função:");
        final JLabel lblMsg = new JLabel();
        
        lblNome.setBounds(10, 10, 80, 25);
        lblSexo.setBounds(10, 40, 80, 25);
        lblDtNasc.setBounds(10, 70, 80, 25);
        lblFuncao.setBounds(10, 100, 80, 25);  
        
        final JTextField txtNome = new JTextField();
        final JRadioButton rdbMasc = new JRadioButton("Masculino");
        final JRadioButton rdbFem = new JRadioButton("Feminino");
        final JRadioButton rdbOut = new JRadioButton("Outros");
        final JTextField txtDtNasc = new JTextField();
        final String[] funcoes = {"Vocalista", "Guitarrista", "Baixista", "Baterista", "Holding", "Dono(a)", "Dançarino(a)"};
        final JComboBox cbFuncao = new JComboBox(funcoes);
        ButtonGroup bgSexo = new ButtonGroup();
        bgSexo.add(rdbOut);
        bgSexo.add(rdbMasc);
        bgSexo.add(rdbFem);
        
        txtNome.setBounds(100, 10, 200, 25);
        rdbMasc.setBounds(100, 40, 90, 25);
        rdbFem.setBounds(200, 40, 90, 25);
        rdbOut.setBounds(300, 40, 90, 25);
        txtDtNasc.setBounds(100, 70, 80, 25);
        cbFuncao.setBounds(100, 100, 120, 25);  

        txtDtNasc.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(!Character.isDigit(e.getKeyChar())){
                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
        
        JButton btnSalvar = new JButton("Salvar");
        JButton btnCancelar = new JButton("Cancelar");
     
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComponenteBanda comp = new ComponenteBanda();
                comp.setNome(txtNome.getText());
                if(rdbFem.isSelected()){
                    comp.setSexo('F');
                }else if(rdbMasc.isSelected()){
                    comp.setSexo('M');
                }else{
                    comp.setSexo('O');
                }
                comp.setDataNascimento(txtDtNasc.getText());
                comp.setFuncao(cbFuncao.getSelectedItem().toString());
                BaseDados.componentes.add(comp);
                lblMsg.setText(BaseDados.componentes.size() + " itens cadastrados!");
            }
        });
        
        btnSalvar.setBounds(10, 150, 120, 30);
        btnCancelar.setBounds(160, 150, 120, 30);  
        lblMsg.setBounds(10, 180, 300, 25);  
        
        this.add(lblNome);
        this.add(lblSexo);
        this.add(lblDtNasc);
        this.add(lblFuncao);
        this.add(txtNome);
        this.add(rdbMasc);
        this.add(rdbFem);
        this.add(rdbOut);
        this.add(txtDtNasc);
        this.add(cbFuncao);
        this.add(btnSalvar);
        this.add(btnCancelar);             
        this.add(lblMsg);
    }
}
