/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interessimpl;

import java.util.Scanner;

/**
 *
 * @author Daniel Sanabria
/* Interés simple Escriba un programa que calcule el interés simple de un préstamo. El sistema
debe solicitar el capital inicial, la tasa de interés anual (en formato de número entero) y el tiempo
en años. Aplique la fórmula (Capital * Tasa * Tiempo) / 100  y muestre el interés generado
 */
public class Interessimpl {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       
        Scanner input = new Scanner(System.in);
      
      double capitainicial= 0;
      double tasadeinteres=0;
      double tiempoenanos=0;
      
        System.out.println("Ingrese su capitalinicial:");
        capitainicial=input.nextDouble();
        
        System.out.println("Ingrese la tasadeinteres:");
        tasadeinteres=input.nextInt();
        
        System.out.println("Ingrese el tiempoenanos:");
        tiempoenanos=input.nextDouble();
        
        input.nextLine();//Limpieza del buffer 
        
        
        
        
        tasadeinteres=capitainicial *tasadeinteres * tiempoenanos/ 100;
    
          System.out.println("interes generado es: " + tasadeinteres);
    }
}
