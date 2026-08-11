/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendadesoftware;

import java.util.Scanner;

/**
 *
 * @author DANIEL SANABRIA
 * 
 *
 */
/* 
Una tienda de software ofrece descuentos basados en la edad del cliente y si tiene una membresía
premium. Se tiene que solicitar la edad y si tiene membresía ('S' para sí, 'N' para no).
• Primero, se tiene que verificar si el cliente es mayor de edad (Arriba o igual a 18 años).
o Si es mayor de edad: Se verifica si tiene más de 65 años o si tiene membresía. Si
cumple alguna de las condiciones, recibe un 20% de descuento. Si no, recibe un
10%.
o Si es menor de edad: Verificar si tiene membresía 'S' y tiene más de 12 años. Si es
así, recibe un 15% de descuento. De lo contrario, no tiene descuento (0%).
El programa debe calcular y mostrar el descuento final aplicado y también el precio de venta
original y el nuevo total que se tiene que pagar por el juego
*/

public class TiendadeSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int edad= 0;
        double precioOriginal =0;
        char membresia= '0';
        double porcentajeDescuento=0.0 ;
        double montoDescuento =0;
        double totalAPagar =0;
               
                
        System.out.println("Ingrese el precio original del juego:");
        precioOriginal=sc.nextDouble();
        
        System.out.println("Cual es tu edad:");
        edad=sc.nextInt();
        
        System.out.print("Tiene membresia premium ('S' para si, 'N' para no): ");
        membresia = sc.next().toUpperCase().charAt(0);

       
        if (edad >= 18) {
      
            if (edad > 65 || membresia == 'S') {
                porcentajeDescuento = 0.20;
            } else {
                porcentajeDescuento = 0.10; 
            }
        } else {
           
            if (membresia == 'S' && edad > 12) {
                porcentajeDescuento = 0.15; 
            } else {
                porcentajeDescuento = 0.00;
            }
        }
        
        montoDescuento = precioOriginal * porcentajeDescuento;
        totalAPagar = precioOriginal - montoDescuento;
        
        System.out.println("\n resumen de la compra ");
        System.out.printf("Precio original: $%.2f%n", precioOriginal);
        System.out.printf("Descuento aplicado: %.0f%% ($%.2f)%n", (porcentajeDescuento * 100), montoDescuento);
        System.out.printf("Total a pagar: $%.2f%n", totalAPagar);

       

        }
         
  }                  
      
   
    

