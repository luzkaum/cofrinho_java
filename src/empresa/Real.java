package empresa;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
		
	}

	@Override
	public void info() {
		System.out.println("Moeda: Real - Valor:" + this.valor);
		
	}

	@Override
	public double converter() {
		return this.valor;
	}
	
}
