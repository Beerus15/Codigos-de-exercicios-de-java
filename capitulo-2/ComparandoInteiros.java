// ComparandoInteiros.java
// Compara dois inteiros, e diz se são iguais ou diferentes
import java.util.Scanner;

public class ComparandoInteiros
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int number1; // primeiro número a comparar 
		int number2; // segundo número a comparar 
		
		System.out.println("Insira o primeiro número inteiro: ");
		number1 = sc.nextInt();
		
		System.out.println("Insira o segundo número inteiro: ");
		number2 = sc.nextInt();
		
		if(number1 > number2) // se number 1 maior que number2, então imprime
			System.out.printf("%d is larger%n", number1);
		
		if(number1 < number2) // se number 2 maior que number2, então imprime
			System.out.printf("%d is larger%n", number2); 
		
		if(number1 == number2) // se number 2 igual a number2, então imprime
			System.out.print("These numbers are equal");
	}
}