package mx.vainiya.condicional;

public class OperadorTernario {

    public static void main(String[] args) {
        int calificacion = (int) (Math.random() * 10);
        String mensaje = calificacion > 5 ? "Calificación aprobatoria" : "Calificación reprobatoria";
        System.out.println(mensaje);
    }

}
