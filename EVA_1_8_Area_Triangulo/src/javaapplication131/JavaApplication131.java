/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication131;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class JavaApplication131 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          double area;// double--->tipo de dato para nÃºmeros con parte decimal
        double base;
        double altura;
        Scanner capture = new Scanner(System.in); 
        System.out.println("Introduce la base del triÃ¡ngulo:");
        base= capture.nextDouble();
        System.out.println("Introduce la altura del triÃ¡ngulo:");
        altura= capture.nextDouble();
        System.out.println("El resultado del Ã¡rea es:");
        
        area=(base*altura)/2;
        
        System.out.println(area);
    }
    
}
