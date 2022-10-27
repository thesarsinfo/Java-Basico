import java.util.Scanner;

public class Nota {

    public Nota() {}
    public void NotaPrograma() {
        
        System.out.println("Digite uma nota");
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        while (nota < 0 | nota > 10)
        {
            System.out.println("Nota invalida");
            System.out.println("Digite uma nota");
            nota = scan.nextInt();
        }
    }
}

    