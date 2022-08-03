package Ejercicio6.Servicios;

import java.util.Scanner;

import Ejercicio6.Entidades.Cafetera;

public class ServiciosCafetera {

    Scanner scanner = new Scanner(System.in);

    // Funcion para crear una Cafetera
    public Cafetera crearCafetera() {
        System.out.println("Ingrese capacidad maxima");
        int capacidadMaxima = scanner.nextInt();
        System.out.println("Ingrese cantidad actual");
        int cantidadActual = scanner.nextInt();
        return new Cafetera(capacidadMaxima, cantidadActual);
    }

    // Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
    // máxima.
    public void llenarCafetera(Cafetera c1) {

        c1.setCapacidadMaxima(c1.getCantidadActual());

    }

    // Método servirTaza(int):
    public void servirTaza(Cafetera c1) {
        
        System.out.println("Ingrese la capacidad de la taza(60,120,160 ml)");
        int taza = scanner.nextInt();
        if (c1.getCantidadActual() >= taza) {
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("Se sirvio la taza entera");
        } else {
            System.out.println("No alcanza para llenar la taza\nSe sirvió en la taza " + c1.getCantidadActual() + "ml de cafe");
            c1.setCantidadActual(0);
        }
    }

    // Método vaciarCafetera(): pone la cantidad de cafe actual en 0
    public void vaciarCafetera(Cafetera c1) {
        
        System.out.println("Se vacio la cafetera");
        c1.setCantidadActual(0);
    }

    // Método agregarCafe:
    public void agregarCafe(Cafetera c1) {
      
        // se pide la cantidad a agregar
        System.out.println("Ingrese la cantidad de cafe a agregar.");
        c1.setCantidadActual(c1.getCantidadActual() + scanner.nextInt());
        
    }
}
