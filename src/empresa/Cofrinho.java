package empresa;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas;
	

	public Cofrinho() {
		this.listaMoedas = new ArrayList<Moeda>();
	}
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
		 System.out.println("Moeda adicionada!");
	}
	
	public void remover (Moeda moeda) {
		if (this.listaMoedas.remove(moeda)) {
			System.out.println("Moeda removida!");
		}
		else {
         System.out.println("Moeda não encontrada");
     }
	}
	
	public void listagemMoedas() {
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Cofrinho vazio");
			
		}
		else {
			System.out.println("Moedas no Cofrinho");
			for(Moeda moeda : this.listaMoedas) {
				moeda.info();
			}
		}
	}
	
	public double totalConvertido() {
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		double total = 0;
		for(Moeda moeda : this.listaMoedas) {
			total += moeda.converter();
		}
		return total;
	}

	



	
	
}
