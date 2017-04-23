/*Simular Dado
Omar Gonzalez 8-775-963
 */

package app;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Dado l = new Dado();
        int i = 0;
        int j = 0;
        int res =0;
        ArrayList<Integer> ar = new ArrayList<Integer>();


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
            switch (i) {
                case 1:
                    res = l.lanza_dado();
                    final boolean add = ar.add(res);

                    break;
                case 2:
                    l.imprimir_resultado(j);
                    break;

                case 3:
                     l.imprimir_todos_resultados(ar);
                    break;

                case 4:
                    System.out.println("\n Gracias por su Participacion.....");
                    break;

                default:
                    break;


            }
            j = res; //Guarda Resultado del primer resultado
        } while (i != 4);


    }
}

