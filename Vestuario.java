
public class Vestuario extends Loja {
	
	private boolean produtosImportados;

	//método construtor
	public Vestuario(String nome, int quantidadeFuncionarios, 
			double salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao, boolean produtosImportados, int estoqueProdutos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
		this.produtosImportados = produtosImportados;
	}

	//método get e set
	public boolean getProdutosImportados() {
		return produtosImportados;
	}

	public void setProdutosImportados(boolean produtosImportados) {
		this.produtosImportados = produtosImportados;
	}

	//método toString
	@Override 
	public String toString() {
		return super.toString() + "\n Produto importado: " + produtosImportados;
	}
	

}

