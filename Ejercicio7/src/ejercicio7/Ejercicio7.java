/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejercicio6 {

    /**
     * Generar una función que devuelva un arreglo unidimensional de cadenas. En
     * dicha función se debe pedir por teclado el número de elementos de
     * arreglo, además de ingresar los elementos por teclado, los datos a
     * ingresar pueden ser ciuadades del Ecuador.
     *
     * Generar un procedimiento que reciba como parámetro un arreglo
     * unidimensional de cadenas; el mismo, se debe imprimir únicamente los
     * valores del arreglo que tengan 4 o 5 caracteres.
     *
     * Desde el método principal, se debe llamar a la función que devuelva el
     * arreglo unidimensional y además llamar al procedimiento que imprima los
     * valores con las consideraciones expuestas.
     *
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ciudades();

    }

    public static String ciudades() {
        

        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        System.out.println("Ingrese el numero de elementos del arreglo");
        int numero = entrada.nextInt();
        boolean bandera = true;
        String[numero] a;
        
        for (int indice = 0; indice < numero; indice++) {

            while (bandera) {
                System.out.println("Ingrese las ciudades a su eleccion:");
                a[indice] = entrada.nextLine();
                System.out.println("Si desea continuar agregando datos"
                        + "presione 1, si desea salir, presione 2");
                int opcion = entrada.nextInt();
                if (opcion == 1) {
                    bandera = true;
                }
                if (opcion == 2) {
                    bandera = false;
                }

                mensaje = mensaje + a[indice] + "\n";
            }

        }

        return mensaje;
    }
}
