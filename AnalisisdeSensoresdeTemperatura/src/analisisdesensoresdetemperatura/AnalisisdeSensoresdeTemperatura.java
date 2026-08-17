/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisisdesensoresdetemperatura;

import java.util.Scanner;

/**
 *
 * @author Daniel Sanabria
 */
public class AnalisisdeSensoresdeTemperatura {

    /**
     *Ciclo WHILE
     * Desarrolla un programa que lea repetidamente las temperaturas (en grados centígrados)
registradas por un sensor industrial. El programa debe detenerse cuando el usuario ingrese el valor
centinela −999. 
• Validación: La temperatura absoluta más baja posible es el cero absoluto (−273.15 °𝐶). Si
el usuario ingresa un valor menor a este (que no sea el centinela), el programa debe
mostrar un error usando una estructura if-else y no tomarlo en cuenta para los cálculos.
• Operación: Al finalizar, el programa debe imprimir el promedio de las temperaturas válidas
ingresadas y la diferencia térmica entre la temperatura más alta y la más baja leída.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double temp=0;
        int contador=0;
        double suma=0;
        double max= -1000;
        double min=1000;
        double promedio =0;
        double diferencia =0;
        
        while (true){
            System.out.print("ingrese la temperatura:");
            temp=input.nextDouble();
            
         if (temp == -999 ) {
                break;
            }
            if (temp  < -273.15) {
                System.out.println("Error,Temperatura invalida");
           }else {
             suma += temp;
             contador++;
             
                if (contador== 1) {
                    max = temp;
                    min = temp;
                } else {
                    suma+=temp;
                    contador++;
             
                    if (contador == 1){
                        max = temp;
                        min = temp;
                    }else{
                        if (temp  >  max)max = temp ;
                        if(temp  < min)min = temp;
                            
                        }
                   
                }
                
            
   
            }
                }
         if (contador >  0) {
                promedio= suma / contador;
                diferencia=max  - min;
                System.out.println("Promedio:"+ promedio);
                System.out.println("Diferencia termica:"+ diferencia);
            }else{
                System.out.println("No se imgresaron datos validos");
        }   //fin de main  
    
 }  //fin del maim
        
 }   

        
