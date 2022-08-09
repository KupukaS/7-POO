/*Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/

package Ejercicio8.App;

import java.util.Scanner;

import Ejercicio8.Entidades.Cadena;
import Ejercicio8.Servicios.CadenaService;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        CadenaService cs = new CadenaService();

        //Crear objeto Cadena
        Cadena cadena = new Cadena();
        //Pedir al usuario que ingrese una frase
        System.out.println("Ingrese una frase:");
        cadena.setFrase(scanner.nextLine());
        System.out.println("----------------------------------------------------");
        //Mostrar vocales
        System.out.println("La frase ingresada tiene " + cs.mostrarVocales(cadena) + " vocales");
        System.out.println("----------------------------------------------------");
        //Invertir frase
        cs.invertirFrase(cadena);
        System.out.println("----------------------------------------------------");
        //Veces repetido
        System.out.println("Ingrese una letra:");
        cs.vecesRepetido(cadena,scanner.nextLine());
        System.out.println("----------------------------------------------------");
        //Comparar longitud
        System.out.println("Ingrese una frase:");
        cs.compararLongitud(cadena,scanner.nextLine());
        System.out.println("----------------------------------------------------");
        //Unir frases
        System.out.println("Ingrese una frase:");
        cs.unirFrases(cadena,scanner.nextLine());
        System.out.println("----------------------------------------------------");
        //Reemplazar
        System.out.println("Ingrese una letra:");
        cs.reemplazar(cadena,scanner.nextLine());
        System.out.println("----------------------------------------------------");
        //Contiene
        System.out.println("Ingrese una letra:");        
        System.out.println(cs.contiene(cadena,scanner.nextLine()));
        System.out.println("----------------------------------------------------");
    
    }
    
}
