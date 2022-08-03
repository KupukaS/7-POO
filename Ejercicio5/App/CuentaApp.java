// Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
// numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
// operaciones asociadas a dicha clase son:
// a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
// b) Agregar los métodos getters y setters correspondientes
// c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
// d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
// y se la sumara a saldo actual.
// e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
// restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
// saldo actual en 0.
// f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
// usuario no saque más del 20%.
// g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
// h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta




package Ejercicio5.App;

import Ejercicio5.Entidades.Cuenta;
import Ejercicio5.Servicios.ServiciosCuenta;

public class CuentaApp {
    public static void main(String[] args) {
        ServiciosCuenta s1 = new ServiciosCuenta();
        Cuenta cuenta1 = s1.crearCuenta();
        System.out.println("-------------------------------");

        s1.consultarDatos(cuenta1);
        s1.consultarSaldo(cuenta1);             
        s1.ingresar(cuenta1, 500);
        s1.consultarSaldo(cuenta1);
        s1.retirar(cuenta1, 1000);
        s1.consultarSaldo(cuenta1);
        s1.extraccionRapida(cuenta1);
        s1.consultarSaldo(cuenta1);


        System.out.println("-------------------------------");
    
    }


}
