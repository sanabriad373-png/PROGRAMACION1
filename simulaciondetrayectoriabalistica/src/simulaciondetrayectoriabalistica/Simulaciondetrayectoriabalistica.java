/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulaciondetrayectoriabalistica;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Simulaciondetrayectoriabalistica {

    /**
     * Escribe un programa que simule el lanzamiento de un proyectil. El usuario debe ingresar la
velocidad inicial (en m/s) y el ángulo de lanzamiento (en grados). Se tiene que buscar la fórmula
correspondiente a la trayectoria.
• Validación: La velocidad inicial debe ser mayor a 0 y el ángulo debe estar estrictamente
entre 1 y 89 grados.
• Operación: Utilizando un ciclo for, el programa debe calcular y mostrar la altura del
proyectil (en metros) para cada segundo transcurrido, desde el segundo 𝑡 = 1 hasta el
segundo 𝑡 = 10.
• Selección: Dentro del ciclo, utiliza una estructura if-else para indicar en qué segundo el
proyectil alcanza su altura máxima estimada y en qué momento su altura empieza a ser
negativa (lo que significa que ya impactó el suelo, momento en el cual el ciclo debe
romperse mediante break). Nota: Utiliza la fórmula de posición vertical de la cinemática.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
    
       
        double maxAltura = 0;
        int segundoMax = 0;
        double angulo=0;
        double v0=0;
        double altura =0;
        
          System.out.println("Ingrese la velocidad inicial (m/s): ");
           v0 = sc.nextDouble();

        System.out.println("Ingrese el angulo (grados): ");
        angulo = sc.nextDouble();
  
       
        if (v0 <= 0 || angulo <= 1 || angulo >= 89) {
            System.out.println("Datos invalidos.");
            return;
        }

         double v0y = v0 * Math.sin(Math.toRadians(angulo));
       
        
        for (int t = 1; t <= 10; t++) {
            
        altura = (v0y * t) - (0.5 * 9.81 * t * t);
           
            if (altura < 0) {
                System.out.println("En el segundo " + t + " el proyectil toco el suelo.");
                break;
            }

            System.out.println("Segundo " + t + ": Altura = " + altura + " m");
           
            if (altura > maxAltura) {
                maxAltura = altura;
                segundoMax = t;
            }
        }

        System.out.println("La altura máxima registrada fue en el segundo " + segundoMax);
        
    }
}
        
    
    

