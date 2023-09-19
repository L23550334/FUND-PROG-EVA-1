/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_tiposdedatos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_TIPOSDEDATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte califa;
        califa=127;
        //califa=128 o más: ERROR
        //califa=-127;
        //califa=-128 o mas: ERROR
        //califa=126+1;
        //califa=127+1:ERROR
      
        int valor;
        valor=Integer.MAX_VALUE;
        System.out.println(valor );
        valor=Integer.MIN_VALUE;
        System.out.println(valor);
        
        //--------
        char caracter = '@';
        System.out.println(caracter);
        System.out.println(caracter + 0);
    }
    
}
