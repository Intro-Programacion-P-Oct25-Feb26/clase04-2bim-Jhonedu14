/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        // 
        int valor = obtenerSuma(10, 30); // se invoca al método 
                                         // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);
        
        System.out.printf(suma);
        /* El Error sale por la variable suma en primer dato no esta declarada
        la variable suma solo existe en la funcion obtenerSuma en la funcion 
        main no existe esa variable y eso marca el error 
        */
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        return suma;
        // return a + b;
    }
    
    
}
