/* EJERCICIO7
//Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
// ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
// atributo, puede hacerlo. Los métodos que se implementarán son:
// • Un constructor por defecto.
// • Un constructor con todos los atributos como parámetro.
// • Métodos getters y setters de cada atributo.
// • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
// usuario y después se le asignan a sus respectivos atributos para llenar el objeto
// Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
// Si no es correcto se deberá mostrar un mensaje
// • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
// kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
// que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
// fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
// está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
// fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
// función devuelve un 1.
// • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
// un booleano.
// A continuación, en la clase main hacer lo siguiente:
// Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
// los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
// sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
// mayor de edad.
// Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
// distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
// cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
// también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
*/

package Ejercicio7.App;

import Ejercicio7.Entidades.Persona;
import Ejercicio7.Servicios.PersonaService;

public class App {
    public static void main(String[] args) {
        PersonaService ps = new PersonaService();

        int porcentajeDebajo = 0;
        int porcentajeEnPesoIdeal = 0;
        int porcentajePorEncima = 0;
        int porcentajeMayorDeEdad = 0;
        int porcentajeMenorDeEdad = 0;

// PERSONA1-----------------------------------------------------------------------

        System.out.println("----------------------------------------------------------------");
        // Creamos persona1
        Persona persona1 = ps.crearPersona();
        // mostramos persona1
        ps.mostrarPersona(persona1);
        // calculamos IMC persona1
        ps.calcularIMC(persona1);

        // contamos para calcular % segun IMC
        if (persona1.getIMC() == -1) {
            porcentajeDebajo++;
        } else if (persona1.getIMC() == 0) {
            porcentajeEnPesoIdeal++;
        } else if (persona1.getIMC() == 1) {
            porcentajePorEncima++;
        }
        // calculamos si es mayor de edad
        ps.esMayorDeEdad(persona1);

        // contamos para calcular % segund edad
        if (persona1.getMayorDeEdad()) {
            porcentajeMayorDeEdad++;
        } else {
            porcentajeMenorDeEdad++;
        }

        System.out.println("----------------------------------------------------------------");

// PERSONA2------------------------------------------------------------------------------------------------

        // Creamos persona2
        Persona persona2 = ps.crearPersona();
        // mostramos persona2
        ps.mostrarPersona(persona2);
        // calculamos IMC persona2
        ps.calcularIMC(persona2);
        // contamos para calcular % segun IMC
        if (persona2.getIMC() == -1) {
            porcentajeDebajo++;
        } else if (persona2.getIMC() == 0) {
            porcentajeEnPesoIdeal++;
        } else if (persona2.getIMC() == 1) {
            porcentajePorEncima++;
        }
        // calculamos si es mayor de edad
        ps.esMayorDeEdad(persona2);

        // contamos para calcular % segund edad
        if (persona2.getMayorDeEdad()) {
            porcentajeMayorDeEdad++;
        } else {
            porcentajeMenorDeEdad++;
        }

        System.out.println("----------------------------------------------------------------");

// PERSONA3------------------------------------------------------------------------------------------------
        // Creamos persona3
        Persona persona3 = ps.crearPersona();

        // mostramos persona3
        ps.mostrarPersona(persona3);

        // calculamos IMC persona3
        ps.calcularIMC(persona3);

        // contamos para calcular % segun IMC
        if (persona3.getIMC() == -1) {
            porcentajeDebajo++;
        } else if (persona3.getIMC() == 0) {
            porcentajeEnPesoIdeal++;
        } else if (persona3.getIMC() == 1) {
            porcentajePorEncima++;
        }

        // calculamos si es mayor de edad
        ps.esMayorDeEdad(persona3);

        // contamos para calcular % segund edad
        if (persona3.getMayorDeEdad()) {
            porcentajeMayorDeEdad++;
        } else {
            porcentajeMenorDeEdad++;
        }

        System.out.println("----------------------------------------------------------------");

// PERSONA4------------------------------------------------------------------------------------------------

        // Creamos persona4
        Persona persona4 = ps.crearPersona();

        // mostramos persona4
        ps.mostrarPersona(persona4);

        // calculamos IMC persona4
        ps.calcularIMC(persona4);

        // contamos para calcular % segun IMC
        if (persona4.getIMC() == -1) {
            porcentajeDebajo++;
        } else if (persona4.getIMC() == 0) {
            porcentajeEnPesoIdeal++;
        } else if (persona4.getIMC() == 1) {
            porcentajePorEncima++;
        }
        // calculamos si es mayor de edad
        ps.esMayorDeEdad(persona4);

        // contamos para calcular % segun edad
        if (persona4.getMayorDeEdad()) {
            porcentajeMayorDeEdad++;
        } else {
            porcentajeMenorDeEdad++;
        }

        System.out.println("----------------------------------------------------------------");

//Muestro porcetajes------------------------------------------------------------------------------  

        System.out.println("Porcentaje de personas por debajo de su peso ideal: " +
        (porcentajeDebajo * 100 / 4) + "%");
        System.out.println("Porcentaje de personas en su peso ideal: " +
        (porcentajeEnPesoIdeal * 100 /4) + "%");
        System.out.println("Porcentaje de personas por encima de su peso ideal: " +
        (porcentajePorEncima * 100 / 4) + "%");
        System.out.println("Porcentaje de personas mayores de edad: " +
        (porcentajeMayorDeEdad * 100 / 4) + "%");
        System.out.println("Porcentaje de personas menores de edad: " +
        (porcentajeMenorDeEdad * 100 / 4) + "%");        
       
/*     // METODO POR ARRAYS

        // //Creo numero como fijo
        // int N = 4;
        // //Creo array de tipo persona
        // Persona[] personas = new Persona[N];
        // for (int i = 0; i < personas.length; i++) {
        // personas[i] = ps.crearPersona();
        // }

        // //Muestro ingreso
        // for (int i = 0; i < personas.length; i++){
        // System.out.println(personas[i]);
        // }
        // //Calculo IMC
        // double[] imc = new double[N];
        // for (int i = 0; i < personas.length; i++) {
        // imc[i] = ps.calcularIMC(personas[i]);
        // }
        // //Calculo si es mayor de edad
        // boolean[] mayorDeEdad = new boolean[N];
        // for (int i = 0; i < personas.length; i++) {
        // mayorDeEdad[i] = ps.esMayorDeEdad(personas[i]);
        // }
        // //Calculo porcentaje de personas
        // int porcentajeDebajo = 0;
        // int porcentajeEnPesoIdeal = 0;
        // int porcentajePorEncima = 0;
        // int porcentajeMayorDeEdad = 0;
        // int porcentajeMenorDeEdad = 0;
        // for (int i = 0; i < personas.length; i++) {
        // if (imc[i] == -1) {
        // porcentajeDebajo++;
        // } else if (imc[i] == 0) {
        // porcentajeEnPesoIdeal++;
        // } else if (imc[i] == 1) {
        // porcentajePorEncima++;
        // }

        // if (mayorDeEdad[i]) {
        // porcentajeMayorDeEdad++;
        // } else {
        // porcentajeMenorDeEdad++;
        // }
        // }
        //Muestro porcentaje de personas
        // System.out.println("Porcentaje de personas por debajo de su peso ideal: " +
        // (porcentajeDebajo * 100 / 4) + "%");
        // System.out.println("Porcentaje de personas en su peso ideal: " +
        // (porcentajeEnPesoIdeal * 100 /4) + "%");
        // System.out.println("Porcentaje de personas por encima de su peso ideal: " +
        // (porcentajePorEncima * 100 / 4) + "%");
        // System.out.println("Porcentaje de personas mayores de edad: " +
        // (porcentajeMayorDeEdad * 100 / 4) + "%");
        // System.out.println("Porcentaje de personas menores de edad: " +
        // (porcentajeMenorDeEdad * 100 / 4) + "%");
*/

    }


}
