// Exercicios.java
// Programa para resolver exerc�cios 2.3, p�gina 23
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exercicios 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// letra a 
		int c;
		int thisIsAVariable;
		int q76354; 
		int number;
		
		
		int [] a = new int[3]; 
		int produto = 1; // vari�vel para armazenar o resultado da multiplica��o
		
		// letra b 
		System.out.println("Insira um n�mero inteiro: ");
		int value = input.nextInt(); // letra c 
		
		// letra d 
		
		System.out.println("This is a Java program");
		
		
		// letra e
		System.out.printf("%s%n%s", "This is Java", "program");
		
		// letra f
		
		System.out.println("\nInsira um valor que ser� comparado a 7");
		number = input.nextInt();
		
		if(number != 7)
			System.out.println("The variable number is not equal 7");
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("\nDigite 3 n�mero, que ser�o multiplicados: ");
			a[i] = input.nextInt();
			produto *= a[i];
		}
		
		System.out.printf("\nO valor de produto �: %s", produto);
	}
}