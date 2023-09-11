/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_SALIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. DECLARACIÓN DE VARIABLES
         String nombre; 
         String apellido; 
         int semestre;
         Scanner captura = new Scanner (System.in);
        //; fin de instrucción en JAVA
        //2. CAPTURA DE VARIABLES
        System.out.println("Ingresa tu Nombre(s):");
        nombre= captura.nextLine();
        System.out.println("Ingresa tu Apellido:");
        apellido= captura.nextLine();
        System.out.println("Ingresa tu Semestre:");
        semestre= captura.nextInt();
        //JAVA es sesible a mayúsculas y mínusculas
        //es decir: es diferente System que system
        //3. MOSTRAR LOS DATOS CAPTURADOS
         System.out.println(nombre);
          System.out.println(apellido);
            System.out.println(semestre);
             
        
    }
    
}
