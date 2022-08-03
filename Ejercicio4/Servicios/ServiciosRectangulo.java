package Ejercicio4.Servicios;

import java.util.Scanner;
import Ejercicio4.Entidades.Rectangulo;

public class ServiciosRectangulo {

    Scanner scanner = new Scanner(System.in);

    // Método para crear rectangulo

    public Rectangulo crearRectangulo() {
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese la base del rectángulo:");
        r1.setBase(scanner.nextInt());

        System.out.println("Ingrese la altura del rectángulo:");
        r1.setAltura(scanner.nextInt());
        return r1;
    }

    // Método para calcular la superficie
    public void superficie(Rectangulo r1) {
        System.out.println("La superficie del rectángulo es:" + (r1.getBase() * r1.getAltura()));
    }

    // Método para calcular el perimetro
    public void perimetro(Rectangulo r1) {
        System.out.println("Perimetro del rectángulo es:" + (r1.getBase() + r1.getAltura())*2);
    }

    // Método para mostrar el rectángulo solido.
    public void mostrarRectangulo(Rectangulo r1) {
        System.out.println("Rectangulo Relleno");
        for (int altura = 1; altura <= r1.getAltura(); altura++) {
            for (int base = 1; base <= r1.getBase(); base++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    // Método para mostrar el rectángulo hueco.
    public void mostrarRectangulohueco(Rectangulo r1) {
        System.out.println("Rectangulo Hueco");
        for (int altura = 1; altura <= r1.getAltura(); altura++) {
            for (int base = 1; base <= r1.getBase(); base++) {
                if ((altura==1) || (altura==r1.getAltura()) || (base==1) || (base==r1.getBase())) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }                 
            }System.out.println();
            
        }

    }

}
