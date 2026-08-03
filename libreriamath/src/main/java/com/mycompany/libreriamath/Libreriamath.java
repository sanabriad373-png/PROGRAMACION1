/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libreriamath;

import java.util.Scanner;

/**
 *
 * @author Daniel Sanabria
/*Uso de la librería Math Desarrolle un programa que pida al usuario el radio de un círculo.
Utilizando la constante Math.PI y la función Math.pow() de la librería matemática de Java, calcule
el área y circunferencia de dicho círculo y muestre el resultado al usuario.
*/

public class Libreriamath {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner input = new Scanner(System.in);
        int radio = 0;
        double area =0;
        double circunferencia=0;
        
        System.out.println("Ingrese el radio del circulo:");
        radio= input.nextInt();
        
        area=Math. PI * Math. pow (radio, 2);
        circunferencia= 2 * Math. PI * radio;
        
        System.out.println("El area del circulo es: " + area);
        System.out.println("La circuferencias es : " + circunferencia);
        
    }//Fin de la clase
}//fin del main
