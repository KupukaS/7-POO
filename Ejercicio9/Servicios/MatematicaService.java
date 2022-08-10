package Ejercicio9.Servicios;

import javax.sound.sampled.SourceDataLine;

import Ejercicio9.Entidades.Matematica;
import Ejercicio9.Utilidades.Utilidad;

public class MatematicaService {

    // Método crearMatematica()
    public Matematica crearMatematica() {
        Matematica m1 = new Matematica();
        m1.setNumero1(Math.round(Math.random() * 10));
        m1.setNumero2(Math.round(Math.random() * 10));

        return m1;
    }

    // Metodo devolverMayor()
    public double devolverMayor(Matematica m1) {
        System.out.println("Número mayor: " + Utilidad.esMayor(m1.getNumero1(), m1.getNumero2()));
        return Math.max(m1.getNumero1(), m1.getNumero2());
    }

    // Metodo devolverMenor()
    public double devolverMenor(Matematica m1) {

        return Math.min(m1.getNumero1(), m1.getNumero2());
    }

    // Método calcularPotencia()

    public double calcularPotencia(Matematica m1) {
        System.out.println("Número mayor potenciado por el numero menor: "
                + Math.pow((Utilidad.esMayor(m1.getNumero1(), m1.getNumero2())),
                        Utilidad.esMenor(m1.getNumero1(), m1.getNumero2())));
        return Math.pow((Utilidad.esMayor(m1.getNumero1(), m1.getNumero2())),
                Utilidad.esMenor(m1.getNumero1(), m1.getNumero2()));
    }

    // Método calculaRaiz()
    public double calculaRaiz(Matematica m1) {
        System.out.println(
                "Raiz cuadrada del número menor: " + Math.sqrt((Math.abs(Math.min(m1.getNumero1(), m1.getNumero2())))));
        return Math.round(Math.sqrt((Math.abs(Math.min(m1.getNumero1(), m1.getNumero2())))));
    }
}
