
public class Produto {

	private String nome;
	private double preco;
	private Data dataValidade;
	
	//método construtor:
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

	//outros métodos
	public boolean estaVencido(Data data) {
		if(data.getAno() > dataValidade.getAno()){
            return true;
		}
		else if(data.getAno() < dataValidade.getAno()){
            return false;
		}
		else if(data.getMes() > dataValidade.getMes()){
            return true;
		}
		else if(data.getMes() < dataValidade.getMes()){
            return false;
		}
		else if(data.getDia() > dataValidade.getDia()){
            return true;
		}
		else {
			return false;
		}
	
	}
	// método toString:
	@Override
	public String toString() {
		return "Nome do Produto: " +nome
				+ "\nValor do Produto: R$ " +String.format("%.2f", preco)
				+ "\nData de validade: " + dataValidade;
	}
	
}