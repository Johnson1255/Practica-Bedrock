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

        System.out.println("Tu has vivido: " + Calculador(dia, mes, año));

    }

        // Revisar el codigo ya que hay errores para calcular los dias vividos, se ha podido calcular años, mas no dias.

    static int Calculador(int dia, int mes, int año){

        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);

        Period periodo = Period.between(fechaNacimiento, fechaHoy);

        // Realizar Un Cambio a este aspecto, ponerlo en "GetDays" ocurre varios errores de calculo, pendiente de modificacion.
        return periodo.getYears();
    }
}
