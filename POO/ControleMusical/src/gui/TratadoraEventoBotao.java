/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author vncserver
 */
public class TratadoraEventoBotao implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) { // Event Handler
        JOptionPane.showMessageDialog(null, "Botão Clicado!");
    }
    
}
