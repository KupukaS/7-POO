package Ejercicio2.Servicios;

import java.util.Scanner;
import Ejercicio2.Entidades.Circunferencia;
import java.lang.Math;

public class ServicioCircunferencia {

    Scanner scanner = new Scanner(System.in);

    // Método para crear circunferencia
    public Circunferencia crearCircunferencia() {
        Circunferencia c1 = new Circunferencia();
        System.out.println("Ingrese el radio de la circunferencia:");
        c1.setRadio(scanner.nextDouble());
        return c1;

    }

    // *Funcion para calcular area
    public void area(Circunferencia c1) {

        System.out.println("El area es: " + (Math.PI) * Math.pow(c1.getRadio(), 2));

    }

    // *Funcion para calcular perimetro
    public void perimetro(Circunferencia c1) {
    
            System.out.println("El perimetro es: " + (2 * Math.PI * c1.getRadio()));
    }        

    public void mostrarCircunferencia(Circunferencia c1) {
        System.out.println("El radio es: " + c1.getRadio());

    }

}
