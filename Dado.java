package app;
import java.util.ArrayList;
import java.util.Random;


public class Dado {


    public int lanza_dado() {
        double resultado;
        resultado = Math.random() * 6;
        return(int) resultado;
    }
    public void imprimir_resultado(int j) {
        System.out.print("El resultado es: " + j);

    }
    public void imprimir_todos_resultados(ArrayList ar){
        int i;
        for(i=0; ar.size() > i; i++){
            System.out.println(ar.get(i));
        }

    }





}
