// Aritmetica.java
// Programa para exibir a soma, produto, diferen�a e quociente(divis�o), de 2 n�meros inteiro
import java.util.Scanner;

public class Aritmetica
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int sum; // soma 
		int product; // multiplica��o
		int diference; // subtra��o
		double quocient; // quociente(divis�o)
		
		System.out.println("Insira o primeiro n�mero inteiro: ");
		int number1 = sc.nextInt();
		
		System.out.println("Insira o segundo n�mero inteiro: ");
		int number2 = sc.nextInt();
		
		sum = number1 + number2; // soma e armazena o resultado na vari�vel 
		System.out.printf("A soma de %d + %d = %d%n", number1, number2, sum);
		
		product = number1 * number2; // multiplica e armazena o resultado na vari�vel 
		System.out.printf("O produto de %d x %d = %d%n", number1, number2, product);
		
		diference = number1 - number2; // subtrai e armazena o resultado na vari�vel
		System.out.printf("O produto de %d - %d = %d%n", number1, number2, diference);
		
		quocient = (double)number1 / number2; /* faz convers�o em um dos valores inteiros para n�o haver 
											  truncamento, ent�o divide e armazena o resultado na vari�vel*/ 
		System.out.printf("O quociente da divis�o de %d / %d = %.2f%n", number1, number2, quocient);
	}
}
