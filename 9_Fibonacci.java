import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de termos da sequência Fibonacci: ");
        int termos = scanner.nextInt();
        
        int primeiro = 0, segundo = 1;
        System.out.println("Sequência Fibonacci:");
        for (int i = 0; i < termos; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        
        scanner.close();
    }
}
