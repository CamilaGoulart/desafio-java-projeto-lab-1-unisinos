
public class Bijuteria extends Loja {
	private double metaVendas;

	//método construtor
	public Bijuteria(String nome, int quantidadeFuncionarios, 
			double salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao,double metaVendas, int estoqueProdutos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
		this.metaVendas = metaVendas;
	}

	//método get e set
	public double getMetaVendas() {
		return metaVendas;
	}

	public void setMetaVendas(double metaVendas) {
		this.metaVendas = metaVendas;
	}
	
	//método toString
	@Override
	public String toString() {
		return super.toString() + "\nMeta de vendas: R$ " +String.format("%.2f",metaVendas);
	}
	
	
	
}
