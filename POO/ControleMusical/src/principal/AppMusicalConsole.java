/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vncserver
 */
public class AppMusicalConsole {
    // ArrayLists que funcionam como uma base de dados temporaria
    static ArrayList<ComponenteBanda> componentes = new ArrayList<>();
    static ArrayList<Banda> bandas = new ArrayList<>();
    static ArrayList<Musica> musicas = new ArrayList<>();
    
    public static void main(String[] abc){
        int escolha = gerarMenu();
        while(escolha != 0){
            switch(escolha){
                case 1: 
                    cadastrarComponente();
                    break;
                case 2:
                    cadastrarBanda();
                    break;
                case 3:
                    cadastrarMusica();
                    break;
                default:
                    System.out.println("Tchau!");                    
                    break;
            }
            escolha = gerarMenu();
        }
        //JOptionPane.showMessageDialog(null, obterComponentes());
        //JOptionPane.showMessageDialog(null, obterBandas());
        JOptionPane.showMessageDialog(null, obterMusicas());
    }
    
    public static int gerarMenu(){
        int retorno = 0;
        String msg = "Digite:\n" + 
                "1 - Cadastrar Componente \n" + 
                "2 - Cadastrar Banda \n" +
                "3 - Cadastrar Música \n" + 
                "0 - Sair";
        retorno = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return retorno;
    }

    /**
     * Lista os componentes de banda cadastrados no ArrayList componentes
     */
    private static String obterComponentes() {
        String listaComponentes = "";
        int contador = 0;
        for(ComponenteBanda c : componentes){
            contador++;
            listaComponentes += contador + " - " + c.getNome() + " - " + c.getFuncao() + "\n";
        }
        return listaComponentes;
    }
    
    private static String obterBandas() {
        String listaBandas = "";
        int contador = 0;
        for(Banda b : bandas){
            contador++;
            listaBandas += contador + " - " + b.getNome() + "\n";
            for(ComponenteBanda c : b.getComponentes()){
                listaBandas += "\t" + c.getNome() + "-" + c.getFuncao() + "\n";
            }
            listaBandas += "\n";
        }
        return listaBandas;
    }    
    
    private static String obterMusicas() {
        String listaMusicas = "";
        int contador = 0;
        for(Musica m : musicas){
            contador++;
            listaMusicas += contador + " - " + m.getNome()+"."+m.getFormato() + " - " + m.getBanda().getNome() + " - " + m.getGenero() + "\n";
        }
        return listaMusicas;
    }    
    
    /**
     * Solicita os dados para cadastra de um novo componente de banda
     */
    private static void cadastrarComponente() {
        ComponenteBanda componente = new ComponenteBanda();
        componente.setNome(JOptionPane.showInputDialog("Digite o nome:"));
        componente.setDataNascimento(JOptionPane.showInputDialog("Digite a Data de Nascimento:"));
        componente.setSexo(JOptionPane.showInputDialog("Digite o sexo (M/F):").toCharArray()[0]);
        componente.setFuncao(JOptionPane.showInputDialog("Digite a Função do Componente na Banda:"));
        componentes.add(componente);
    }

    private static void cadastrarBanda() {
        if(componentes.isEmpty()){
            JOptionPane.showMessageDialog(null, "É necessário cadastrar pelo menos 1 componente para se cadastrar uma Banda");
        }else{
            // Preenchendo dados básicos da Banda
            Banda banda = new Banda();
            banda.setNome(JOptionPane.showInputDialog("Digite o nome:"));
            banda.setDataFundacao(JOptionPane.showInputDialog("Digite a data de fundação:"));
            
            String componentesEscolhidos = JOptionPane.showInputDialog("Escolha os componentes da banda, digitando seus números separados por ; \n" + obterComponentes());
            // Ex: componentesEscolhidos = 1;3
            String[] componentesEscolhidosArr = componentesEscolhidos.split(";");
            // Ex: componentesEscolhidosArr = |"1"|"3"|
            for(int i=0; i<componentesEscolhidosArr.length; i++){
                int posicao = Integer.parseInt(componentesEscolhidosArr[i]) - 1;
                banda.adicionarComponente(componentes.get(posicao));
            }
            bandas.add(banda);
        }
    }

    private static void cadastrarMusica() {
        if(bandas.isEmpty()){
            JOptionPane.showMessageDialog(null, "É necessário cadastrar pelo menos 1 banda para se cadastrar uma Música");
        }else{
            Musica musica = new Musica();
            musica.setNome(JOptionPane.showInputDialog("Digite o nome:"));
            musica.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:")));
            musica.setDuracao(JOptionPane.showInputDialog("Digite a duração da música hh:mm:ss :"));
            musica.setFormato(JOptionPane.showInputDialog("Digite o formato:"));
            musica.setGenero(JOptionPane.showInputDialog("Digite o gênero:"));
            musica.setGravadora(JOptionPane.showInputDialog("Digite a gravadora:"));
            
            String bandaEscolhida = JOptionPane.showInputDialog("Escolha a banda, digitando seu número: \n" + obterBandas());            
            int posicao = Integer.parseInt(bandaEscolhida) - 1;
            musica.setBanda(bandas.get(posicao));  
            musicas.add(musica);
        }
    }
}
