package mx.vainiya.condicional;

public class PruebaIF {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 100);
        if (num % 2 == 0) {
            System.out.println("El número generado es par");
        } else {
            System.out.println("El número generado es impar");
        }
        System.out.println("Fin del programa");
    }

}
