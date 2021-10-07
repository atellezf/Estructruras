package mx.vainiya.ciclos;

public class PruebaDoWhile {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 10);
        do {
            System.out.printf("%d - Hola mundo\n", num);
            num++;
        } while (num <= 10);
        System.out.println("Fin del programa");
    }

}
