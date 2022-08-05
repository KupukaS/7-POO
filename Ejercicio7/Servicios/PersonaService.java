package Ejercicio7.Servicios;

import java.util.Scanner;

import Ejercicio7.Entidades.Persona;

public class PersonaService {
    Scanner sc = new Scanner(System.in);
    
    //Método crearPersona()
    public Persona crearPersona() {
        // INSTANCIAR UN OBJETO DE TIPO PERSONA
        Persona p1 = new Persona();
        // Pido que ingrese el nombre
        System.out.println("Ingrese el nombre");
        p1.setNombre(sc.next());
        // Pido que ingrese la edad
        System.out.println("Ingrese la edad");
        p1.setEdad(sc.nextInt());
        // Pido que ingrese el peso
        System.out.println("Ingrese el peso en kg");
        p1.setPeso(sc.nextDouble());
        // Pido que ingrese la altura
        System.out.println("Ingrese el altura en metros");
        p1.setAltura(sc.nextDouble());
        // Pido que ingrese el sexo
        char sexo;
        do {
            System.out.println("Ingrese el sexo ('H' hombre, 'M' mujer, 'O' otro)");
            sexo = sc.next().charAt(0);
            if (sexo != 'H' && sexo != 'M' && sexo != 'O') {
                System.out.println("Error, ingrese solo \"H\"/\"M\"/\"O\".");
            }
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        p1.setSexo(sexo);
        return p1;
    }
    
    //Método mostrarPersona
    public void mostrarPersona(Persona p1) {
        System.out.println(p1.toString());
    }
    
    //Método calcularIMC
    public int calcularIMC(Persona p1) {
        if (p1.getPeso() / Math.pow(p1.getAltura(), 2) < 20) {
            System.out.println("Esta persona se encuentra por debajo de su peso ideal.\nIMC = " + (p1.getPeso() / Math.pow(p1.getAltura(), 2)) + "[-1]");
            p1.setIMC(-1);
            return -1;
        } else if (p1.getPeso() / Math.pow(p1.getAltura(), 2) > 25) {
            System.out.println("Esta persona tiene sobrepeso.\nIMC = " + (p1.getPeso() / Math.pow(p1.getAltura(), 2)) + "[1]");
            p1.setIMC(1);
            return 1;
        } else {
            System.out.println("Esta persona se encuentra dentro de su peso ideal.\nIMC = " + (p1.getPeso() / Math.pow(p1.getAltura(), 2)) + "[0]");
            p1.setIMC(0);
            return 0;
        }
    }
    
    //Método esMayorDeEdad
    public boolean esMayorDeEdad(Persona p1) {
        if (p1.getEdad() >= 18) {
            System.out.println("La persona es mayor de edad");
            p1.setMayorDeEdad(true);
            return true;
        } else {
            System.out.println("La persona no es mayor de edad");
            p1.setMayorDeEdad(false);
            return false;
        }

    }
}
