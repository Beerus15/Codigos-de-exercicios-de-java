// MaiorEMenor.java
// Programa para ler cinco inteiros, determinar e imprimir o maior e o menor inteiro. 
import java.util.Scanner;

public class MaiorEMenor
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int numero1; // primeiro inteiro 
		int numero2; // segundo inteiro 
		int numero3; // terceiro inteiro
		int numero4; // quarto inteiro 
		int numero5; // quinto inteiro 
		
		
		System.out.println("Digite o primeiro inteiro: ");
		numero1 = input.nextInt();
		
		System.out.println("Digite o segundo inteiro: ");
		numero2 = input.nextInt();
		
		System.out.println("Digite o terceiro inteiro: ");
		numero3 = input.nextInt();
		
		System.out.println("Digite o quarto inteiro: ");
		numero4 = input.nextInt();
		
		System.out.println("Digite o quinto inteiro: ");
		numero5 = input.nextInt();
		
		
		if(numero1 > numero2)
			System.out.printf("%d > %d%n", numero1, numero2);
		
		if(numero1 > numero3)
			System.out.printf("%d > %d%n", numero1, numero3);
		
		if(numero1 > numero4)
			System.out.printf("%d > %d%n", numero1, numero4);
		
		if(numero1 > numero5)
			System.out.printf("%d > %d%n", numero1, numero5);
		
		if(numero1 < numero2)
			System.out.printf("%d < %d%n", numero1, numero2);
		
		if(numero1 < numero3)
			System.out.printf("%d < %d%n", numero1, numero3);
		
		if(numero1 < numero4)
			System.out.printf("%d < %d%n", numero1, numero4);
		
		if(numero1 < numero5)
			System.out.printf("%d < %d%n", numero1, numero5);
		
		

		if(numero2 > numero3)
			System.out.printf("%d > %d%n", numero2, numero3);
		
		if(numero2 > numero4)
			System.out.printf("%d > %d%n", numero2, numero4);
		
		if(numero2 > numero5)
			System.out.printf("%d > %d%n", numero2, numero5);
		
		if(numero2 < numero3)
			System.out.printf("%d < %d%n", numero2, numero3);
		
		if(numero2 < numero4)
			System.out.printf("%d < %d%n", numero2, numero4);
		
		if(numero2 < numero5)
			System.out.printf("%d < %d%n", numero2, numero5);
		
		
		
		
		if(numero3 > numero4)
			System.out.printf("%d > %d%n", numero3, numero4);
		
		if(numero4 > numero5)
			System.out.printf("%d > %d%n", numero4, numero5);
		
		
		
		if(numero3 < numero4)
			System.out.printf("%d < %d%n", numero3, numero4);
		
		if(numero4 < numero5)
			System.out.printf("%d < %d%n", numero4, numero5);
		
		
		
	}
}