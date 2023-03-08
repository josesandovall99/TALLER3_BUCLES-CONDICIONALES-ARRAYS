/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3_buclesycondicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author JOSE SANDOVAL
 */
public class ej10BUCL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int pir = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE NUMERO DE LA PIRAMIDE"));
                int cont = 1;
                int cont2=1;
                int cont3=1;
                
                
                for (int i = 0; i < pir; i++) {
                    
                    int numero;
                    cont2 = 1;
                    cont3=cont;
                    
                    for (int j = 0; j < pir-cont; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < pir-(pir-cont); j++) {
                        
                        numero = pir-(pir-cont2);
                        System.out.print(numero);
                        cont2++;
                    }
                    for (int j = 0; j < pir-(pir-(cont-1)); j++) {
                        
                        
                        numero = cont3-1;
                        
                        System.out.print(numero);
                        cont3--;
                    }
                    System.out.println();
                    cont++;
        }

        
    }
    
}
