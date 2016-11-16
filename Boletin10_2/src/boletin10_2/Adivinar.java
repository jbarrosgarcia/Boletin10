/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Barros
 */
public class Adivinar {
    Random rdm=new Random();
    int salir=1;
    
    public void calcular(){
        int intentos=0;
        int numCorr= rdm.nextInt(49)+1;
        int num;
        while(salir!=0){
            intentos++;
           // no me deja hacer putos commit de mierda
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));
            if(num==numCorr){
                System.out.println("Has acertado en el intento nº "+intentos); 
                salir=Integer.parseInt(JOptionPane.showInputDialog("Para salir introduzca el numero 0"));
                numCorr=rdm.nextInt(49)+1;
            }
            if(((num-numCorr)>=5||(numCorr-num)>=5)&&((num-numCorr)<10||(numCorr-num)<10)){
                System.out.println("Estas cerca");
            }
            if(((num-numCorr)>=10||(numCorr-num)>=10)&&((num-numCorr)<=20||(numCorr-num)<=20)){
                System.out.println("Estas lejos");
            }
            if((num-numCorr)>5||(numCorr-num)>5){
                System.out.println("Estas muy cerca");
            }
            if((num-numCorr)>20||(numCorr-num)>20){
                System.out.println("Estas muy lejos");
            }
            
            System.out.println("el numero es" +numCorr);
        }
    }
}