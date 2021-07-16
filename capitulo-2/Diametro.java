// Diametro.java
// Programa para imprimir o di�metro, circunfer�ncia e �rea de um c�rculo 
import java.util.Scanner;

public class Diametro 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int raio; // raio do c�rculo 
		
		System.out.println("Digite o raio do c�rculo");
		raio = input.nextInt();
		
		System.out.printf("Di�metro do c�rculo = %d%n", (raio * 2));
		System.out.printf("\nValor da circunfer�ncia = %f%n", (2 * Math.PI * raio));
		System.out.printf("\nO valor da �rea c�rculo = %f%n", (Math.PI * (raio * raio)));
	}
		
}