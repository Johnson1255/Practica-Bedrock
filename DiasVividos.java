import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DiasVividos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Día de nacimiento (En Números)");
        int dia = teclado.nextInt();

        System.out.println("Mes de nacimiento (En Números)");
        int mes = teclado.nextInt();

        System.out.println("Año de nacimiento (En Números)");
        int año = teclado.nextInt();

        teclado.close();
    }
}
