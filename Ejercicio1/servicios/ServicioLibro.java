
package Ejercicio1.servicios;

import java.util.Scanner;

import Ejercicio1.entidades.Libro;


public class ServicioLibro {
   
   private final Scanner scanner = new Scanner(System.in); 
   
   public Libro crearLibro(){
       //Ingreso datos
        System.out.println("Ingrese ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("Ingrese título: ");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese autor: ");
        String autor = scanner.nextLine();
        System.out.println("Ingrese numero de paginas: ");
        int numeroPaginas = scanner.nextInt();
        //Retorno libro
        return new Libro(isbn, titulo, autor, numeroPaginas);
           
   }
    
   

      
}
