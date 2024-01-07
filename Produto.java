
public class Produto {

	private String nome;
	private double preco;
	
	//método construtor:
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
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
	
	// método toString:
	@Override
	public String toString() {
		return "Nome do Produto: " +nome
				+ "Valor do Produto: R$ " +preco;
	}

}
