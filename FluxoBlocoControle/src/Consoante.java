import java.util.ArrayList;
import java.util.Scanner;

public class Consoante {
    public void ConsoantePrograma() {        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String[] frase = scan.nextLine()
                            .toLowerCase()
                            .replaceAll(" ", "")
                            .split("");        
        int vogal = 0;
        for (String letra : frase) {
            
            if(letra.equals("a") || letra.equals("e") 
                || letra.equals("i") 
                || letra.equals("o") 
                || letra.equals("u")   )
                {
                vogal++;
                }
        }
        int consoantes = frase.length - vogal;
        System.out.println("O numero de consoantes são: " + consoantes);


    }
    
}