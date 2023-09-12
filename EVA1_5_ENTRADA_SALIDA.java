/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5.pkg1_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author mac
 */
public class EVA1_51_ENTRADA_SALIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        //1. DECLARACI�N DE VARIABLES
         String nombre; 
         String apellido; 
         int semestre;
         Scanner captura = new Scanner (System.in);
        //; fin de instrucci�n en JAVA
        //2. CAPTURA DE VARIABLES
        System.out.println("Ingresa tu Nombre(s):");
        nombre= captura.nextLine();
        System.out.println("Ingresa tu Apellido:");
        apellido= captura.nextLine();
        System.out.println("Ingresa tu Semestre:");
        semestre= captura.nextInt();
        //JAVA es sesible a may�sculas y m�nusculas
        //es decir: es diferente System que system
        //3. MOSTRAR LOS DATOS CAPTURADOS
         System.out.println(nombre);
          System.out.println(apellido);
            System.out.println(semestre);
    }
    
}
