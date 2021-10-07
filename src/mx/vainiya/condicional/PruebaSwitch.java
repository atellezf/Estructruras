package mx.vainiya.condicional;

public class PruebaSwitch {

    public static void main(String[] args) {
        int dia = (int) (Math.random() * 6);
        PruebaSwitch prog = new PruebaSwitch();
//        prog.seleccionaDia(dia);
//        prog.clasificaDia(dia);
//        prog.muestraTalla(Talla.GRANDE);
        String mensaje = prog.expresion(dia);
        System.out.println(mensaje);
    }

    private String expresion(int dia) {
        String cadenaDia = switch (dia) {
            case 0 -> "lunes";
            case 1 -> "martes";
            case 2 -> "miércoles";
            case 3 -> "jueves";
            case 4 -> "viernes";
            case 5 -> "sábado";
            case 6 -> "domingo";
            default -> "día inválido";
        };
        return "El día de hoy es %s".formatted(cadenaDia);
    }

    private void muestraTalla(Talla talla) {
        switch (talla) {
            case EXTRA_CHICA:
                System.out.println("Seleccionaste la talla: extra chica.");
                break;
            case CHICA:
                System.out.println("Seleccionaste la talla: chica.");
                break;
            case MEDIANA:
                System.out.println("Seleccionaste la talla: mediana.");
                break;
            case GRANDE:
                System.out.println("Seleccionaste la talla: grande.");
                break;
            case EXTRA_GRANDE:
                System.out.println("Seleccionaste la talla: extra grande.");
                break;
        }
        System.out.println("Fin del programa");
    }

    private void clasificaDia(int dia) {
        switch (dia) {
            case 0, 1, 2, 3, 4:
                System.out.println("Es un día laboral");
                break;
            case 5, 6:
                System.out.println("Es fin de semana");
                break;
            default:
                System.out.println("Número de día inválido");
                break;
        }
        System.out.println("Fin del programa");
    }

    private void seleccionaDia(int dia) {
        // enteros, String, enums
        switch (dia) {
            case 0:
                System.out.println("El día de hoy es lunes");
                System.out.println("Es día laboral");
                break;
            case 1:
                System.out.println("El día de hoy es martes");
                System.out.println("Es día laboral");
                break;
            case 2:
                System.out.println("El día de hoy es miércoles");
                System.out.println("Es día laboral");
                break;
            case 3:
                System.out.println("El día de hoy es jueves");
                System.out.println("Es día laboral");
                break;
            case 4:
                System.out.println("El día de hoy es viernes");
                System.out.println("Es día laboral");
                break;
            case 5:
                System.out.println("El día de hoy es sábado");
                System.out.println("Es fín de semana");
                break;
            case 6:
                System.out.println("El día de hoy es domingo");
                System.out.println("Es fín de semana");
                break;
            default:
                System.out.println("El día generado es inválido");
                break;
        }
        System.out.println("Fin del programa");
    }

}
