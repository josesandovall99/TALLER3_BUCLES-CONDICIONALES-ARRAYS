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
public class ej1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite numero"));
              int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite numero"));
              
              if (num1 == num2) {
                  
                  System.out.println("los numeros son iguales");
            
        }if(num1>num2){System.out.println("el " + num1 + " es mayor a " + num2);}
        if(num1<num2){System.out.println("el " + num2 + " es menor a " + num1);}

    }
    
}
