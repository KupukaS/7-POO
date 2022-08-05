
package Ejercicio7.Entidades;

public class Persona {
    public String nombre;
    public Integer edad;
    public Double peso;
    public Double altura;
    public char sexo;
    public int IMC;
    public boolean mayorDeEdad;

    // CONTRUCTOR POR DEFECTO
    public Persona() {
    }

    // CONTRUCTOR POR PARAMETROS
    public Persona(String nombre, Integer edad, Double peso, Double altura, char sexo, int IMC) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.IMC = IMC;
    }

    // GETTER & SETTER NOMBRE
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // GETTER & SETTER EDAD
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    // GETTER & SETTER PESO
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    // GETTER & SETTER ALTURA
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    // GETTER & SETTER SEXO
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;

    }

    // GETTER & SETTER IMC
    public int getIMC() {
        return IMC;
    }
    public void setIMC(int iMC) {
        this.IMC = iMC;
    }

    // GETTER & SETTER esMayorDeEdad
    public boolean getMayorDeEdad() {
        return mayorDeEdad;
    }
    public void setMayorDeEdad(boolean mayorDeEdad) {
        this.mayorDeEdad = mayorDeEdad;
    }
    //método toString()
    @Override
    public String toString() {
        return "Persona [ Nombre="+ nombre + ", Edad=" + edad + ", Sexo=" + sexo + ", Altura=" + altura + ", Peso=" + peso + ", IMC=" + IMC + ",esMayorDeEdad=" + mayorDeEdad +"]";
    }

}
