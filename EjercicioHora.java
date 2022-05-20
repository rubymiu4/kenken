package reforzamiento;

import java.util.Scanner;

/**
 * EjercicioHora 
 */
public class EjercicioHora {
    public static void saludoSegunHora() {
        //Variables
        int hora ;
        String saludo;
        //Datos de Entrada
        Scanner leerT=new Scanner(System.in);
        System.out.println("Ingrese la hora:");
        hora=leerT.nextInt()
        ;
        //Proceso
        if (hora>=6 && hora <=12) {
          saludo="Buenos Dias";   
        }else if (hora>=13 && hora<=20) {
          saludo="Buenas Tardes"; 
        }else if ((hora>=21 && hora<=23) || (hora>=0 && hora<=5)) {
          saludo="Buenas Noches"; 
        }else{
          saludo="Esa hora no existe";
        }
        //Datos de salida
         System.out.println(saludo);
    }
    


   public static void main(String[] args) {
      saludoSegunHora();

   } 
}