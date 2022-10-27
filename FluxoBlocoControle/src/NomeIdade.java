import java.util.Scanner;

/**
 * NomeIdade
 */
public class NomeIdade {

    public NomeIdade(){};
    public void NomeIdadeDigital()
    {
        Scanner scan = new Scanner(System.in);
        
        int valor = 1;

        while (valor != 0)
        {
            
            System.out.println("digite o seu nome");
            String nome = scan.nextLine();
            System.out.println("Digite a idade");
            int idade = scan.nextInt();
            System.out.println("Deseja sair? digite 0");
            valor = scan.nextInt();
        }
        System.out.println("Programa encerrado");
    }   

}