/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraarimetica;

import java.util.Scanner;

/**
 *
 * @author DANIEL SANABRIA
 */
public class Calculadoraarimetica {

    /**
     * Crear un programa que actúe como una calculadora básica. Debe solicitar al usuario dos números
enteros y un carácter (char) que represente la operación a realizar:
• Suma
• Resta
• División
• Multiplicación
• Módulo ‘%.
Dependiendo del carácter ingresado, el programa debe usar una estructura de selección para
realizar la operación aritmética correspondiente y mostrar el resultado en formato decimal (cuidar
las divisiones entre cero). Si el usuario ingresa un carácter no válido, se debe mostrar "Operador
no reconocido".
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
         int num1 =0;
         int num2 =0;
         char operador ='0';
         double resultado = 0.0;
         boolean operacionValida = true;
         
         System.out.println("Ingrese el primer numero entero: ");
         num1 = sc.nextInt();
 
         System.out.println("Ingrese el segundo numero entero: ");
         num2 = sc.nextInt();

         System.out.println("Ingrese el operador (+, -, *, /, %): ");
         operador = sc.next().charAt(0);
         
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            case '%':
                
                if (num2 != 0) {
                    resultado = num1 % num2;
                } else {
                    System.out.println("Error: No se puede calcular el módulo con cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operador no reconocido");
                operacionValida = false;
                break;
        }

        if (operacionValida) {
            System.out.printf("El resultado es: %.2f%n", resultado);
        }

        
        
        
        
        
        
        
        
        
        
        
    }
    
}
