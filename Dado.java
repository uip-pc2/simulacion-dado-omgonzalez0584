package app;
import java.util.Random;


public class Dado {

    public int lanza_dado() {
        double resultado;
        resultado = Math.random() * 6;
        return(int) resultado;
    }
    public void imprimir_resultado(int res){
          System.out.print("El resultado es: "+ res);
    }
}
