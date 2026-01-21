import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        //Declaramos un scanner
        Scanner sc = new Scanner(System.in);
        //Creamos una lista de string listaPalabras
        List<String> listaPalabras = new ArrayList<>();
        //Le pedimos al usuario que introduzca palabras, si escribe 'fin' termina el programa
        System.out.println("Introduce palabras (escribe 'fin' para terminar):");

        //Declaramos una variable palabra
        String palabra;

        //A traves de un bucle do-while le el usuario escribe palabras y las añade a listaPalabras
        do {
            palabra = sc.next();
            if (!palabra.equalsIgnoreCase("fin")) {
                listaPalabras.add(palabra);
            }
        } while (!palabra.equalsIgnoreCase("fin"));

        //Creamos un HastSet de palabras con el contenido de listaPalabras
        HashSet<String> palabras = new HashSet<>(listaPalabras);

        //Al final imprimimos el contenido de palabras, viendo que no permite duplicados
        System.out.println("Palabras únicas:");
        for (String p : palabras) {
            System.out.println(p);
        }


    }
}