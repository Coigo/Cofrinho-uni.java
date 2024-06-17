
public class MoedaReal extends Moeda {
	
	@Override
	void setQuantidade(double valor) {
		this.quantidade = valor;
	}

	@Override
	public double getQuantidade () {
		return this.quantidade;
	}
	
	@Override
	double converterParaReal() {
		// TODO Auto-generated method stub
		return 0;
	}
}
