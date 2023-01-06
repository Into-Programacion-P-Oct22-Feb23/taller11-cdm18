/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author utpl
 */
public class Ejercicio1 {

    /*Generar un procedimiento (método que no devuelva valor) que imprima los valor pares de un arreglo bidimensional.

El arreglo para probar la solución es:
```
int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
```
El procedimiento o método debe se invocado desde el método main (principal); además el método debe recibir como parámetro un arreglo bidimensional.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        pares(informacion);

    }

    public static void pares(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 ==0){
                   System.out.println(a[i][j]); 
                    
                }
                
                

            }
        }
    }
}
