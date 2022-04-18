import java.util.Scanner;

public class Numerologia {
    
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        int primerNumero=0, segundoNumero=0, tercerNumero=0, cuartoNumero=0, quintoNumero=0, sextoNumero=0, septimoNumero=0, octavoNumero=0;
        int sum;

        System.out.println("Porfavor ingrese su fecha de nacimiento de la siguiente forma DD/MM/AAAA. Teniendo en cuenta los '0' como 01 02 03...");

        System.out.println("Ingrese el primer numero: ");
            primerNumero = input.nextInt();

        System.out.println("Ingrese el segundo numero: ");
            segundoNumero = input.nextInt();

        System.out.println("Ingrese el tercer numero: ");
            tercerNumero = input.nextInt();
        
        System.out.println("Ingrese el cuarto numero: ");
            cuartoNumero = input.nextInt();
        
        System.out.println("Ingrese el quinto numero: ");
            quintoNumero = input.nextInt();
        
        System.out.println("Ingrese el sexto numero: ");
            sextoNumero = input.nextInt();
        
        System.out.println("Ingrese el septimo numero: ");
            septimoNumero = input.nextInt();

        sum = primerNumero + segundoNumero + tercerNumero + cuartoNumero + quintoNumero + sextoNumero + septimoNumero + octavoNumero;

        System.out.println("Tu Numerologia es: " + sum);

    }
}
