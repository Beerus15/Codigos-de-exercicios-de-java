// ImparOuPar.java
// Programa que l� um inteiro, ent�o diz se � �mpar ou par.
import java.util.Scanner;


public class ImparOuPar
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Para saber se o n�mero � �mpar ou par, digite um valor inteiro: ");
		int numero = input.nextInt();
		
		
			if(numero % 2 == 0)
				System.out.printf("O n�mero %d � par", numero);
			else
				System.out.printf("O n�mero %d � �mpar", numero);
	}
}