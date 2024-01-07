
public class Vestuario extends Loja {
	
	private boolean produtosImportados;

	public Vestuario(String nome, int quantidadeFuncionarios, 
			double salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao, boolean produtosImportados) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
		this.produtosImportados = produtosImportados;
	}

	public boolean getProdutosImportados() {
		return produtosImportados;
	}

	public void setProdutosImportados(boolean produtosImportados) {
		this.produtosImportados = produtosImportados;
	}

	@Override //metódo sobrescrito
	public String toString() {
		return super.toString() + "\n Produto importado: " + produtosImportados;
	}
	
	
	

}
