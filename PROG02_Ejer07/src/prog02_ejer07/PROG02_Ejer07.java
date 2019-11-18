/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog02_ejer07;

import java.util.Scanner;

/**
 *
 * @author jaherrera
 * Diseña un programa Java para resolver una ecuación de primer grado con una incógnita (x), 
 * suponiendo que los coeficientes de la ecuación (C1 y C2) se introducen desde teclado.
 * C1x + C2 = 0
 */
public class PROG02_Ejer07 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        float C1, C2, x;
        
        try {
            System.out.print("Introduce C1: ");
            C1 = teclado.nextFloat();

            System.out.print("\nIntroduce C2: ");
            C2 = teclado.nextFloat();
            } catch (Exception e) {
                System.out.println("El carácter decimal es la ,");
        }
            
        C1 = 7f;
        C2 = 4f;
        
        x = (C2 - C2 - C2) / C1;
        
        System.out.println("El valor de x es " +  x);
        
        
        
    }
    
}
