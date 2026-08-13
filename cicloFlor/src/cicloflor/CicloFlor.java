/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cicloflor;

import java.util.Scanner;

/**
 *
 * @author Daniel Sanabria
 */
public class CicloFlor {

    /**
     * ++ va incremando en uno en uno
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        1. variable de control= valor inicial
        2.condicion=limite
        3.Mdificador de la v.c= incremento/decremento
        */
     
        System.out.println("CICLO For 1");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Ciclo %d\n",i);
        }    
         System.out.println("CICLO For 2");
            for (int i = 2; i < 10; i+=2) {
                //i=i + 5;  i+=5
                System.out.printf("Ciclo %d\n",i);
           }
            Scanner input = new Scanner(System.in); 
            
            final  int  NUMEROVOTANTES=20;
           int numVarones= 0;
           int numMujeres= 0;
           char seleccion='1' ;               
          double porcetanje=0;   

            
            for (int i = 0; i < NUMEROVOTANTES; i++) {
                System.out.println("Genero de Votantes");
                System.out.println("V: Varon / M: MUjer");
                seleccion= input.next().toUpperCase().charAt(0);
                
                switch (seleccion) {
                    case 'V':
                        System.out.println("varon entrando");
                        System.out.println("a ala cabina");
                        numVarones++;
                        break;
                        
                     case 'M':
                         System.out.println("Mujer entrando");
                        System.out.println("a ala cabina");
                        numMujeres++;
                         
                        
                        break;
                        
                    default :
                        System.out.println("Error de ingreso");
                        
                }
              
         }
              porcetanje= (double)numVarones / NUMEROVOTANTES;   
               System.out.printf("Varones: %.2f %% \n ",porcetanje*100);
               
               porcetanje= (double)numMujeres / NUMEROVOTANTES;   
               System.out.printf("Mujeres: %.2f %% \n ",porcetanje*100);
            }
          
          
        }
     
     
    
    

