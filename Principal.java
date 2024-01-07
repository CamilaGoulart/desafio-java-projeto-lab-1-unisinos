
import java.util.Scanner;
import java.util.Locale;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		int resp;
		
		do {
			System.out.println("MENU:");
			System.out.println("(1) criar uma loja");
			System.out.println("(2) criar um produto");
			System.out.println("(3) sair");
			System.out.println("Digite a opção desejada: ");
			resp = sc.nextInt();
			
			if (resp == 1) {
				
				criarLoja();
				
			}
			else if (resp == 2) {
				criarProduto();
				
			}
			
			else if (resp == 3) {
				System.out.println("Saindo...");
			}
			
			else {
				System.out.println("Opção inválida! ");
			}
			
				
		}while (resp != 1 && resp != 2 && resp != 3);
		
		
		sc.close();
		scString.close();
	}

	public static void criarLoja(){

	Loja loja = new Loja();
	Scanner sc = new Scanner(System.in);
	Scanner scString = new Scanner(System.in);
		

	System.out.println("Digite o nome da loja: ");
	loja.setNome(scString.nextLine());
	System.out.println("Digite a quantidade de funcionários: ");
	loja.setQuantidadeFuncionarios(sc.nextInt());
	System.out.println("Digite o salário base do(s) funcionário(s): ");
	loja.setSalarioBaseFuncionario(sc.nextDouble());


	Endereco endereco = new Endereco();

	System.out.println("Digite o nome da rua da loja: ");
	endereco.setNomeDaRua(scString.nextLine());
	System.out.println("Digite o número: ");
	endereco.setNumero(scString.nextLine());
	System.out.println("Digite o complemento: ");
	endereco.setComplemento(scString.nextLine());
	System.out.println("Digite o CEP: ");
	endereco.setCep(scString.nextLine());
	System.out.println("Digite a cidade: ");
	endereco.setCidade(scString.nextLine());
	System.out.println("Digite o estado: ");
	endereco.setEstado(scString.nextLine());
	System.out.println("Digite o país: ");
	endereco.setPais(scString.nextLine());

	Data data = new Data();

	System.out.println("Digite o dia de fundação da loja:");
	data.setDia(sc.nextInt());
	System.out.println("Digite o mês de fundação da loja:");
	data.setMes(sc.nextInt());
	System.out.println("Digite o ano de fundação da loja:");
	data.setAno(sc.nextInt());

	loja.setEndereco(endereco);
	loja.setDataFundacao(data);

	System.out.println(loja.toString());

	sc.close();
	scString.close();
	}
	
	public static void criarProduto(){
	Produto produto = new Produto();

	Scanner sc = new Scanner(System.in);
	Scanner scString = new Scanner(System.in);

	System.out.println("Digite o nome do produto: ");
	produto.setNome(scString.nextLine());
	System.out.println("Digite o preço do produto:");
	produto.setPreco(sc.nextDouble());

	Data data = new Data();
			
	System.out.println("Digite a data de validade do produto: ");
	System.out.println("dia:");
	data.setDia(sc.nextInt());
	System.out.println("mês:");
	data.setMes(sc.nextInt());
	System.out.println("ano:");
	data.setAno(sc.nextInt());
			
	produto.setDataValidade(data);

	Data dataReferencia = new Data(20, 10, 2023);

	if (produto.estaVencido(dataReferencia) == true){
	System.out.println("O PRODUTO ESTÁ VENCIDO");
	}
	else{
	System.out.println("PRODUTO NÃO VENCIDO");
	}

	sc.close();
	scString.close();
	}
}
