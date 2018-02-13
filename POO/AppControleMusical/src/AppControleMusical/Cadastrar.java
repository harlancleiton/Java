package AppControleMusical;

import BancoDeDados.Musicas;
import BancoDeDados.Data;
import BancoDeDados.Componentes;
import BancoDeDados.Bandas;
import BancoDeDados.Dados;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;

public class Cadastrar extends JFrame{
    public Cadastrar(char action){
        super();
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        /* Definição dos botoes */
        JButton btnSalvar=new JButton("Salvar");
        JButton btnCancelar=new JButton("Cancelar");
        this.add(btnSalvar);
        this.add(btnCancelar);
        /* Criando evento */
        btnCancelar.addActionListener((ActionEvent e) -> {
            dispose();
        });
        if (action=='1'){
            this.setSize(500, 250);
            this.setTitle("Cadastro de Componentes");
            /* Finalizando definição dos botões */
            btnSalvar.setBounds(10, 170, 180, 30);
            btnCancelar.setBounds(295, 170, 180, 30);
            /* Definilçao das label */
            JLabel lblNome=new JLabel("Nome:");
            JLabel lblDataNascimento=new JLabel("Data de nascimento:");
            JLabel lblSexo=new JLabel("Sexo:");
            JLabel lblFuncao=new JLabel("Função:");
            lblNome.setBounds(10, 20, 150, 25);
            lblDataNascimento.setBounds(10, 50, 150, 25);
            lblSexo.setBounds(10, 80, 150, 25);
            lblFuncao.setBounds(10, 110, 150, 25);
            this.add(lblNome);
            this.add(lblDataNascimento);
            this.add(lblSexo);
            this.add(lblFuncao);
            /* Definição das caixas de texto */
            JTextField txtNome=new JTextField();
            JTextField txtDia=new JTextField();
            JTextField txtMes=new JTextField();
            JTextField txtAno=new JTextField();
            txtNome.setBounds(180, 20, 250, 25);
            txtDia.setBounds(180, 50, 20, 25);
            txtMes.setBounds(200, 50, 20, 25);
            txtAno.setBounds(220, 50, 40, 25);
            //txtSexo.setBounds(130, 80, 100, 25);
            this.add(txtNome);
            this.add(txtDia);
            this.add(txtMes);
            this.add(txtAno);
            /* Definição dos botões de seleção */
            JRadioButton jrbMasculino=new JRadioButton("Masculino");
            JRadioButton jrbFeminino=new JRadioButton("Feminino");
            jrbMasculino.setBounds(180, 80, 100, 25);
            jrbFeminino.setBounds(280, 80, 100, 25);
            this.add(jrbMasculino);
            this.add(jrbFeminino);
            ButtonGroup bgpSexo=new ButtonGroup();
            bgpSexo.add(jrbMasculino);
            bgpSexo.add(jrbFeminino);
            /* Definição da caixa de seleção */
            String[] funcoes={"Vocalista","Guitarra","Baixo","Bateria","Dançarino(a)"};
            JComboBox jcbFuncoes=new JComboBox(funcoes);
            jcbFuncoes.setBounds(180, 110, 180, 25);
            this.add(jcbFuncoes);
            /* Criando evento */
            btnSalvar.addActionListener((ActionEvent e) -> {
                Componentes componente=new Componentes();
                componente.setNome(txtNome.getText());
                if(jrbMasculino.isSelected())
                    componente.setSexo("Masculino");
                else
                    componente.setSexo("Feminino");
                componente.setDataNascimento(new Data(Integer.parseInt(txtDia.getText()),Integer.parseInt(txtMes.getText()),Integer.parseInt(txtAno.getText())));
                componente.setFuncao((String)jcbFuncoes.getSelectedItem());
                Dados.componentes.add(componente);
                JOptionPane.showMessageDialog(null, "Componente cadastrado com sucesso!");
                dispose();
            });
        }
        if (action=='2'){
            this.setSize(400, 400);
            this.setTitle("Cadastro de Bandas");
            /* Finalizando definição dos botões */
            btnSalvar.setBounds(10, 320, 180, 30);
            btnCancelar.setBounds(195, 320, 180, 30);
            /* Definilçao das label */
            JLabel lblNome=new JLabel("Nome:");
            JLabel lblDataFundacao=new JLabel("Data de fundação:");
            JLabel lblComponentes=new JLabel("Componentes:");
            JLabel lblDica=new JLabel("Dica: para selecionar mais de um componente mantenha a tecla ctrl pressionada.");
            lblNome.setBounds(10, 20, 80, 25);
            lblDataFundacao.setBounds(10, 50, 110, 25);
            lblComponentes.setBounds(10, 80, 110, 25);
            lblDica.setBounds(130, 180, 200, 100);
            this.add(lblNome);
            this.add(lblDataFundacao);
            this.add(lblComponentes);
            //this.add(lblDica);
            /* Definição das caixas de texto */
            JTextField txtNome=new JTextField();
            JTextField txtDia=new JTextField();
            JTextField txtMes=new JTextField();
            JTextField txtAno=new JTextField();
            txtNome.setBounds(130, 20, 250, 25);
            txtDia.setBounds(130, 50, 20, 25);
            txtMes.setBounds(150, 50, 20, 25);
            txtAno.setBounds(170, 50, 40, 25);
            this.add(txtNome);
            this.add(txtDia);
            this.add(txtMes);
            this.add(txtAno);
            /* Definição da lista de componentes */
            JList listaComponentes=new JList(Dados.componentes.toArray());
            JScrollPane scpListaComponentes=new JScrollPane();
            scpListaComponentes.setViewportView(listaComponentes);
            scpListaComponentes.setBounds(130, 80, 250, 100);
            this.add(scpListaComponentes);
            /* Criando evento */
            btnSalvar.addActionListener((ActionEvent e) -> {
                if(listaComponentes.isSelectionEmpty()!=true){
                    Bandas banda=new Bandas();
                    banda.setNome(txtNome.getText());
                    banda.setDataFundacao(new Data(Integer.parseInt(txtDia.getText()),Integer.parseInt(txtMes.getText()),Integer.parseInt(txtAno.getText())));
                    for(Object componentes:listaComponentes.getSelectedValuesList())
                        banda.adicionarComponente((Componentes)componentes);
                    Dados.bandas.add(banda);
                    JOptionPane.showMessageDialog(null, "Banda cadastrada com sucesso!");
                    dispose();
                }
                else
                    JOptionPane.showMessageDialog(null, "Nenhum componente selecionado!");
            });
        }
        else if(action=='3'){
            this.setSize(400, 350);
            this.setTitle("Cadastro de Músicas");
            /* Finalizando definição dos botões */
            btnSalvar.setBounds(10, 260, 180, 30);
            btnCancelar.setBounds(195, 260, 180, 30);
            /* Definilçao das label */
            JLabel lblNome=new JLabel("Nome:");
            JLabel lblAno=new JLabel("Ano:");
            JLabel lblBanda=new JLabel("Banda:");
            JLabel lblDuracao=new JLabel("Duração:");
            lblNome.setBounds(10, 20, 80, 25);
            lblAno.setBounds(10, 50, 110, 25);
            lblDuracao.setBounds(10, 80, 80, 25);
            lblBanda.setBounds(10, 110, 110, 25);
            this.add(lblNome);
            this.add(lblAno);
            this.add(lblDuracao);
            this.add(lblBanda);
            /* Definição das caixas de texto */
            JTextField txtNome=new JTextField();
            JTextField txtAno=new JTextField();
            JTextField txtDuracaoMin=new JTextField();
            JTextField txtDuracaoSeg=new JTextField();
            txtNome.setBounds(130, 20, 250, 25);
            txtAno.setBounds(130, 50, 40, 25);
            txtDuracaoMin.setBounds(130, 80, 25, 25);
            txtDuracaoSeg.setBounds(155, 80, 25, 25);
            this.add(txtNome);
            this.add(txtAno);
            this.add(txtDuracaoMin);
            this.add(txtDuracaoSeg);
            /* Definição da lista de bandas */
            JList listaBandas=new JList(Dados.bandas.toArray());
            JScrollPane scpListaBandas=new JScrollPane();
            scpListaBandas.setViewportView(listaBandas);
            scpListaBandas.setBounds(130, 110, 250, 125);
            //this.add(scpListaBandas);
            /* Definição da lista de bandas */
            JComboBox jcbNomeDasBandas=new JComboBox();
            for(Bandas banda:Dados.bandas)
                jcbNomeDasBandas.addItem(banda);
            jcbNomeDasBandas.setBounds(130, 110, 250, 25);
            this.add(jcbNomeDasBandas);
            /* Criando evento */
            btnSalvar.addActionListener((ActionEvent e) -> {
                    Musicas musica=new Musicas();
                    musica.setNome(txtNome.getText());
                    musica.setAno(Integer.parseInt(txtAno.getText()));
                    musica.setDuracaoMin(Integer.parseInt(txtDuracaoMin.getText()));
                    musica.setDuracaoSeg(Integer.parseInt(txtDuracaoSeg.getText()));
                    musica.setBanda((Bandas)jcbNomeDasBandas.getSelectedItem());
                    Dados.musicas.add(musica);
                    JOptionPane.showMessageDialog(null, "Música cadastrada com sucesso!");
                    dispose();
            });
        } 
        /* Por último */
        this.setVisible(true);
    }
}