package mx.vainiya.control;

import java.util.List;

public class PruebaBreak {

    public static void main(String[] args) {
        List<String> lenguajes = List.of("Java", "CSharp", "Kotlin", "Scala", "Python");
        for (String lng : lenguajes) {
            System.out.printf("Lenguaje de programación: %s\n", lng);
            if (lng.startsWith("K")) {
                System.out.println("Se encontró la coincidencia.");
                break;
            }
        }
        System.out.println("Fin del programa");
    }

}
