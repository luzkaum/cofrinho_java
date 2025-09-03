package empresa;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
		
	}

	@Override
	public void info() {
		System.out.println("Moeda: Euro - Valor:" + this.valor);

		
	}

	@Override
	public double converter() {
		double taxaConversao = 6.32;
		
		
		return this.valor * taxaConversao;
	}

}
