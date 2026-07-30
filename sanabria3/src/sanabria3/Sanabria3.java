/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanabria3;

import java.util.Scanner;

/**
 *
 * @author Daniel Sanabria
 */


public class Sanabria3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner input  = new Scanner(System.in);
        //conociendo la estructura
      /* 
         1. Palabra Clave "if" y/o "else"
         2. El grupo de instrucciones se encierra entre { }
         3. No se usa ";" para los bloques.
         4. La condicion es una comparacion bajo los siguientes elementos:
                    a. <        menor
                    b. >        mayor
                    c. <=       menor o igual
                    D. >=       MAYOR O IGUAL
                     e. ==       igual (uso de 2 signos iguales)
      */
      int cantidadAgua = 0;
      char respuesta = '0';
      String respuestaAmbiente ="John Doe";
              
        System.err.println("El bote es de agua 500mL");
        System.out.print("Cuanto liquido dices que contiene");
        cantidadAgua =  input.nextInt();
        
        if(cantidadAgua >=250){
             //condicion es verdaderos
                System.out.println("si,tiene mas de la mitad");
                System.out.println("Te lo puedes beber!!!");
                System.out.println("Nos nos quedamos sin nada.. hay suficiente");
           }     
                input.nextLine();//Limpieza del buffer                           
                
                System.out.println("");
                System.out.println("El liquido que contiene es H20 (a=si,b=no)");
                respuesta = input.nextLine().charAt(0);
                
                if(respuesta == 'a') {
                    //condicion Verdadero
                    System.out.println(""" 
                                       Si es agua lo que contiene
                                       No es otra cosa....nada embriagante.!!
                                                                        /""");
                            }
                            else{
                                //Condicion Falsa
                                System.out.println("""
                                                   UY uy UY
                                                   Que sera?...
                                                   /""");
                                                           
                            }
                            
                            System.out.printf("\nEse bote que contiene %d mL",cantidadAgua);
                            System.out.println("\nEs amigable con el ambiente?");
                            respuestaAmbiente = input.nextLine();
                          /*
                            System.out.printf("Dato de Variable: %s",respuestaAmbiente);
                            
                            System.out.println("Seguro?");
                            respuestaAmbiente = input.nextLine().toUpperCase();
                            System.out.printf("Dato de Variable: %s",respuestaAmbiente);
                            
                            System.out.println("100% Seguro?");
                            respuestaAmbiente = input.next().toLowerCase();
                            System.out.printf("Dato de Variable: %s",respuestaAmbiente);
                            */
                            if(respuestaAmbiente.equals("Si")){
                                System.out.println("Es amigable");
                            }
                            else{
                                System.out.println("no es nada amigable");
                            }
                        }//Fin de Main
                    
                    }//Fin de Class
                                      
                                         
                                       
                                       
                                       
      
                                       
    
                                       
    
