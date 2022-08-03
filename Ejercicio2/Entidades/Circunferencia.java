package Ejercicio2.Entidades;

public class Circunferencia {
    // defino parametros de la clase
    public Double radio;

    // constructor vacio
    public Circunferencia() {

    }    
   
    // constructor con parametros
    public Circunferencia(Double radio) {

    }

    // defino setter
    public void setRadio(Double radio) {
        this.radio = radio;
    }

    //defino getter
    public Double getRadio() {
        return radio;
    }
    //To String para mostrarlo
    @Override
    public String toString() {
        return "Radio=" + radio + "]";
    }

}
