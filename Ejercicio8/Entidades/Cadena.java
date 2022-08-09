package Ejercicio8.Entidades;

public class Cadena {
    // Parametros
    private String frase;
    private int longitud;

    //Getters and setters Frase
    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    //Getters and setters Longitud
    public int getLongitud() {
        return this.longitud;   
    }

    //public void setLongitud(int longitud) {
       
    //}


    // Constructor por defecto
    public Cadena() {
    }

    // Constructor con frase
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    // toString
    public String toString() {
        return "Frase: " + this.frase + " Longitud: " + this.longitud;
    }


}
