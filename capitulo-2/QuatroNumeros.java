// QuatroNumeros.java 
// Exercic�o 2.14: Exibe 4 n�meros na mesma linha, usando diferentes usando println, print e printf.
import java.util.Scanner;
import java.security.SecureRandom;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class QuatroNumeros
{
	public static void main(String[] args)
	{
		// letra a
		System.out.println(1 + " " + 2 + " " + 3 + " " + 4); // imprime 4 n�meros separados, cada um separado por espa�o
		//letra b
		System.out.print(1 + " ");
		System.out.print(2 + " ");
		System.out.print(3 + " ");
		System.out.print(4 + "\n");
		//letra c
		System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
	}
}