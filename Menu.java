import java.util.*;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿QUE QUIERES APRENDER?");

        System.out.println("1. Saber Mi Signo Zodiacal");

        System.out.println("2. Saber Mi Edad En Años De Perro");

        System.out.println("3. Saber Mis Dias Vividos");

        System.out.println("4. Saber Cual Es Mi Numerologia");

        System.out.println("Porfavor Digite Una Opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    Signo();
                    break;
                case 2:
                    Perro();
                    break;
                case 3:
                    Dias();
                    break;
                case 4:
                    Numero();
                    break;
            }

    }

    static void Signo(){

    }

    static void Perro(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime cuentos años tienes:");
        int edad = teclado.nextInt();

        System.out.println("Y cuantos meses llevas con esa edad?");
        int mes = teclado.nextInt();

        System.out.println("ahora calculemos tu edad en años de perro");
        int edadperro = ((edad + ( mes / 12 )) * 7);
        System.out.println(edadperro);
    }
    
    static void Dias(){
        
    }

    static void Numero(){
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
        
        System.out.println("Ingrese el ultimo numero: ");
            octavoNumero = input.nextInt();

        sum = primerNumero + segundoNumero + tercerNumero + cuartoNumero + quintoNumero + sextoNumero + septimoNumero + octavoNumero;

        System.out.println("Tu Numerologia es: " + sum);

    }
    
}
