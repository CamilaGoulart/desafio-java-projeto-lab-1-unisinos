
public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	// método construtor:
	
	public Data() {
		
	}
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		if(!validaData()){
			this.dia = 1;
			this.mes = 1;
			this.ano = 2000;
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
	
	public boolean verificaAnoBissexto(){
		return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
	}
	
	private boolean validaData(){
		if (ano < 1){
			return false;
			
		} else if (mes < 1 || mes > 12) {
		  return false;
		  
		} else if (mes == 2) { // fevereiro
		  if (verificaAnoBissexto()) { // ano bissexto
			if(dia < 1 || dia > 29) return false;
		
		  } else {
			if (dia < 1 || dia > 28) return false;			
		  }
		  
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { // meses com 30 dias
		  if (dia < 1 || dia > 30) return false;
		  
		} else { // meses com 31 dias
		  if (dia < 1 || dia > 31) return false;
		}

		return true;
	}
	
	
}