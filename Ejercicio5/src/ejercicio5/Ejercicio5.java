/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author utpl
 */
public class Ejercicio5 {

    /*Generar un función, método que devuelva la suma de un arreglo bidimensional; mismo que se lo recibe como parámetro.

El arreglo para probar la solución es:
```
int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
```
El método debe se invocado desde el método main (principal); además el método debe recibir como parámetro un arreglo bidimensional.


     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] informacion = {{1, 2, 3},
        {10, 20, 30},
        {100, 200, 300}};
        suma(informacion);

    }

    public static void suma(int[][] a) {
        int suma = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma = suma + a[i][j];

            }
        }
        System.out.println(suma);

    }
}
