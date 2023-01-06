/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author utpl
 */
public class Ejercicio6 {

    /*### Problema 06
Dado un arreglo; por ejemplo:
```
int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
```
Generar las siguiente funciones:

* Función que devuelva la media aritmética del arreglo; recibe como parámetro un arreglo de tipo entero

* Función que devuelva el valor de la desviación estándar de los valores del arreglo; recibe como parámetro un arreglo de tipo entero 
    y un valor de tipo decimal para representar la media aritemética


Los método deben ser invocados desde el método main (principal); además, las funciones deben recibir como parámetro. 
    En el método principal imprimir el valor de la media aritmética y el valor de la desviación estándar.


     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        System.out.println( promedio(informacion));
        System.out.println(        desviacion(informacion, promedio(informacion)));        
    }

    public static double promedio(int[] a) {
        double promedio;
        int suma = 0;

        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];

        }
        promedio = (suma / a.length);
        return promedio;

    }

    public static double desviacion(int[] a, double b) {
        int suma = 0;
        double n = 0;
        double desviacion = 0;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
            double r = a[i]-b;
            double s = Math.pow(r, 2);
            n =  n + Math.pow(a[i]-b,2);
            
        }
        desviacion = Math.sqrt(n/a.length);
        return desviacion;
    }
}
