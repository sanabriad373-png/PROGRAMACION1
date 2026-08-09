/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeaprobaciondemateria;

import java.util.Scanner;

/**
 *
 * @author DANIEL ANABRIA
 */
public class Sistemadeaprobaciondemateria {

    /**
     * @param args the command line arguments
     */
     /* 
    Se tiene que escribir un programa que solicite al usuario el nombre del estudiante (tipo string) y las
calificaciones obtenidas en dos exámenes parciales (tipo double). El programa debe calcular el
promedio final. Si el promedio es mayor o igual a 65.0, debe mostrar un mensaje indicando que el
estudiante está "Aprobado  De lo contrario, debe mostrar "Reprobado".
Requisito estricto: Solo puedes usar una estructura if/else simple
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        String nombreEstudiante="John Doe";          
        double promedio=0;
        double exam1=0;
        double exam2=0;
        System.out.println("Nombre del estudiante:");
        nombreEstudiante=sc.nextLine().toUpperCase();
        
        System.out.println("Ingrese la calificacion del primer examen:");
        exam1=sc.nextDouble();
        
        System.out.println("Ingrese la calificacion del segundo examen:");
        exam2=sc.nextDouble();
       
        promedio=(exam1+exam2)/2.0;
        System.out.println("Nombre del estudiante:"+nombreEstudiante);
        System.out.println("su promedio final es:"+promedio);
       
        if (promedio >=65.0) {
            System.out.println("Aprobado");
            
            }
            else {
                System.out.println("Reprobado");
                    }
             
                }
               
        
       
            
        }
                
         
    
    

