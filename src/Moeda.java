
public abstract class Moeda {

	protected static double valor;
	protected static double quantidade;
		
	abstract  double converterParaReal();
	
	abstract double getQuantidade();
	
	abstract void setQuantidade(double valor);
}
