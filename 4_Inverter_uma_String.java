import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        StringBuilder reverso = new StringBuilder(palavra).reverse();
        
        System.out.println("Palavra invertida: " + reverso.toString());
        
        scanner.close();
    }
}
