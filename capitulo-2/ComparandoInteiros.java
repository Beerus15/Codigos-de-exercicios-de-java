// ComparandoInteiros.java
// Compara dois inteiros, e diz se s�o iguais ou diferentes
import java.util.Scanner;

public class ComparandoInteiros
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int number1; // primeiro n�mero a comparar 
		int number2; // segundo n�mero a comparar 
		
		System.out.println("Insira o primeiro n�mero inteiro: ");
		number1 = sc.nextInt();
		
		System.out.println("Insira o segundo n�mero inteiro: ");
		number2 = sc.nextInt();
		
		if(number1 > number2) // se number 1 maior que number2, ent�o imprime
			System.out.printf("%d is larger%n", number1);
		
		if(number1 < number2) // se number 2 maior que number2, ent�o imprime
			System.out.printf("%d is larger%n", number2); 
		
		if(number1 == number2) // se number 2 igual a number2, ent�o imprime
			System.out.print("These numbers are equal");
	}
}