/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo043 {

    public static void main(String[] args) {
        // 
        int[] valores1 = {10, 100, 1000, 20, 200, 2000};
        int[] valores2 = {1000, 1001, 1002, 1003, 1004, 1005};
        
        for (int i = 0; 1 < valores1.length; i++) {
            int v1 = valores1[i];
            int v2 = valores2[i];
            obtenerSuma(v1, v2);
    }
     /* Con el for se recorren posición por posición y asi sucesivamente y
      en cada vuelta se toma un valor del primer arreglo y uno del segundo 
      arreglo en la misma posición, luego  ya con estos valores 
      se envían al método obtenerSuma para realizar la suma
     */
    
        
    }
        
    public static void obtenerSuma(int a, int b){
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);
        
    }
    
    
}
