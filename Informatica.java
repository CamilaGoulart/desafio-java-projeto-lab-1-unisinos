
public class Informatica extends Loja {
	private double seguroEletronicos;

	//método construtor
	public Informatica(String nome, int quantidadeFuncionarios, 
			double salarioBaseFuncionario, Endereco endereco,
			Data dataFundacao,double seguroEletronicos, int estoqueProdutos) {
		super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
		this.seguroEletronicos = seguroEletronicos;
	}

	//método get e set
	public double getSeguroEletronicos() {
		return seguroEletronicos;
	}

	public void setSeguroEletronicos(double seguroEletronicos) {
		this.seguroEletronicos = seguroEletronicos;
	}
	
	//método toString
	public String toString() {
		return super.toString() + "\nSeguro eletrônico: R$ "+String.format("%.2f",seguroEletronicos);
	}
}
