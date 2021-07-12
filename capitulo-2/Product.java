// Exerc�cio 2.6: Product.Java 
// Calcula o produto de tr�s inteiros. 
import java.util.Scanner; // programa utiliza Scanner 
import javax.swing.JOptionPane; 

public class Product 
{
	public static void main(String[] args)
	{
		// cria Scanner para obter entrada a partir da janela de comando 
		Scanner input = new Scanner(System.in);
		
		int x; // primeiro n�mero inserido pelo usu�rio 
		int y; // segundo n�mero inserido pelo usu�rio 
		int z; // terceiro n�mero inserido pelo usu�rio 
		int result; // produto dos n�meros 
		
		System.out.print("Enter first integer: "); // solicita entrada 
		x = input.nextInt();
		
		System.out.print("Enter second integer: "); // solicita entrada 
		y = input.nextInt(); // l� o segundo inteiro 
		
		System.out.print("Enter third integer: "); // solicita entrada 
		z = input.nextInt(); // l� o terceiro inteiro 
		
		result = x * y * z; // calcula o produto dos n�meros 
		
		System.out.printf("Product is %d%n", result);
	}
}