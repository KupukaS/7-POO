package Ejercicio8.Servicios;

import Ejercicio8.Entidades.Cadena;

public class CadenaService {

    // Metodo mostrarVocales
    public int mostrarVocales(Cadena c1) {
        //Cadena c1 = new Cadena();
        int contador = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().charAt(i) == 'a' || c1.getFrase().charAt(i) == 'e' || c1.getFrase().charAt(i) == 'i'
                    || c1.getFrase().charAt(i) == 'o' || c1.getFrase().charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }

    // Metodo invertirFrase
    public void invertirFrase(Cadena c1) {
        //Cadena c1 = new Cadena();
        String fraseInvertida = "";
        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += c1.getFrase().charAt(i);
        }
        System.out.println("Entrada: " + c1.getFrase() + "\nSalida: " + fraseInvertida);
    }

    // Metodo vecesRepetido
    public void vecesRepetido(Cadena c1,String letra) {
        //Cadena c1 = new Cadena();
        int contador = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            if (c1.getFrase().charAt(i) == letra.charAt(0)) {
                contador++;
            }
        }
        System.out.println(
                "Frase: " + c1.getFrase() + "\nSalida: El caracter '" + letra + "' se repite " + contador + " veces.");
    }

    // Metodo compararLongitud
    public void compararLongitud(Cadena c1, String frase) {
        //Cadena c1 = new Cadena();
        if (c1.getLongitud() > frase.length()) {
            System.out.println("La frase: " + c1.getFrase() + " es mas larga que la frase: " + frase);
        } else if (c1.getLongitud() < frase.length()) {
            System.out.println("La frase: " + c1.getFrase() + " es mas corta que la frase: " + frase);
        } else {
            System.out.println("La frase: " + c1.getFrase() + " es igual de larga que la frase: " + frase);
        }
    }

    // Metodo unirFrases
    public void unirFrases(Cadena c1,String frase) {
        //Cadena c1 = new Cadena();
        System.out.println(c1.getFrase() + " " + frase);
    }

    // Metodo reemplazar
    public void reemplazar(Cadena c1, String letra) {
        //Cadena c1 = new Cadena();
        System.out.println( c1.getFrase().replace("a",letra));
    }

    //Metodo contiene
    public boolean contiene(Cadena c1, String letra){

        //Cadena c1 = new Cadena();
        if (c1.getFrase().contains(letra)){
            System.out.println("Si Contiene la letra: "+letra);
            return true;
            }else{
                System.out.println("NO Contiene la letra: "+letra);
                return false;

        }
    }
    
}
