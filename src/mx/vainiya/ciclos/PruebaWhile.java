package mx.vainiya.ciclos;

public class PruebaWhile {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10);
        while (num <= 10) {
            System.out.printf("%d - Hola Mundo\n", num);
            num++;
        }
        System.out.println("Fin del programa");
    }

}
