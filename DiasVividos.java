import java.util.*;

import javafx.scene.shape.Mesh;

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


        } while (seguir != 'n');
    }
}