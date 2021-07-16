// MaiorEMenor.java
// Programa para ler cinco inteiros, determinar e imprimir o maior e o menor inteiro. 
import java.util.Scanner;

public class MaiorEMenorModificado
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int [] arrayInteiros = new int[5]; // array para armazenar cinco inteiros digitados pelo usuário 
		
		// laço para ler cinco inteiros digitados para o usuário
		for(int i = 0; i < 5; i++)
		{
			digiteInteiros(i); // imprime uma messagem pedindo que o usuário digite os inteiros
			arrayInteiros[i] = input.nextInt();
		}
		// imprime o menor dos cincos inteiros
		System.out.printf("Maior inteiro: %d%n", maiorInteiro(arrayInteiros));
		// imprime o maior dos cinco inteiros
		System.out.printf("Maior inteiro: %d%n", menorInteiro(arrayInteiros));

	}
	// perde para que cinco inteiros sejam digitados
	static void  digiteInteiros(int i)
	{   
			System.out.printf("Digite o %sº inteiro: %n", i + 1);
		
		
	}
	
	
	// compara cinco inteiro, e diz qual é o maior, e o menor inteiro
	static int maiorInteiro(int [] arrayDeInteiros)
	{
		int maior = 0; // maior inteiro digitado pelo usuário 
		
		
		
		/*compara o valor de um número, com os demais, se for maior, então armazena o resultado na variável maior*/
		for(int i = 0; i < 4; i++)
		{
			if(arrayDeInteiros[i] > arrayDeInteiros[i + 1])
			    maior = arrayDeInteiros[i];
			else
				maior = arrayDeInteiros[i + 1];
		}
		return maior;
	}
	
	// compra os valores de cinco inteiros digitados pelo usuário, e retorna o menor deles
	static int menorInteiro(int cincoInteiros[])
	{
		int menor = 0; // menor inteiro digitado pelo usuário
		
		/*compara o valor de um número, com os demais, se for maior, então armazena o resultado na variável maior,
		 senão armazena o resultado na variável menor, depois passa para o próximo número do array, 
		 e continua comparando com os demais*/
		for(int i = 0; i < 4; i++)
		{
			if(cincoInteiros[i] < cincoInteiros[i + 1])
				menor = cincoInteiros[i];
			else
				menor = cincoInteiros[i + 1];
		}
		return menor;
	}
}