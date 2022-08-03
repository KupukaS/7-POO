/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Ejercicio1.App;

import Ejercicio1.entidades.Libro;
import Ejercicio1.servicios.ServicioLibro;


public class Ejercicio1 {

  public static void main(String[] args) {
      
      ServicioLibro sl = new ServicioLibro();
      
      Libro l1 = sl.crearLibro();
      
      System.out.println(l1);
      
      
    }
    
}
