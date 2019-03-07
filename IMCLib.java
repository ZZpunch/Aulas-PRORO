
public class IMCLib 
{
	public double getIndice(double peso, double altura) 
	{
		return peso / (altura * altura);		
	}
	
	public String getAvaliacao(double imc)
	{
		String avaliacao;
		if(imc < 20)
		{
			avaliacao = "MAGRO";
		}
		else if(imc > 30)
		{
			avaliacao = "GORDO";
		}
		else
		{
			avaliacao = "NORMAL";
		}
		
		return avaliacao;
	}

}
