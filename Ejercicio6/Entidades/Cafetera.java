package Ejercicio6.Entidades;

public class Cafetera {
    
    // Defino atributos capacidadMaxima, cantidadActual
    private int capacidadMaxima;
    private int cantidadActual;

    //Constructor vacío
    public Cafetera() {

    }
    //Constructor por parametros
    public Cafetera(int capacidadMaxima, int cantidadActual) {

        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    //Getters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public int getCantidadActual() {
        return cantidadActual;
    }
    //Setters
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    @Override
    public String toString() {
        return "Cafetera [cantidadActual=" + cantidadActual + ", capacidadMaxima=" + capacidadMaxima + "]";
    }

}
