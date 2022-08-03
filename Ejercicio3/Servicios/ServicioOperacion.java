package Ejercicio3.Servicios;

import Ejercicio3.Entidades.Operacion;
import java.util.Scanner;

public class ServicioOperacion {

    Scanner scanner = new Scanner(System.in);

    // Método para crear operacion    
    public Operacion crearOperacion() {
        Operacion o1 = new Operacion();
        System.out.println("Ingrese el primer número:");
        o1.setNumero1(scanner.nextDouble());

        System.out.println("Ingrese el segundo número");
        o1.setNumero2(scanner.nextDouble());
        return o1;
    }

    // Metodo sumar
    public double sumar(Operacion o1) {
        //Operacion o1 = new Operacion();
        double suma = (o1.getNumero1() + o1.getNumero2());
        return suma ;

    }

    // Metodo restar
    public double restar(Operacion o1) {
        
        return (o1.getNumero1() - o1.getNumero2());

    }

    // Metodo multiplicar
    public double multiplicar(Operacion o1) {
        
        if (o1.getNumero1() == 0 || o1.getNumero2()== 0) {
            System.out.println("ERROR!. Se esta multiplicando por cero");
            return 0;
        } else {
            return o1.getNumero1() * o1.getNumero2();
        }
    }

    // Metodo dividir
    public double dividir(Operacion o1) {
        
        if (o1.getNumero1() == 0 || o1.getNumero2()== 0) {
            System.out.println("ERROR. Se esta dividiendo por cero");
            return 0;
        } else {
            return o1.getNumero1() / o1.getNumero2();
        }
    }
}