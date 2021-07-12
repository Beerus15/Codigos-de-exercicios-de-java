// QuatroNumeros.java 
// Exercicío 2.14: Exibe 4 números na mesma linha, usando diferentes usando println, print e printf.
import java.util.Scanner;
import java.security.SecureRandom;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class QuatroNumeros
{
	public static void main(String[] args)
	{
		// letra a
		System.out.println(1 + " " + 2 + " " + 3 + " " + 4); // imprime 4 números separados, cada um separado por espaço
		//letra b
		System.out.print(1 + " ");
		System.out.print(2 + " ");
		System.out.print(3 + " ");
		System.out.print(4 + "\n");
		//letra c
		System.out.printf("%d %d %d %d%n", 1, 2, 3, 4);
	}
}