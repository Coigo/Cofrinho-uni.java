import java.util.HashMap;
import java.util.Map;

interface IAddMoeda {
	adicionar
}

public class Cofinho {
	
	MoedaDolar dolar;
	Map<String, Moeda> cofre;
	
	Cofinho () {
		Moeda dolar = new MoedaDolar();
		Moeda real = new MoedaReal();
		Moeda euro = new MoedaEuro();
		
		this.cofre.put("dolar", dolar);
		this.cofre.put("real", real);
		this.cofre.put("euro", euro);
		
		
		
		Map<String, Runnable> moedaMap = new HashMap<>();
		
		
		
	}
	
	private void validarMoeda (String moeda) {
		if ( !this.cofre.containsKey(moeda) ) {
			throw new Error("Forneca uma moeda valida!");
		}
	}
	
	private void handleAdd( double valor ) {
		double valorAtual = this.dolar.getQuantidade();
		System.out.println(String.format("o valor atual é de %.2f", valorAtual));

		double novoValor = valor + valorAtual;	
		this.dolar.setQuantidade(novoValor);
		
		double agoraasim = this.dolar.getQuantidade();
		System.out.println(String.format("o valor atual é de %.2f", agoraasim ));
	}
		
	private void handleRemove( double valor ) {
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
