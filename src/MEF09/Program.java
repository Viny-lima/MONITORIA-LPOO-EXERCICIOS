package MEF09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Program {

	public static void main(String[] args)
	{
		while(true) 
		{			
			Q1();
		}

	}
	
	private static String Input() 
	{		
		Scanner scan = new Scanner(System.in);
		return scan.next();		
	}
	
	private static void Print(String string) 
	{
		System.out.println(string);	
	}
	
	public static void Q1()
	{
		
		try 
		{
			try 
			{			
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("");
				System.out.println("========================");
				
				System.out.println("DIGITE O NOME: ");
				String name = scanner.next();
				
				System.out.println("DIGITE O NÚMERO: ");
				String numString = scanner.next();
				Integer num = Integer.parseInt(numString);
				
				char letter = name.toCharArray()[num];
				
				System.out.println("");
				Print("Resultado:" + letter);						
			}
			catch (ArrayIndexOutOfBoundsException e) 
			{			
				throw new PosistionInvalidException();			
			}			
		}
		catch (PosistionInvalidException e) 
		{				
			Print("Posição Inválida !");				
		}	
		
	}

	public static void Q2() 
	{
		String[] nomes = new String[10]; 
 		
		for (int i = 0; i <= 10; i++) 
		{
			Print("DIGITE O IDADE DA PESSOA [" + i + "]" );
			nomes[i] = Input();			
		}		
		
		Print("DIGITE O NÚMERO");
		var numString = Input();
		var num = Integer.parseInt(numString);	
		
		nomes[num] = "";		
		
		
		
		
	}
}
