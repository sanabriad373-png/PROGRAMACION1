/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoscondosvariable;

import java.util.Scanner;

/**
 *
 * @author Daniel Sanabria
 */
public class Calculoscondosvariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int base = 0;
        int altura = 0;
        int area = 0;
        int perimetro = 0;
        
        System.out.println("Cual es su base:");
        base= input.nextInt();
        System.out.println("Cual es su altura:");
        altura= input.nextInt();
       
        area = base * altura;
        perimetro = 2 * (base + altura);
       
        input.nextLine();//Limpieza del buffer  
        
        System.out.println("Resultado es: " + area);
        System.out.println("Resultado es: " + perimetro);
    }
    
}
