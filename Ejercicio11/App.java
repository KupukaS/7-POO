/*
  Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */

package Ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dia, mes, anio;
        System.out.println("Introduce el dia: ");
        dia = scanner.nextInt();
        System.out.println("Introduce el mes: ");
        mes = scanner.nextInt();
        System.out.println("Introduce el anio: ");
        anio = scanner.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);//este método se encuentra obsoleto pero se usa a pedido del ejercicio.
        

        System.out.println("------------------------------------------------------");
        System.out.println("Fecha: " + fecha.toString());
        Date fechaActual = new Date();
        System.out.println("------------------------------------------------------");
        System.out.println("Fecha actual: " + fechaActual.toString());
        System.out.println("------------------------------------------------------");
        int diferencia =  (fechaActual.getYear() - fecha.getYear());
        System.out.println("Años entre la fecha introducida y la fecha actual: " + diferencia + "años.");
        System.out.println("------------------------------------------------------");

    }

}
