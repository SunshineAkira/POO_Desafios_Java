import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números deseja inserir? ");
        int quantidade = scanner.nextInt();
        
        int soma = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            soma += scanner.nextInt();
        }
        
        double media = (double) soma / quantidade;
        
        System.out.println("A média é: " + media);
        
        scanner.close();
    }
}
