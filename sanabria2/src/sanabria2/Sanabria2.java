/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sanabria2;

import java.util.Scanner;



/**
 *
 * @author Daniel Sanabria 
 */
public class Sanabria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado  = new Scanner(System.in); 
    //Declaracion Variables
    int pulgada = 0; //Asignado un valor por el signo  =
    double resultadoCM; //Agregar esta linea aqui 
    double kilometros= 100;
    double  millas = 0;
    double celsius =0;
    double gfarenheit =0;
    
        System.out.println("Tenemos 5 pulgadas");
        System.out.println("Cuanto es eso en CM?");
        
        pulgada = 5;
        resultadoCM = pulgada * 2.54;
        System.out.printf("%d pulgadas es equivalente a %.2f cm", pulgada, resultadoCM);

        pulgada = 12;
        resultadoCM = pulgada * 2.54;
        System.out.printf("\n%.2f cm es equivalente a %d pulgadas\n", resultadoCM, pulgada);
    
        System.out.println(" Dime cuantos kilometros son?");
        kilometros = teclado.nextDouble();
        
        millas = kilometros  /1.6;
        System.out.printf("%.2f km es = a %.3f millas ", kilometros, millas);
        
        System.out.println("\n dime cuando grados celsius son");
        celsius = teclado.nextDouble();

        gfarenheit = (celsius * 1.8) + 32;
        System.out.printf("%.2f Grados Celsius es = a %.3f Grados Farenheit\n", celsius, gfarenheit);
    }
}
