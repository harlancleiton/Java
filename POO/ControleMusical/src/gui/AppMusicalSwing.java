/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author vncserver
 */
public class AppMusicalSwing {
  
    public static void main(String[] abc){
        JFrame frmPrincipal = new JFrame("Controle de Músicas");
        frmPrincipal.setSize(450, 350);
        frmPrincipal.setLayout(null);
        frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar barraMenu = new JMenuBar();
        JMenu mnuComponentes = new JMenu("Componentes");
        JMenu mnuBandas = new JMenu("Bandas");
        JMenu mnuMusicas = new JMenu("Musicas");
        
        JMenuItem mniCadComponentes = new JMenuItem("Cadastrar");
        JMenuItem mniCadBandas = new JMenuItem("Cadastrar");
        JMenuItem mniCadMusicas = new JMenuItem("Cadastrar");
        
        JMenuItem mniListComponentes = new JMenuItem("Listar");
        JMenuItem mniListBandas = new JMenuItem("Listar");
        JMenuItem mniListMusicas = new JMenuItem("Listar");
        
        mnuComponentes.add(mniCadComponentes);
        mnuComponentes.add(mniListComponentes);
        
        mnuBandas.add(mniCadBandas);
        mnuBandas.add(mniListBandas);
        
        mnuMusicas.add(mniCadMusicas);
        mnuMusicas.add(mniListMusicas);
        
        mniCadComponentes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastroComponentes cadComp = new CadastroComponentes();
                cadComp.setVisible(true);            
            }
        });
        
        mniListComponentes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListaComponentesBanda lstBanda = new ListaComponentesBanda();
                lstBanda.setVisible(true);
            }
        });
                

        mniListBandas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListaBandas lstBanda = new ListaBandas();
                lstBanda.setVisible(true);
            }
        });
        
        mniCadBandas.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CadastroBanda cadBanda = new CadastroBanda();
                cadBanda.setVisible(true);
            }
        });
        
        barraMenu.add(mnuComponentes);
        barraMenu.add(mnuBandas);
        barraMenu.add(mnuMusicas);
        
        frmPrincipal.setJMenuBar(barraMenu);        
        frmPrincipal.setVisible(true);
    }
}
