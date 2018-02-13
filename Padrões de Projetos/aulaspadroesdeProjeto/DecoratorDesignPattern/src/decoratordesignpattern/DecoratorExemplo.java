/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package decoratordesignpattern;

import java.awt.Button;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author helder
 */
public class DecoratorExemplo extends JFrame {

    public void inicializa(){


       

        Button botao1 =
            new Button("sem barraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        botao1.setFont(new Font("Serif", Font.ITALIC, 80));
        botao1.setSize(100,100);

        Button botao2 =
            new Button("Com Barraaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        botao2.setFont(new Font("Serif", Font.ITALIC, 80));

     //barra é o decorator
      JScrollPane barra = new JScrollPane(botao2);


     

       ///barra.add(botao1);
       
       add(botao1);
       add(barra);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DecoratorExemplo tela = new DecoratorExemplo();
        tela.inicializa();
        tela.show();

    }

}
