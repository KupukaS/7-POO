/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = pi * r^2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * pi * r).
 
*/
package Ejercicio2.app;

import Ejercicio2.Entidades.Circunferencia;
import Ejercicio2.Servicios.ServicioCircunferencia;

public class CircunferenciaApp {

 
    public static void main(String[] args) {

        ServicioCircunferencia c = new ServicioCircunferencia();
        Circunferencia c1 = c.crearCircunferencia();
        c.mostrarCircunferencia(c1);
        c.area(c1);
        c.perimetro(c1);
    
    }
}    
