

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	// método construtor:
	
	public Data() {
		
	}
	
	public Data ( int dia, int mes, int ano) {
	
		if (dia >=29 && mes == 2 && ano % 4 != 0 || dia > 31) {
			System.out.println("Data inválida, alterando data para 1/1/2000");
			this.dia = 1;
			this.mes = 1;
			this.ano = 2000;	
		}
		else if (mes == 4 || mes == 6 || mes ==9 || mes == 11 && dia > 30) {
			System.out.println("Data inválida, alterando data para 1/1/2000");
			this.dia = 1;
			this.mes = 1;
			this.ano = 2000;
		}
		else {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		
	}
	
	// métodos de acesso get e set:
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//método toString:
	@Override
	public String toString() {
		return "Data: "+dia+"/"+mes+"/"+ano;
	}
	
	// outros métodos:
	
	public boolean verificaAnoBissexto() {
		return (ano % 4 == 0);
	}
	
}