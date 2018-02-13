package AppControleMusical;

import BancoDeDados.Bandas;
import BancoDeDados.Componentes;
import BancoDeDados.Dados;
import BancoDeDados.Musicas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Listar extends JFrame{
    public Listar (char action){
        super();
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        if (action=='1'){
            String[] colunas=new String[]{"Nome","Função","Sexo"};
            this.setSize(500, 500);
            this.setTitle("Lista de componentes");
            /* Definição da tabela */
            DefaultTableModel modeloTabela=new DefaultTableModel(colunas,0);
            JTable tabelaComponentes=new JTable();
            for(Componentes componente:Dados.componentes){
                String[] linhaTabela=new String[]{componente.getNome(),componente.getFuncao(),componente.getSexo()};
                modeloTabela.addRow(linhaTabela);
            }
            tabelaComponentes.setModel(modeloTabela);
            JScrollPane jspTabelaComponentes=new JScrollPane();
            jspTabelaComponentes.setViewportView(tabelaComponentes);
            jspTabelaComponentes.setBounds(10, 10, 470, 445);
            this.add(jspTabelaComponentes);
        }
        else if(action=='2'){
            String[] colunas=new String[]{"Nome","Data de Fundação"};
            this.setSize(500, 500);
            this.setTitle("Lista de bandas");
            /* Definição da tabela */
            DefaultTableModel modeloTabela=new DefaultTableModel(colunas,0);
            JTable tabelaBandas=new JTable();
            for(Bandas banda:Dados.bandas){
                String[] linhaTabela=new String[]{banda.getNome(),banda.imprimirData()};
                modeloTabela.addRow(linhaTabela);
            }
            tabelaBandas.setModel(modeloTabela);
            JScrollPane jspTabelaBandas=new JScrollPane();
            jspTabelaBandas.setViewportView(tabelaBandas);
            jspTabelaBandas.setBounds(10, 10, 470, 445);
            this.add(jspTabelaBandas);
        }
        else if(action=='3'){
            String[] colunas=new String[]{"Nome","Banda","Ano"};
            this.setSize(500, 500);
            this.setTitle("Lista de músicas");
            /* Definição da tabela */
            DefaultTableModel modeloTabela=new DefaultTableModel(colunas,0);
            JTable tabelaBandas=new JTable();
            for(Musicas musica:Dados.musicas){
                String[] linhaTabela=new String[]{musica.getNome(),musica.getBanda().getNome(),Integer.toString(musica.getAno())};
                modeloTabela.addRow(linhaTabela);
            }
            tabelaBandas.setModel(modeloTabela);
            JScrollPane jspTabelaMusicas=new JScrollPane();
            jspTabelaMusicas.setViewportView(tabelaBandas);
            jspTabelaMusicas.setBounds(10, 10, 470, 245);
            /* Definição das informações das musicas */
            JScrollPane jspInformacoesBanda=new JScrollPane();
            jspInformacoesBanda.setBounds(10, 260, 470, 200);
            this.add(jspInformacoesBanda);
            JTextArea jtaInformacoes=new JTextArea();
            jtaInformacoes.setSize(470, 200);
            jspInformacoesBanda.setViewportView(jtaInformacoes);
            tabelaBandas.addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent evt){
                    String aux = null, aux2 = null;
                    for(Bandas banda:Dados.bandas)
                        if(modeloTabela.getValueAt(tabelaBandas.getSelectedRow(),1).toString().equals(banda.getNome())){
                            aux=banda.getComponentes().toString();
                            aux2=banda.getNome();
                        }
                    jtaInformacoes.setText(aux2+"\n"+aux);
            }});
            this.add(jspTabelaMusicas);
        }
        this.setVisible(true);
    }
}