// Produto.java
// Exerc�cio 2.5 e 2.6
import java.util.Scanner; 
import javax.swing.JOptionPane; 
// letra a
public class Produto
{
	public static void main(String[] args)
	{
		// letra b
		Scanner input = new Scanner(System.in); 
		// letra c
		int x; // primeiro n�mero inserido pelo usu�rio 
		int y; // segundo n�mero inserido pelo usu�rio 
		int z; // terceiro n�mero inserido pelo usu�rio 
		int result; // produto dos n�meros
		
		// letra d
		System.out.println("Digite o primeiro inteiro: ");
		x = input.nextInt(); // letra e
		
		System.out.println("Digite o segundo inteiro: "); // letra f.
		y = input.nextInt(); // letra g
		
		System.out.println("Digite o terceiro inteiro: "); // letra z.
		z = input.nextInt();
		
		result = x * y * z;
		
		System.out.printf("\nProduct is %d%n", result);
	}
}
