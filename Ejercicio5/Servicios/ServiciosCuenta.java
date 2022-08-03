package Ejercicio5.Servicios;

import java.util.Scanner;

import Ejercicio5.Entidades.Cuenta;

public class ServiciosCuenta {

    Scanner scanner = new Scanner(System.in);

    // Método para crear cuenta
    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();
        // se pide el DNI
        System.out.println("Ingrese su número de DNI.");
        cuenta.setDni(scanner.nextLong());

        // se pide el número de cuenta
        System.out.println("Ingrese su número de cuenta.");
        cuenta.setNumeroCuenta(scanner.nextInt());

        // se pide el saldo de cuenta
        System.out.println("Ingrese el saldo de la cuenta.");
        cuenta.setSaldo(scanner.nextDouble());
        return cuenta;
    }

    // Método ingresar(double ingreso):
    public void ingresar(Cuenta c1, double ingreso) {
        c1.setSaldo(c1.getSaldo() + ingreso);
        System.out.println("Se ingresó: $" + ingreso + " a la cuenta.");
    }

    // Método retirar(double ingreso):
    public void retirar(Cuenta c1, double retiro) {
        if (c1.getSaldo() >= retiro) {
            System.out.println("Se retiraron $" + retiro + " de la cuenta.");
            c1.setSaldo(c1.getSaldo() - retiro);
        } else {
            System.out.println("Se ha retirado el saldo restante.");
            System.out.println("Se retiraron " + c1.getSaldo() + " de la cuenta.");
            c1.setSaldo(0);
        }
    }

    // Metodo extraccionRapida():
    public void extraccionRapida(Cuenta c1) {
        
        System.out.println("Se realizó una extracción Rápida. \nSe extrajo $" + (c1.getSaldo() * 0.2) + " de la cuenta.");
        c1.setSaldo(c1.getSaldo()-(c1.getSaldo() * 0.2));        
    }

    // Metodo consultarSaldo
    public void consultarSaldo(Cuenta c1) {
        System.out.println("El saldo actual es $" + c1.getSaldo()+".");
    }

    // Metodo consultarDatos
    public void consultarDatos(Cuenta c1) {
        System.out.println("Numero de cuenta: " + c1.getNumeroCuenta());
        System.out.println("DNI: " + c1.getDni());
        System.out.println("Saldo: $" + c1.getSaldo());

    }

}
