// Multiplo.java
// Programa para descobrir se um n�mero � m�ltiplo do outro.
import java.util.Scanner;

public class Multiplo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int numero1; // m�ltiplo 
		int numero2;

		System.out.println("Digite um m�ltiplo: ");
		numero1 = input.nextInt();
		
		System.out.println("Digite um n�mero: ");
		numero2 = input.nextInt();
		// verifica se o primeiro inteiro � m�ltiplo do segundo
		if(numero2 != 0)
			if(numero1 % numero2 == 0)
				System.out.printf("O n�mero %d � m�ltplo de %d%n", numero1, numero2);
	}
}