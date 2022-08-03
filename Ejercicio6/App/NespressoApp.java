// Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
// (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
// actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
// • Constructor predeterminado o vacío
// • Constructor con la capacidad máxima y la cantidad actual
// • Métodos getters y setters.
// • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
// • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
// tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
// cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
// método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
// cuanto quedó la taza.
// • Método vaciarCafetera(): pone la cantidad de café actual en cero.
// • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
// recibe y se añade a la cafetera la cantidad de café indicada.

package Ejercicio6.App;

import Ejercicio6.Entidades.Cafetera;
import Ejercicio6.Servicios.ServiciosCafetera;

public class NespressoApp {

    public static void main(String[] args) {

        // Creo objeto de servicio de cafetera
        ServiciosCafetera serv = new ServiciosCafetera();

        // Creo cafetera
        Cafetera cafetera1 = serv.crearCafetera();
        System.out.println(cafetera1);

        

        // Lleno cafetera
        serv.llenarCafetera(cafetera1);
        System.out.println(cafetera1);

        System.out.println("-------------------------------");

        // Sirvo una taza
        serv.servirTaza(cafetera1);
        System.out.println(cafetera1);

        System.out.println("-------------------------------");

        // Vacio cafetera
        serv.vaciarCafetera(cafetera1);
        System.out.println(cafetera1);

        System.out.println("-------------------------------");

        // Agrego cafe
        serv.agregarCafe(cafetera1);
        System.out.println(cafetera1);

        // Lleno cafetera
        serv.llenarCafetera(cafetera1);
        System.out.println(cafetera1);
    }
}
