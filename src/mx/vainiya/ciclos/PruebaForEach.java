package mx.vainiya.ciclos;

public class PruebaForEach {

    public static void main(String[] args) {
        String lenguajes[] = {"Java", "CSharp", "Python", "Kotlin", "Perl", "Scala"};
        for (String cad : lenguajes) {
            System.out.printf("Lenguaje de programación: %s \n", cad);
        }
        System.out.println("Fin del programa");
    }

}
