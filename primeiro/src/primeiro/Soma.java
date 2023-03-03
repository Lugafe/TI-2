package primeiro;
import java.util.Scanner;
public class Soma {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        //criação do scanner
	        System.out.print("Digite o primeiro numero: ");
	        int numero1 = scanner.nextInt();	        
	        System.out.print("Digite o segundo numero: ");
	        int numero2 = scanner.nextInt();
	        int resultado = numero1 + numero2;
	        System.out.println("A soma dos numeros e': " + resultado);
	        scanner.close();
	    }
	
}
