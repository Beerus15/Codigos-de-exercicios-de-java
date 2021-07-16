// MaiorEMenor.java
// Programa para ler cinco inteiros, determinar e imprimir o maior e o menor inteiro. 
import java.util.Scanner;

public class MaiorEMenorModificado
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int [] arrayInteiros = new int[5]; // array para armazenar cinco inteiros digitados pelo usu�rio 
		
		// la�o para ler cinco inteiros digitados para o usu�rio
		for(int i = 0; i < 5; i++)
		{
			digiteInteiros(i); // imprime uma messagem pedindo que o usu�rio digite os inteiros
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
			System.out.printf("Digite o %s� inteiro: %n", i + 1);
		
		
	}
	
	
	// compara cinco inteiro, e diz qual � o maior, e o menor inteiro
	static int maiorInteiro(int [] arrayDeInteiros)
	{
		int maior = 0; // maior inteiro digitado pelo usu�rio 
		
		
		
		/*compara o valor de um n�mero, com os demais, se for maior, ent�o armazena o resultado na vari�vel maior*/
		for(int i = 0; i < 4; i++)
		{
			if(arrayDeInteiros[i] > arrayDeInteiros[i + 1])
			    maior = arrayDeInteiros[i];
			else
				maior = arrayDeInteiros[i + 1];
		}
		return maior;
	}
	
	// compra os valores de cinco inteiros digitados pelo usu�rio, e retorna o menor deles
	static int menorInteiro(int cincoInteiros[])
	{
		int menor = 0; // menor inteiro digitado pelo usu�rio
		
		/*compara o valor de um n�mero, com os demais, se for maior, ent�o armazena o resultado na vari�vel maior,
		 sen�o armazena o resultado na vari�vel menor, depois passa para o pr�ximo n�mero do array, 
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