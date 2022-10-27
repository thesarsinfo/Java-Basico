import java.util.Scanner;

public class MaiorMedia {
    public void MaiorMediaPrograma() {
        Scanner scan = new Scanner(System.in);
        double media = 0;
        int valor,ultimo = 0, somatorio = 0, maior = 0;
        for (int i = 0 ; i < 5; i++)
        {
            System.out.printf("Digite o %d numero! ",i + 1);
             valor = scan.nextInt();
             somatorio += valor;

             if (valor > ultimo)
            {
                maior = valor;
            }
            ultimo = valor;
        }
        media = somatorio / 5;
        System.out.println("O valor da media: " + media);
        System.out.println("O maior valor é " + maior);

    }
}
