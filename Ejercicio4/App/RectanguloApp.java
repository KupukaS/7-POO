/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
 base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
 los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
 superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
 tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
 altura. Se deberán además definir los métodos getters, setters y constructores
 correspondientes.
 Superficie = base * altura / Perímetro = (base + altura) * 2.
*/

package Ejercicio4.App;

import Ejercicio4.Entidades.Rectangulo;
import Ejercicio4.Servicios.ServiciosRectangulo;

public class RectanguloApp {

    public static void main(String[] args) {

        ServiciosRectangulo r = new ServiciosRectangulo();
        Rectangulo r1 = r.crearRectangulo();
        r.superficie(r1);
        r.perimetro(r1);
        r.mostrarRectangulo(r1);
        System.out.println("-----------------------------------");
        r.mostrarRectangulohueco(r1);

      

    }
}
