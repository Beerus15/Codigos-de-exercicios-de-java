// Aritmetica2.java
// Calcula e exibe a soma, m�dia, produto e os n�meros menores e maiores, de 3 n�meros inteiros digitados pelo usu�rio
import java.util.Scanner; 

public class Aritmetica2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
		int sum; // soma 
		int product; // multiplica��o
		int average; // media dos n�meros
		
		
		System.out.println("Insira o primeiro n�mero inteiro: ");
		int number1 = sc.nextInt();
		
		System.out.println("Insira o segundo n�mero inteiro: ");
		int number2 = sc.nextInt();
		
		System.out.println("Insira o segundo n�mero inteiro: ");
		int number3 = sc.nextInt();
		
		sum = number1 + number2 + number3; // soma e armazena o resultado na vari�vel 
		System.out.printf("A soma de %d + %d  + %d = %d%n", number1, number2, number3, sum);
		
		product = number1 * number2 * number3; // multiplica e armazena o resultado na vari�vel 
		System.out.printf("O produto de %d x %d x %d = %d%n", number1, number2, number3, product);
		
		average = sum / 3; // soma dividido pela quantidade de n�meros, armazena na vari�vel 
		System.out.printf("A m�dia de %d, %d e %d = %d%n%n", number1, number2, number3, average);
		
		if(number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);
		
		if(number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);
		
		if(number1 > number3)
			System.out.printf("%d > %d%n", number1, number3);
		
		if(number1 < number3)
			System.out.printf("%d < %d%n", number1, number3);
		
		if(number2 > number3)
			System.out.printf("%d > %d%n", number2, number3);
		
		if(number2 < number3)
			System.out.printf("%d < %d%n", number2, number3);
		
		
	}
}
