package pacoteTeste;

import java.util.Scanner;

public class La�osderepeti��o {

	public static void main (String args[]) 
	{
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Entre com sua idade: ");
		int idade;
		
		idade = entrada.nextInt();
		
		if (idade >= 10 && idade <=14)
		{
			System.out.println ("Voc� faz parte da categoria infantil. ");
		}
			else if (idade >= 15 && idade <= 17)
			{
			System.out.println ("Voc� faz parte da categoria juvenil. ");
			}
		
			else if(idade >= 18)
			{
			System.out.println ("Voc� faz parte da categoria adulto. ");
			}
		
		else 
		{
			System.out.println ("Voc� n�o esta classificado em nenhuma categoria. ");
		}
	}
	
}
