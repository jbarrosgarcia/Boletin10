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
public class Adivina {
    private int numeroCorr;
    private int pistaMayor;
    private int pistaMenor;

    public Adivina(int numeroCorr, int pistaMayor, int pistaMenor) {
        this.numeroCorr = numeroCorr;
        this.pistaMayor = pistaMayor;
        this.pistaMenor = pistaMenor;
    }
    public Adivina(){
        }

    public int getNumeroCorr() {
        return numeroCorr;
    }

    public void setNumeroCorr(int numeroCorr) {
        this.numeroCorr = numeroCorr;
    }

    public int getPistaMayor() {
        return pistaMayor;
    }

    public void setPistaMayor(int pistaMayor) {
        this.pistaMayor = pistaMayor;
    }

    public int getPistaMenor() {
        return pistaMenor;
    }

    public void setPistaMenor(int pistaMenor) {
        this.pistaMenor = pistaMenor;
    }
    public void adivinar(int numInt){
        int numPru=0;
        int i=0;
        while(i<numInt){
            numPru=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));
            
            if(numPru==numeroCorr){
                System.out.println("Has acertado"); 
                break;
            }
            else if(numPru>numeroCorr&&numPru!=numeroCorr){
                this.pistaMenor=numPru;
                System.out.println("Es menor que "+pistaMenor);
            }
            if(numPru<numeroCorr&&numPru!=numeroCorr){
                this.pistaMayor=numPru;
                System.out.println("Es mayor que "+pistaMayor);
            }
            i++;
        }
    }
}
