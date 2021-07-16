// Diametro.java
// Programa para imprimir o diâmetro, circunferência e área de um círculo 
import java.util.Scanner;

public class Diametro 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int raio; // raio do círculo 
		
		System.out.println("Digite o raio do círculo");
		raio = input.nextInt();
		
		System.out.printf("Diâmetro do círculo = %d%n", (raio * 2));
		System.out.printf("\nValor da circunferência = %f%n", (2 * Math.PI * raio));
		System.out.printf("\nO valor da área círculo = %f%n", (Math.PI * (raio * raio)));
	}
		
}