/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Circulo obx = new Circulo (Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio=")));
        JOptionPane.showMessageDialog(null, "El area es "+obx.calcularArea());
JOptionPane.showMessageDialog(null, "La longitud es "+obx.calcularLonxitude());
    }
    
}
