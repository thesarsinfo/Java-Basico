import java.text.Format;
import java.util.Scanner;

public class ParesImpares {
    private int quantidade;
    private int numero;

    public ParesImpares(int quantidade) {
        this.quantidade = quantidade;
    }
    public void ParesImparesProgramas() {
        int pares = 0, impares = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < quantidade;i++)
        {
            System.out.println("Digite o " + (i + 1) + "numero");
            this.numero = scanner.nextInt();
            if (this.numero % 2 == 0){
                pares += 1;
            }else
            {
                impares += 1;
            }
        }
        System.out.println("A quantidade de pares são: " + pares);
        System.out.println("A quantidade de impares são: " + impares);

    }
}
