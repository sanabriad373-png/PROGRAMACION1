/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversordeunidadesfísicas;

import java.util.Scanner;

/**
 *
 * @author Daniel Sanabria
 */
public class ConversordeUnidadesFísicas {

    /**
     * Crea un menú interactivo que permita al usuario convertir medidas de longitud y peso. El menú
debe mostrar las opciones: 1) Metros a Pies, 2) Kilogramos a Libras, 3) Centímetros a Pulgadas, y
4) Salir.
• Validación: Se debe pedir la magnitud a convertir. Una longitud o un peso nunca pueden
ser negativos. Si el usuario ingresa un valor menor a cero, debe mostrarse un mensaje de
error y volver a pedir el dato.
• Operación: Utiliza una estructura switch para procesar la opción elegida y realizar la
operación aritmética correspondiente. El menú debe repetirse usando do-while hasta que
el usuario elija la opción 4.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double valor;
        
        do { 
            System.out.println("\n CONVERSOR DE UNIDADES FISICAS");
            System.out.println("1)Metros a Pies");
            System.out.println("2) Kilogramos a Libras");
            System.out.println("3)Centimetros a Pulgadas");
            System.out.println("4)Salir");
            System.out.println("Seleccione una opcion:");         
           
            opcion=scanner.nextInt();
            
               if (opcion >= 1 && opcion <= 3) {
                
                do {
                    System.out.print("Ingrese la magnitud: ");
                    valor = scanner .nextDouble();
                    if (valor < 0) {
                        System.out.println("Error: No puede ser negativo.");
                    }
                } while (valor < 0);

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: " + (valor * 3.28084) + " pies");
                        break;
                    case 2:
                        System.out.println("Resultado: " + (valor * 2.20462) + " libras");
                        break;
                    case 3:
                        System.out.println("Resultado: " + (valor * 0.393701) + " pulgadas");
                        break;
                }
            } else if (opcion != 4) {
                System.out.println("Opción no válida.");
                 } else{
            }

        } while (opcion != 4);

        System.out.println("Programa finalizado.");
   
    }
}
