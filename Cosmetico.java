
public class Cosmetico extends Loja{
	
	private double taxaComercializacao;

	//método construtor
	public Cosmetico(String nome, int quantidadeFuncionarios, 
			double salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao, double taxaComercializacao, int estoqueProdutos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
		this.taxaComercializacao = taxaComercializacao;
	}

	//método get e set
	public double getTaxaComercializacao() {
		return taxaComercializacao;
	}

	public void setTaxaComercializacao(double taxaComercializacao) {
		this.taxaComercializacao = taxaComercializacao;
	}
	
	//método toString
	@Override 
	public String toString() {
		return super.toString() + "\nTaxa de comercialização: R$ " +String.format("%.2f",taxaComercializacao);
	}
	


		
	
	
	
	

}
