import java.util.Arrays;

public class Shopping {
	private String nome;
	private Endereco endereco;
	private Loja[] lojas;
	
	//método construtor
	public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
	}

	//métodos de acesso get e set
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public Loja[] getLojas() {
		return lojas;
	}

	//outros métodos
	public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {  
                lojas[i] = novaLoja;
                return true;
            }
        }
        return false;
	}

	public boolean removeLoja(String nomeLoja) {
	    for (int i = 0; i < lojas.length; i++) {
	        if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
	            lojas[i] = null;
	            return true;
	        }
	    }
	    return false; 
	}
	
	public int quantidadeLojasPorTipo(String tipoLoja) {
	    int quantidade = 0;

	    for (Loja loja : lojas) {
	        if (loja != null && loja instanceof Cosmetico && tipoLoja.equalsIgnoreCase("Cosmético")) {
	            quantidade++;
	        } else if (loja != null && loja instanceof Vestuario && tipoLoja.equalsIgnoreCase("Vestuário")) {
	            quantidade++;
	        } else if (loja != null && loja instanceof Bijuteria && tipoLoja.equalsIgnoreCase("Bijuteria")) {
	            quantidade++;
	        } else if (loja != null && loja instanceof Alimentacao && tipoLoja.equalsIgnoreCase("Alimentação")) {
	            quantidade++;
	        } else if (loja != null && loja instanceof Informatica && tipoLoja.equalsIgnoreCase("Informática")) {
	            quantidade++;
	        }
	    }

	    if (quantidade > 0) {
	        return quantidade;
	    } else {
	        return -1;  
	    }
	}

	public Informatica lojaSeguroMaisCaro() {
	    Informatica lojaMaisCara = null;
	    double maiorValorSeguro = 0.0;

	    for (Loja loja : lojas) {
	        if (loja instanceof Informatica) {
	            Informatica informatica = (Informatica) loja;
	            double valorSeguro = informatica.getSeguroEletronicos();

	            if (valorSeguro > maiorValorSeguro) {
	                maiorValorSeguro = valorSeguro;
	                lojaMaisCara = informatica;
	            }
	        }
	    }

	    return lojaMaisCara;
	}
	
@Override

public String toString() {
	return "/nNome da Loja: " + nome + "/nEndereço: " + endereco + "/nLojas: " + Arrays.toString(lojas);
}

	
	

}
