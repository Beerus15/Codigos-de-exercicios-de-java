// ImparOuPar.java
// Programa que lê um inteiro, então diz se é ímpar ou par.
import java.util.Scanner;


public class ImparOuPar
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Para saber se o número é ímpar ou par, digite um valor inteiro: ");
		int numero = input.nextInt();
		
		
			if(numero % 2 == 0)
				System.out.printf("O número %d é par", numero);
			else
				System.out.printf("O número %d é ímpar", numero);
	}
}