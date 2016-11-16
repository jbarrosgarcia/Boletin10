/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;
import javax.swing.JOptionPane;
/**
 *
 * @author Jose Barros
 */
public class Boletin10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int numCorr;
       numCorr=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero a adivinar entre 1 y 50"));
       Adivina adiv =new Adivina();
       if(numCorr>=1&&numCorr<=50){
        adiv.setNumeroCorr(numCorr);
       }
       adiv.adivinar(Integer.parseInt(JOptionPane.showInputDialog("introduzca el numero de intentos")));
    }
    
}
