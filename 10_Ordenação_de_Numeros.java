import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos números deseja ordenar? ");
        int quantidade = scanner.nextInt();
        
        int[] numeros = new int[quantidade];
        System.out.println("Digite os números:");
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        Arrays.sort(numeros);
        
        System.out.println("Números ordenados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        
        scanner.close();
    }
}
