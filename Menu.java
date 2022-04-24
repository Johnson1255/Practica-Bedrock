import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.*;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean salir = false;
        
        int opcion;

        while (!salir) {


        
            System.out.println("  ______________________________________");
            System.out.println("/  |                                    |");
            System.out.println("|  |                                    |");
            System.out.println("|_ |                                    |");
            System.out.println("   |     ---¿Que Quieres Saber?---      |");
            System.out.println("   |                                    |.");
            System.out.println("   |                                    |.");
            System.out.println("   |1. Saber Mi Signo Zodiacal.         |.");
            System.out.println("   |                                    |.");
            System.out.println("   |2. Saber Mi Edad En Años De Perro.  |.");
            System.out.println("   |                                    |.");
            System.out.println("   |3. Saber Mis Dias Vividos.          |.");
            System.out.println("   |                                    |.");
            System.out.println("   |4. Saber Cual Es Mi Numerologia.    |.");
            System.out.println("   |                                    |.");
            System.out.println("   |5. Salir                            |.");
            System.out.println("   |   _________________________________|___");
            System.out.println("   |  /     Porfavor Digite Una Opcion:    /.");
            System.out.println("   |_/____________________________________/");
                opcion = scanner.nextInt(); 

        
            switch (opcion){
                case 1:
                    System.out.println("¡Aqui sabras cual es tu signo zodiacal!");
                    Signo();
                    break;

                case 2:
                    System.out.println("¡Aqui sabras cuantos años tienes en edad de perro!");
                    Perro();
                    break;

                case 3:
                    System.out.println("¡Aqui sabras cuantos dias en total haz vivido en toda tu vida!");
                    Dias();
                    break;

                case 4:
                    System.out.println("¡Aqui descubriras cual es tu numerologia!");
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
        
        char seguir = 0;

        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("DD/MM/AAAA");
            System.out.println("Escribe tu fecha de Nacimiento: ");
            String nacimientoFecha = teclado.next();

            System.out.println("Escribe la fecha de hoy: ");
            String fechaHoy = teclado.next();

            String[] fechaNacer = nacimientoFecha.split("/");
            Integer nacimientoDia = Integer.parseInt(fechaNacer[0]);
            Integer nacimientoMes = Integer.parseInt(fechaNacer[1]);
            Integer nacimientoAño = Integer.parseInt(fechaNacer[2]);

            String[] fechaH = fechaHoy.split("/");
            Integer diaHoy = Integer.parseInt(fechaH[0]);
            Integer mesHoy = Integer.parseInt(fechaH[1]);
            Integer añoHoy = Integer.parseInt(fechaH[2]);

            int b = 0;
            int dias = 0;
            int mes = 0;
            int años = 0;
            int meses = 0;
            mes = nacimientoMes - 1;

            if(mes == 2){
                if ((añoHoy % 4 == 0) && ((añoHoy % 100 != 0) || (añoHoy % 400 == 0))){
                    b = 29;
                } 
                else{
                    b = 28;
                }

            }

            else if (mes <= 7){
                if (mes == 0){
                    b = 31;
                }
                else if (mes % 2 == 0){
                    b = 30;
                }
                else{
                    b = 31;
                }
            }

            else if (mes > 7){
                if (mes % 2 == 0){
                    b = 31;
                }
                else{
                    b = 30;
                }
            }

            if ((nacimientoAño > añoHoy) || (nacimientoAño == añoHoy && nacimientoMes > mesHoy) || (nacimientoAño == añoHoy && nacimientoMes == mesHoy && nacimientoDia > diaHoy)){

                System.out.println("La fecha de nacimiento debe ser menor a la fecha actual");
            }

            else {
                if (nacimientoMes <= mesHoy){

                    años = añoHoy - nacimientoAño;

                    if(nacimientoDia <= diaHoy){

                        meses = mesHoy - nacimientoMes;

                        dias = b - (nacimientoDia - diaHoy);
                }

                else {
                    if (mesHoy == nacimientoMes){
                        años = años - 1;
                    }

                    meses = (mesHoy - nacimientoMes - 1 + 12) % 12;

                    dias = b - (nacimientoDia - diaHoy);

                }
            }

                else {

                    años = añoHoy - nacimientoAño - 1;
                    System.out.println("Años?¿: " + años);

                    if (nacimientoDia > diaHoy){
                        meses = mesHoy - nacimientoMes - 1 + 12;
                        dias = diaHoy - nacimientoDia;
                    }
                    else {
                        meses = mesHoy - nacimientoMes + 12;
                        dias = diaHoy - nacimientoDia;
                    }
                }
            }

            System.out.println("Años: " + años);
            System.out.println("Meses: " + meses);
            System.out.println("Dias: " + dias);

            System.out.println("¿Quieres saber cuanto vives con otra fecha? s/n");
            
            seguir = teclado.next().charAt(0);

        } while (seguir != 'n');
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
