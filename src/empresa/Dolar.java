package empresa;

public class Dolar extends Moeda{

	public Dolar(double valor) {
		super(valor);
	
	}

	@Override
	public void info() {
		System.out.println("Moeda: Dolar - Valor:" + this.valor);
		
	}

	@Override
	public double converter() {
		double taxaConversao = 5.42;
		
	
		return this.valor * taxaConversao;
	}
	
}
