/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donaciondesangre;

import java.util.Scanner;

/**
 *
 * @author Daniel Sanabria
 * 
 */
public class Donaciondesangre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner input = new Scanner(System.in);
        int edad = 0;
        int peso = 0;
        boolean haDesayunado = true;
        char respuesta = '0';
        int nivelHierro = 0;
        String genero = "John Doe";
        
        System.out.print("Cual es su edad: ");
        edad = input.nextInt();
        System.out.print("Cual es su peso: ");
        peso = input.nextInt();
        
        if(edad>=18 && edad<=65 && peso>=110){
            System.out.println("Tienes los parametros fisicos");
            System.out.print("Has desayunado? Si/No");
            respuesta = input.next().charAt(0);
            
            if(respuesta == 'S' || respuesta =='s'){
                System.out.println("Si puedes donar sangre");
                haDesayunado = true;
            }
            else{
                System.out.println("Tienes que comer antes");
                haDesayunado = false;
            }
        }
        else{
            System.out.println("No se puede donar sangre");
        }
        
        System.out.println("");
        System.out.print("Dime tu nivel de hierro: ");
        nivelHierro = input.nextInt();
        input.nextLine();
        System.out.print("Masculino o Femenino: ");
        genero = input.nextLine().toUpperCase();
        
        if((nivelHierro>=14 && genero.equals("MASCULINO"))){
            System.out.println("Si se puede donar sangre");
        }
        else{
            System.out.println("no se puede donar sangre");
        }
    
    }
    
    }
    
    

    
 