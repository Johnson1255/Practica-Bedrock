import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        
        int opcion;

        while (!salir) {


        
            System.out.println("---¿Que Quieres Saber?---");

            System.out.println("1. Saber Mi Signo Zodiacal.");
    
            System.out.println("2. Saber Mi Edad En Años De Perro.");
    
            System.out.println("3. Saber Mis Dias Vividos.");
    
            System.out.println("4. Saber Cual Es Mi Numerologia.");

            System.out.println("5. Salir");
    
            System.out.println("Porfavor Digite Una Opcion: ");
                opcion = scanner.nextInt(); 

        
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

                case 5:
                    salir = true;
                    break;

                case 7:
                    System.out.println("~ZAPATO~");
                    break;
                
                default:
                    System.out.println("Porfavor ingrese una opcion valida. Son entre el 1 y 5");
                    break;
            }

        }

        System.out.println("Fin Del Menú");

    }

    static void Signo(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dia de nacimiento (En Números)");
        int dia = teclado.nextInt();

        System.out.println("Mes de nacimiento (En Números)");
        int mes = teclado.nextInt();

        String mesString = "";
        if (dia <= 31){
            switch (mes){

                    case 1:
                        if (dia > 0 && dia <= 20 && mes == 1){
                         mesString = "Capricornio";
                         break;
                    }

                        else if(dia > 20 && dia <= 31 && mes == 1){
                        mesString = "Acuario";
                        break;
                    }

                    case 2:
                        if(dia > 0 && dia <= 20 && mes == 2){
                            mesString = "Acuario";
                            break;
                    }

                        else if(dia > 20 && dia <= 29 && mes == 2){
                            mesString = "Piscis";
                            break;
                    }

                    case 3:
                        if(dia > 0 && dia <= 20 && mes == 3){
                            mesString = "Piscis";
                            break;
                    }

                        else if(dia > 20 && dia <= 31 && mes == 3){
                            mesString = "Aries";
                            break;
                    }

                    case 4:
                        if(dia > 0 && dia <= 20 && mes == 4){
                            mesString = "Aries";
                            break;
                    }

                        else if(dia > 20 && dia <= 30 && mes == 4){
                            mesString = "Tauro";
                            break;
                    }
                    case 5:
                        if(dia > 0 && dia <= 20 && mes == 5){
                            mesString = "Tauro";
                            break;
                    }

                        else if(dia > 20 && dia <= 31 && mes == 5){
                            mesString = "Géminis";
                            break;
                    }

                    case 6:
                        if(dia > 0 && dia <= 20 && mes == 6){
                            mesString = "Géminis";
                            break;
                    }

                        else if(dia > 20 && dia <= 30 && mes == 6){
                            mesString = "Cáncer";
                            break;
                    }

                    case 7:
                        if(dia > 0 && dia <= 20 && mes == 7){
                            mesString = "Cáncer";
                            break;
                    }

                        else if(dia > 20 && dia <= 31 && mes == 7){
                            mesString = "Leo";
                            break;
                    }

                    case 8:
                        if(dia > 0 && dia <= 20 && mes == 8){
                            mesString = "Leo";
                            break;
                    }

                        else if(dia > 20 && dia <= 31 && mes == 8){
                            mesString = "Virgo";
                            break;
                    }

                    case 9:
                        if(dia > 0 && dia <= 20 && mes == 9){
                            mesString = "Virgo";
                            break;
                    }

                        else if(dia > 20 && dia <= 30 && mes == 9){
                            mesString = "Libra";
                            break;
                    }

                    case 10:
                        if(dia > 0 && dia <= 20 && mes == 10){
                            mesString = "Libra";
                            break;
                    }

                        else if(dia > 20 && dia <= 31 && mes == 10){
                            mesString = "Escorpio";
                            break;
                    }

                    case 11:
                        if(dia > 0 && dia <= 20 && mes == 11){
                            mesString = "Escorpio";
                            break;
                    }

                        else if(dia > 20 && dia <= 30 && mes == 11){
                            mesString = "Sagitario";
                            break;
                    }

                    case 12:
                        if(dia > 0 && dia <= 20 && mes == 12){
                            mesString = "Sagitario";
                            break;
                    }

                        else if(dia > 20 && dia <= 31 && mes == 12){
                            mesString = "Capricornio";
                            break;
                    }

            }

            System.out.println("Eres " + mesString + " Felicidades!");

        }

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
