package app;
import java.util.Random;


public class Dado {

    public double lanza_dado() {
        Double resultado;
        resultado = Math.random() * 6;
        return(resultado);
    }

}
