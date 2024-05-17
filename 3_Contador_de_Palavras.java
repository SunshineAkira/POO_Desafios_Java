import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        String[] palavras = frase.split(" ");
        int numeroPalavras = palavras.length;
        
        System.out.println("Número de palavras: " + numeroPalavras);
        
        scanner.close();
    }
}
