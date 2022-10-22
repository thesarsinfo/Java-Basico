package src;
import src.univesp.exercicio.Bola;


public class App {
    public static void main(String[] args) throws Exception {
        Bola bola = new Bola();
        bola.pintar("Cobalto");
        bola.encher();
        bola.esvaziar();
    }
}
