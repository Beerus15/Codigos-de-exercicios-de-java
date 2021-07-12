// Aritmetica.java
// Programa para exibir a soma, produto, diferença e quociente(divisão), de 2 números inteiro
import java.util.Scanner;

public class Aritmetica
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum; // soma 
		int product; // multiplicação
		int diference; // subtração
		double quocient; // quociente(divisão)
		
		System.out.println("Insira o primeiro número inteiro: ");
		int number1 = sc.nextInt();
		
		System.out.println("Insira o segundo número inteiro: ");
		int number2 = sc.nextInt();
		
		sum = number1 + number2; // soma e armazena o resultado na variável 
		System.out.printf("A soma de %d + %d = %d%n", number1, number2, sum);
		
		product = number1 * number2; // multiplica e armazena o resultado na variável 
		System.out.printf("O produto de %d x %d = %d%n", number1, number2, product);
		
		diference = number1 - number2; // subtrai e armazena o resultado na variável
		System.out.printf("O produto de %d - %d = %d%n", number1, number2, diference);
		
		quocient = (double)number1 / number2; /* faz conversão em um dos valores inteiros para não haver 
											  truncamento, então divide e armazena o resultado na variável*/ 
		System.out.printf("O quociente da divisão de %d / %d = %.2f%n", number1, number2, quocient);
	}
}
