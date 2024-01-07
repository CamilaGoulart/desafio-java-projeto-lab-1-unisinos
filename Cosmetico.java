
public class Cosmetico extends Loja{
	
	private double taxaComercializacao;

	
	public Cosmetico(String nome, int quantidadeFuncionarios, 
			double salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao, double taxaComercializacao) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.taxaComercializacao = taxaComercializacao;
	}

	public double getTaxaComercializacao() {
		return taxaComercializacao;
	}

	public void setTaxaComercializacao(double taxaComercializacao) {
		this.taxaComercializacao = taxaComercializacao;
	}
	
	@Override //sobrescrita do metodo.
	public String toString() {
		return super.toString() + "\nTaxa de comercialização: R$ " +String.format("%.2f",taxaComercializacao);
	}
	


		
	
	
	
	

}
