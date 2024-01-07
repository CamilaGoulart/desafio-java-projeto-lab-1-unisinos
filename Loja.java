
public class Loja {

	private String nome;
	private int quantidadeFuncionarios;
	private double salarioBaseFuncionario;
	private Endereco endereco;
	private Data dataFundacao;
	
	//método construtor:
	
	public Loja () {
		this.endereco = new Endereco();
		this.dataFundacao = new Data();
	}
	
	public Loja (String nome, int quantidadeFuncionarios, 
			double salarioBaseFuncionario, Endereco endereco, Data dataFundacao ) {
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = -1;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
	}
	
	public Loja (String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao ) {
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = -1;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
	}
	
	public Loja (String nome, int quantidadeFuncionarios) {
		this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        
	}
	
	// métodos de acesso get e set:
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}
	
	public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
		this.quantidadeFuncionarios = quantidadeFuncionarios;
	}
	
	public double getSalarioBaseFuncionario() {
		return salarioBaseFuncionario;
	}
	
	public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
		this.salarioBaseFuncionario = salarioBaseFuncionario;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Data getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Data dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	// método toString:
	@Override
	public String toString() {
		return "Nome da Loja: " +nome
				+ "\n Quantidade de Funcionários: " + quantidadeFuncionarios 
				+ "\n Salário Base do Funcionário: " + String.format("%.2f",salarioBaseFuncionario)
				+ "\n Endereço da Loja: " + endereco
				+ "\n Data da Fundação da Loja: " + dataFundacao;

	}
	
	// outros métodos:
	
	public double gastosComSalario() {
		if(salarioBaseFuncionario == -1) {
			return -1;
		}
		else {
			return salarioBaseFuncionario * quantidadeFuncionarios;
		}
	}
	
	public char tamanhoDaLoja() {
		if(quantidadeFuncionarios < 10) {
			return 'P';
		}
		else if ( quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
			return 'M';
		}
		else {
			return 'G';
		}
	}
	
}
