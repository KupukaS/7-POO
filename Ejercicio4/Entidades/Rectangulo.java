package Ejercicio4.Entidades;

public class Rectangulo {

//defino atributos para la clase
    private int base;
    private int altura;

//constructor con parametros
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
//constructor vacio    
public Rectangulo() {
    }
    
//defino getter
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
//defino setter    
    public void setBase(int base) {
        this.base = base;
    }
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
//toString
    @Override
    public String toString() {
        return "Rectangulo [La altura es =" + altura + ", y la base es=" + base + "]";
    }
    


  
    
   
    
}
