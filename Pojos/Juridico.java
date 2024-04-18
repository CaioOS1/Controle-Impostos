package Pojos;

public class Juridico extends Taxas {
	
	private Integer funcionarios;
	
	public Juridico() {
		super();
	}

	public Juridico(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double taxa() {		
		if (funcionarios > 10) {
			return getRendaAnual() * 0.14;
		}else {
			return getRendaAnual() * 0.16;
		}	
	}	
}
	
	
	


