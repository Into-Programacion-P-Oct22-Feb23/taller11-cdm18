/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejercicio4 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * * Generar un procedimiento para calcular el valor de la planilla de luz
     * y otro procedimiento para calcular el valor del predio de un bien
     * inmueble. Cada procedimiento debe tener 2 parámetros (tipo cadena para
     * nombre del cliente, cédula del cliente).      *
     * En el procedimiento de planilla de luz se debe pedir los siguiente datos
     * valor del kilowatio y el número de kilowatios del mes. Y se presenta en
     * pantalla el siguiente reporte: Cliente Ana Contreras con cédula
     * 1100112233 debe cancelar el valor de $10
     *
     * En el procedimiento del predio se debe pedir el valor de inmueble y el
     * para obtener el valor del predio se saca el 2% del valor del inmueble. Y
     * se presenta el siguiente reporte:
     *
     * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble
     * valorado en $30000 y tiene que pagar de predio $ 600.
     *
     * En el método principal; si el usuario ingresa 1 se llama al procedimiento
     * calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos
     * que se necesita en cada procedimiento se los debe ingresar por teclado.
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "";
        String cedula = "";

        int opcion;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su cedula");
        cedula = entrada.nextLine();

        System.out.println("Ingrese 1 para calcular la planilla de luz o 2 para "
                + "calcular el valor del predio");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            calcularValorLuz(nombre, cedula);

        } else if (opcion == 2) {
            calcularPredio(nombre, cedula);
        } else {
            System.out.println("ERROR");
        }
    }

    public static void calcularValorLuz(String a, String b) {
        entrada.useLocale(Locale.US);

        double kvMes;
        double valorKv;
        System.out.println("Ingrese los Kilovatios consumidos en el mes");
        kvMes = entrada.nextDouble();
        System.out.println("Ingrese el precio del kilovatio/hora");
        valorKv = entrada.nextDouble();
        double operacion = kvMes * valorKv;
        System.out.printf("Cliente: %s con cedula de %s debe cancelar el valor de"
                + "$ %.2f", a, b, operacion);

    }

    public static void calcularPredio(String a, String b) {
        entrada.useLocale(Locale.US);

        double valor;
        double predio;
        System.out.println("Ingrese el valor de bien inmueble");
        valor = entrada.nextDouble();

        predio = (valor * 2) / 100;
        System.out.printf("Cliente: %s con cedula de %s tiene un bien inmueble"
                + " valorado en $ %.2f y tiene que pagar de predio %.2f",
                a, b, valor, predio);

    }

}
