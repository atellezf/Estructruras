package mx.vainiya.condicional;

public class PruebaIFComp {

    public static void main(String[] args) {
        int edad = (int) (Math.random() * 100);
        if (edad < 10) {
            System.out.println("Tienes menos de 10 años");
        } else if (edad < 20) {
            System.out.println("Tienes menos de 20 años");
        } else if (edad < 30) {
            System.out.println("Tienes menos de 30 años");
        } else {
            System.out.println("Eres mayor a 30 años");
        }
        System.out.println("Fin del programa");
    }

}
