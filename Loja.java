
public class Loja {

	private String nome;
	private int quantidadeFuncionarios;
	private double salarioBaseFuncionario;
	private Endereco endereco;
	private Data dataFundacao;
	private Produto[] estoqueProdutos;
	
	//método construtor - sobrecarga
	public Loja (String nome, int quantidadeFuncionarios, 
			double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos ) {
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = salarioBaseFuncionario;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
		this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
	}
	
	public Loja (String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos ) {
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = - 1;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
		this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
	}
	
	public Loja (String nome, int quantidadeFuncionarios) {
		this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        
	}
	
	public Loja (String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
		this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
	}
	
	public Loja(int quantidadeMaximaProdutos) {
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }
	
	public Loja (String nome, int quantidadeFuncionarios, 
			double salarioBaseFuncionario, Endereco endereco, Data dataFundacao ) {
		this.nome = nome;
		this.quantidadeFuncionarios = quantidadeFuncionarios;
		this.salarioBaseFuncionario = salarioBaseFuncionario;
		this.endereco = endereco;
		this.dataFundacao = dataFundacao;
		
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
	
	public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
	}
	

	// método toString:
	@Override
	public String toString() {
		return "Nome da Loja: " +nome
				+ "\nQuantidade de Funcionários: " + quantidadeFuncionarios 
				+ "\nSalário Base do Funcionário: " + String.format("%.2f",salarioBaseFuncionario)
				+ "\n" + endereco
				+ "\nData da Fundação da Loja: " + dataFundacao + "\nEstoque de Produtos: " + estoqueProdutos;

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
	
	public void imprimeProdutos() {
        System.out.println("Produtos da loja:");
        for (Produto produto : estoqueProdutos) { //for each
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }
	
    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            Produto produto = estoqueProdutos[i];
            if (produto != null && produto.getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
}

