package Ejercicio9.Entidades;

public class Matematica {
    // Parametros
    private double numero1;

    private double numero2;
    // Getters and setters numero1
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    //Getters and setters numero2
    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    //Constructor vacio
    public Matematica() {
    }
    //Constructor por parametros
    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Matematica [Número1 = " + numero1 + ", Número2 = " + numero2 + "]";
    }

}
