import java.util.HashMap;
import java.util.Map;

public class Cofinho {
	
	MoedaDolar dolar;
	
	Cofinho () {
		this.dolar = new MoedaDolar();
	}
	
	public void adicionarAoCofre(String moeda, Double valor) {
		Map<String, Runnable> moedaMap = new HashMap<>();
		
			moedaMap.put("dolar", () -> this.handleAddDolar(valor));
			
			moedaMap.get(moeda).run();
       
	}
	
	public void retirarDoCofre(String moeda, Double valor) {
		Map<String, Runnable> moedaMap = new HashMap<>();
		
		moedaMap.put("dolar", () -> this.handleRemoveDolar( valor));
		
		moedaMap.get(moeda).run();
	}

	private void handleAddDolar( double valor ) {
		double valorAtual = this.dolar.getQuantidade();
		System.out.println(String.format("o valor atual é de %.2f", valorAtual));

		double novoValor = valor + valorAtual;	
		this.dolar.setQuantidade(novoValor);
		
		double agoraasim = this.dolar.getQuantidade();
		System.out.println(String.format("o valor atual é de %.2f", agoraasim ));
	}
		
	private void handleRemoveDolar( double valor ) {
		if (this.possuiValorSuficienteParaRetirar("dolar", valor)) {
			
		}
		double valorAtual = this.dolar.getQuantidade();
		System.out.println(String.format("o valor atual é de %.2f", valorAtual));

		double novoValor = valor + valorAtual;	
		this.dolar.setQuantidade(novoValor);
		
		double agoraasim = this.dolar.getQuantidade();
		System.out.println(String.format("o valor atual é de %.2f", agoraasim ));
	}
	
	
	private boolean possuiValorSuficienteParaRetirar(String moeda, Double valorRetirar) {
		if ( valorRetirar < this.getValor(null) ) {
			return false;
		}
		return true;
	}
	
	private double getValor(String moeda) {
		return 2.55;
	}
 	
}
