package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
     Dado l = new Dado();
	 int i = 0;
	 int j=0;
	 double res;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

	 do{
	     System.out.println("\n Simulacion de dado: ");
         System.out.println("\n Escoja una de las siguientes opciones");
         System.out.println("\n Tirar Dado..................1 ");
         System.out.println("\n Ver resultado...............2 ");
         System.out.println("\n Ver todos los resultados....3 ");
         System.out.println("\n Salir.......................4 ");
         System.out.println("\n: ");
         try {
             i = Integer.parseInt(teclado.readLine());
         } catch (IOException e) {
             e.printStackTrace();
         }
         switch(i){
             case 1:
                 res=l.lanza_dado();

                 break;


             case 2:
                 break;

             case 3:
                  break;

             case 4:
                  break;

              default:
                  break;



         }

     }while(i!=4);

    }
}
