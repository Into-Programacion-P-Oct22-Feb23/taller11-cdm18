/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;
/**
 *
 * @author utpl
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        valores(ciudades());

    }

    public static String[] ciudades() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de elementos del arreglo");
        int limite = entrada.nextInt();
        String[] a = new String[limite];

        entrada.nextLine();

        for (int indice = 0; indice < limite; indice++) {

            System.out.println("Ingrese las ciudades a su eleccion:");
            a[indice] = entrada.nextLine();

        }

        return a;
    }

    public static void valores(String caracteres[]) {
        String mensaje = "";

        for (int indice = 0; indice < caracteres.length; indice++) {
            if ((caracteres[indice]).length() >= 4 || (caracteres[indice]).length()<=5) {
                mensaje = mensaje + caracteres[indice] + "\n";
            }
        }
        System.out.printf("Ciudades con 5 o 4 caracteres ingresados"
                + " son: %s", mensaje);

    }

}
