import java.util.*;

public class DiasVividos {

    public static void main(String[] args) {
        char seguir = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("DD/MM/AAAA");
            System.out.println("Escribe tu fecha de Nacimiento: ");
            String nacimientoFecha = teclado.next();

            System.out.println("Escribe la fecha de hoy: ");
            String fechaHoy = teclado.next();

            String[] fecha = nacimientoFecha.split("/");
            Integer nacimientoDia = Integer.parseInt(fecha[0]);
        }
    }
}