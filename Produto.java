
public class Produto {

	private String nome;
	private double preco;
	private Data dataValidade;
	
	//método construtor:
	
	public Produto() {
		this.dataValidade = new Data();
	}

	public Produto(String nome, double preco, Data dataValidade) {
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
	}
	
	//métodos de acesso get e set: 
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Data getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Data dataValidade) {
		this.dataValidade = dataValidade;
	}
// meu código anterior:
/* public boolean estaVencido(Data data) {
		if (dataValidade.getAno() > data.getAno()) {
			return true;
		}
		else if (data.getAno() == dataValidade.getAno() 
				&&  dataValidade.getMes() > data.getMes()) {
            return true;
		}
		else if (data.getAno() == dataValidade.getAno() 
				&& data.getMes() == dataValidade.getMes() 
				&& dataValidade.getDia() >  data.getDia()) {
            return true;
		}
		else {
			return false;
		} */
		
	public boolean estaVencido(Data data) {
		if (dataValidade.getAno() > data.getAno()) {
			return true;
		}
		else if (data.getAno() < dataValidade.getAno()) {
			return false;
		}
		else{
			if (dataValidade.getMes() > data.getMes()){
				return true;
			}
			else if (dataValidade.getMes() < data.getMes()){
				return false;
		}
			else{
				return dataValidade.getDia() > data.getDia();
			}
		}
	
	}
	// método toString:
	@Override
	public String toString() {
		return "Nome do Produto: " +nome
				+ "\n Valor do Produto: R$ " +preco;
	}
	
	
	
}