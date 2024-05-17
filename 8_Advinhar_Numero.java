import java.util.Random;
import java.util.Scanner;

public class AdivinharNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 0;
        
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");
        
        int palpite;
        do {
            System.out.print("Palpite: ");
            palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor.");
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else {
                System.out.println("Parabéns, você acertou o número secreto em " + tentativas + " tentativas!");
            }
        } while (palpite != numeroSecreto);
        
        scanner.close();
    }
}
