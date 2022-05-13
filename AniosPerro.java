import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AniosPerro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime cuentos años tienes:");
        int edad = teclado.nextInt();

        System.out.println("Y cuantos meses llevas con esa edad?");
        int mes = teclado.nextInt();

        System.out.println("ahora calculemos tu edad en años de perro");
        int edadperro = ((edad + ( mes / 12 )) * 7);
        System.out.println(edadperro);}

}
