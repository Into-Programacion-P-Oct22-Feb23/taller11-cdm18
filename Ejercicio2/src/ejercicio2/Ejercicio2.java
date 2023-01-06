/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejercicio2 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * Generar una solución que implemente 3 procedimientos. Que permitan
     * calcular el área de un cuadrado, área de un triángulo y área de un
     * rectángulo. Cada procedimiento debe solicitar los datos necesarios y
     * presentar o imprimir el valor correspondiente. Se debe invocar a los
     * procedimientos desde un método principal; Si el usuario ingresa 1 se
     * llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento
     * obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado. El
     * área del cuadrado es igual a lado x lado x lado x lado El área del
     * triángulo es igual a (base x altura)/2 El área del rectángulo es igual a
     * base x altura
***
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;

        System.out.println("Ingrese 1 para calcular area de Cuadrado, 2 para"
                + "calcular area triangulo o 3 para calcular area rectangulo");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            obtenerAreaCuadrado();

        } else if (opcion == 2) {
            obtenerAreaTriangulo();
        }if (opcion == 3) {
            obtenerAreaRectangulo();
        } else {
            System.out.println("ERROR");
        }

    }

    public static void obtenerAreaCuadrado() {
        double lado;
        double area;
        System.out.println("Ingrese el valor de lado");
        lado = entrada.nextDouble();
        area = lado * 4;
        System.out.printf("El area de su cuadrado es: %.2f", area);

    }

    public static void obtenerAreaTriangulo() {
        double lado;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base");
        lado = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        area = (lado * altura) / 2;
        System.out.printf("El area de su triangulo es: %.2f", area);

    }

    public static void obtenerAreaRectangulo() {
        double lado;
        double altura;
        double area;
        System.out.println("Ingrese el valor de la base");
        lado = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        area = (lado * altura);
        System.out.printf("El area de su rectangulo es: %.2f", area);

    }
}
