package Ejercicio3.Entidades;

public class Operacion {
// defino parametros de la clase
    private Double numero1;
    private Double numero2;

// constructor con parametros
    public Operacion(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
// constructor vacio
    public Operacion() {

    }
// defino getter
    public Double getNumero1() {
        return numero1;
    }
// defino setter
    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }
// defino getter
    public Double getNumero2() {
        return numero2;
    }
// defino setter
    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }
    @Override
    public String toString() {
        return "Operacion [numero1=" + numero1 + ", numero2=" + numero2 + "]";
    }

    



    


    
}
