package AppControleMusical;

import BancoDeDados.Dados;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class AppControleMusical {
    public static void main(String[] args) {
        /* Definição da janela */
        JFrame janelaPrincipal=new JFrame("Controle Musical");
        janelaPrincipal.setSize(600, 350);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /* Definição da barra de menu */
        JMenuBar barMenu=new JMenuBar();
        JMenu mnbComponentes=new JMenu("Componentes");
        JMenu mnbBandas=new JMenu("Bandas");
        JMenu mnbMusicas=new JMenu("Músicas");
        barMenu.add(mnbComponentes);
        barMenu.add(mnbBandas);
        barMenu.add(mnbMusicas);
        janelaPrincipal.setJMenuBar(barMenu);
        /* Definição dos itens */
        JMenuItem mniCadastrarComponentes=new JMenuItem("Cadastrar");
        JMenuItem mniListarComponentes=new JMenuItem("Listar");
        JMenuItem mniCadastrarBandas=new JMenuItem("Cadastrar");
        JMenuItem mniListarBandas=new JMenuItem("Listar");
        JMenuItem mniCadastrarMusicas=new JMenuItem("Cadastrar");
        JMenuItem mniListarMusicas=new JMenuItem("Listar");
        mnbComponentes.add(mniCadastrarComponentes);
        mnbComponentes.add(mniListarComponentes);
        mnbBandas.add(mniCadastrarBandas);
        mnbBandas.add(mniListarBandas);
        mnbMusicas.add(mniCadastrarMusicas);
        mnbMusicas.add(mniListarMusicas);
        /* Criando evento */
        mniCadastrarComponentes.addActionListener((ActionEvent e) -> {
            Cadastrar janelaCadastro=new Cadastrar('1');
        });
        mniCadastrarBandas.addActionListener((ActionEvent e) -> {
            if(Dados.componentes.isEmpty()==true)
                JOptionPane.showMessageDialog(null,"Nenhum componente está cadastrado!");
            else{
                Cadastrar janelaCadastro=new Cadastrar('2');
        }});
        mniCadastrarMusicas.addActionListener((ActionEvent e) -> {
            if(Dados.componentes.isEmpty()==true)
                JOptionPane.showMessageDialog(null,"Nenhuma banda está cadastrado!");
            else{
            Cadastrar janelaCadastro=new Cadastrar('3');
        }});
        mniListarComponentes.addActionListener((ActionEvent e) -> {
           if (Dados.componentes.isEmpty())
               JOptionPane.showMessageDialog(null, "Nenhum componente está cadastrado!");
           else{
               Listar janelaListagem=new Listar('1');
        }});
        mniListarBandas.addActionListener((ActionEvent e)-> {
            if (Dados.bandas.isEmpty())
                JOptionPane.showMessageDialog(null,"Nenhuma banda está cadastrado!");
            else{
                Listar janelaListagem=new Listar('2');
        }});
        mniListarMusicas.addActionListener((ActionEvent e) -> {
           if (Dados.bandas.isEmpty())
               JOptionPane.showMessageDialog(null,"Nenhuma música está cadastrada!");
           else{
               Listar janelaListagem=new Listar('3');
        }});
        /* Por último */
        janelaPrincipal.setVisible(true);
    }
}