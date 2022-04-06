import java.util.Scanner;

public class Zodiaco {
    public static void main(String[] args) {
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

            }

            System.out.println("Eres " + mesString + " Felicidades!");

        }

    }
    
}
