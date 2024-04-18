package Pojos;

public class Fisico extends Taxas{
	
	private Double rendaSaude;
	
	public Fisico() {
		super();
	}

	public Fisico(String nome, Double rendaAnual, Double rendaSaude) {
		super(nome, rendaAnual);
		this.rendaSaude = rendaSaude;
	}

	public Double getRendaSaude() {
		return rendaSaude;
	}

	public void setRendaSaude(Double rendaSaude) {
		this.rendaSaude = rendaSaude;
	}

	@Override
	public double taxa() {
		double taxaBasica;
		if (getRendaAnual() < 20000.0) {
			taxaBasica = getRendaAnual() * 0.15;
 		}
		else {
 			taxaBasica = getRendaAnual() * 0.25;
 		}
		taxaBasica = taxaBasica - getRendaSaude() * 0.5;
		if (taxaBasica < 0.0) {
			taxaBasica = 0.0;
		}
		return taxaBasica;

	}


}
