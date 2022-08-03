package Ejercicio5.Entidades;

public class Cuenta {
    //Defino atributos numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero)    
    private int numeroCuenta;
    private long dni;   
    private double saldo;

    //constructor por defecto
    public Cuenta() {
    }
    
    //constructor por parametros
    public Cuenta(int numeroCuenta, long dni, double saldo, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    //getter y setter numeroCuenta
    public int getNumeroCuenta() {
        
        return numeroCuenta;
    } 
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    //getter y setter DNI
    public long getDni() {
        
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
   
    //getter y setter saldo
    public double getSaldo() {
        
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
