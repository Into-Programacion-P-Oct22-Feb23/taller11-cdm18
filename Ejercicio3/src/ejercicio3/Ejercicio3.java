/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejercicio3 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el
     * promedio cualitativo de los parámetros. Si el promedio es: De 0 a 5 el
     * promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a
     * 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. A la
     * función se la debe llamar desde un método principal. Los parámetros
     * necesarios para llamar a la función, deben ser ingresados solicitados al
     * usuario. En la función principal se debe imprimir los siguiente: El
     * promedio de las notas: 10, 5, 8, 7 es Bueno **
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        promedio();
    }

    public static void promedio() {
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese la nota 1");
        double a = entrada.nextDouble();
        System.out.println("Ingrese la nota 2");
        double b = entrada.nextDouble();
        System.out.println("Ingrese la nota 3");
        double c = entrada.nextDouble();
        System.out.println("Ingrese la nota 4");
        double d = entrada.nextDouble();

        double promedio;
        promedio = (a + b + c + d) / 4;
        String promedio2 = "";
        if (promedio >= 0 && promedio <= 5) {
            promedio2 = "Regular";
        }
        if (promedio >= 5.1 && promedio <= 8) {
            promedio2 = "Bueno";
        }
        if (promedio >= 8.1 && promedio <= 9) {
            promedio2 = "Muy Bueno";
        }
        if (promedio >= 9.1 && promedio <= 10) {
            promedio2 = "Sobresaliente";
        }
        System.out.printf("El promedio de las notas: %.2f, %.2f, %.2f, %.2f es %s \n",
                a, b, c, d, promedio2);

    }

}
