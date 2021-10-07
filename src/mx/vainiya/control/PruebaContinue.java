package mx.vainiya.control;

import java.util.List;

public class PruebaContinue {

    public static void main(String[] args) {
        List<String> lenguajes = List.of("Java", "CSharp", "Kotlin", "Scala", "Python");
        for (String lng : lenguajes) {
            if (lng.startsWith("S")) continue;
            System.out.printf("Lenguaje de programación: %s\n", lng);
        }
        System.out.println("Fin del programa");
    }

}
