import java.util.Scanner;

public class TelaConsole 
{
	public void Executa() 
	{
		
		String nome;
		double peso;
		Double altura;
				
		Scanner teclado = new Scanner(System.in);
				
		System.out.print("Nome: ");
		nome = teclado.nextLine();
		
		System.out.print("Peso: ");
		peso = teclado.nextDouble();
		
		System.out.print("Altura: ");
		altura = teclado.nextDouble();
		
		IMCLib indice = new IMCLib();
		
		double imc = indice.getIndice(peso, altura);
		IMCLib aval = new IMCLib();
		
		String avaliacao;
		avaliacao = aval.getAvaliacao(imc);
			
		
		System.out.println("\n*****");
		System.out.println("Nome: " + nome);
		System.out.println("Índice de Massa Corporal = " + imc);
		System.out.println("Avaliação Corporal = " + avaliacao);
	}	

}
