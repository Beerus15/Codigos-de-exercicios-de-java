// Multiplo.java
// Programa para descobrir se um número é múltiplo do outro.
import java.util.Scanner;

public class Multiplo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numero1; // múltiplo 
		int numero2;

		System.out.println("Digite um múltiplo: ");
		numero1 = input.nextInt();
		
		System.out.println("Digite um número: ");
		numero2 = input.nextInt();
		// verifica se o primeiro inteiro é múltiplo do segundo
		if(numero2 != 0)
			if(numero1 % numero2 == 0)
				System.out.printf("O número %d é múltplo de %d%n", numero1, numero2);
	}
}