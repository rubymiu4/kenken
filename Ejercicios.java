package reforzamiento;

import java.util.Scanner;

/**
 * Ejercicios
 */
public class Ejercicio {

  public static void mostrarcursoDia() {
      //Definir Variable
      int diaSem;
      String mensaje;
      String primeraParteM="Ese dia toca el curso de:";
      //Leer Datos
      Scanner leerT=new Scanner(System.in);
      System.out.println("Ingrese un dia de la Semana:\n1=Dom"+
      "\n2=Lun\n3=Mar\n4=Mie\n5=Jue\n6=Vie\n7=Sab");
      diaSem=leerT.nextInt();
      //Proceso
      if(diaSem==1 || diaSem==7){
          mensaje="No hay clases";
      }else if (diaSem==2) {
          mensaje=primeraParteM+"Matematica";
      }else if (diaSem==3 || diaSem==5){
          mensaje=primeraParteM+"Fundamentos de Programacion";
      }else if (diaSem==4) {
          mensaje=primeraParteM+"Capacidades Comunicativas"; 
      }else if (diaSem==6) {
          mensaje=primeraParteM+"Introducion a Sistemas"; 
      }else{
          mensaje="El dia que coloco no es valido";}

      //Datos de Salida
      System.out.println(""+mensaje);
}    

    public static void main(String[] args) {
      mostrarcursoDia();
     
    }
}
