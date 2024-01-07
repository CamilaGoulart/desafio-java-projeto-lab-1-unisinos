
public class Alimentacao extends Loja{
	private Data dataAlvara;

	//método construtor
	public Alimentacao(String nome, int quantidadeFuncionarios, 
			double salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao,Data dataAlvara, int estoqueProdutos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos );
		this.dataAlvara = dataAlvara;
	}

	//métodos get e set
	public Data getDataAlvara() {
		return dataAlvara;
	}

	public void setDataAlvara(Data dataAlvara) {
		this.dataAlvara = dataAlvara;
	}

	//método toString - sobrescrita.
	@Override
	public String toString() {
		return super.toString() + "\nData do Alvará: " +dataAlvara;
	}
	
	
}
