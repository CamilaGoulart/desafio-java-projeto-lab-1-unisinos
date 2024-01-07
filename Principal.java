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

	public static void criarLoja() {
		
	Scanner sc = new Scanner(System.in);
	Scanner scString = new Scanner(System.in);
	
	System.out.println("Digite o nome da loja: ");	
	String nome = scString.nextLine();
	System.out.println("Digite a quantidade de funcionários: ");
	int quantidadeFuncionarios = sc.nextInt();
	System.out.println("Digite o salário base do(s) funcionário(s): ");
	double salarioBaseFuncionario = sc.nextDouble();
	
	System.out.println("Digite o nome da rua da loja: ");
	String nomeDaRua = scString.nextLine();
	System.out.println("Digite o número: ");
	String numero = scString.nextLine();
	System.out.println("Digite o complemento: ");
	String complemento = scString.nextLine();
	System.out.println("Digite o CEP: ");
	String cep = scString.nextLine();
	System.out.println("Digite a cidade: ");
	String cidade = scString.nextLine();
	System.out.println("Digite o estado: ");
	String estado = scString.nextLine();
	System.out.println("Digite o país: ");
	String pais = scString.nextLine();
	
	System.out.println("Digite o dia de fundação da loja:");
	int dia = sc.nextInt();
	System.out.println("Digite o mês de fundação da loja:");
	int mes = sc.nextInt();
	System.out.println("Digite o ano de fundação da loja:");
	int ano = sc.nextInt();
	
	Data dataFundacao = new Data(dia,mes,ano);
	Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
	Loja loja = new Loja(nome,quantidadeFuncionarios,salarioBaseFuncionario, endereco, dataFundacao);
	
	System.out.println(loja.toString());
	
	sc.close();
	scString.close();	
	}	
	
	public static void criarProduto(){
	
	Scanner sc = new Scanner(System.in);
	Scanner scString = new Scanner(System.in);
	
	System.out.println("Digite o nome do produto: ");
	String nome = scString.nextLine();
	System.out.println("Digite o preço do produto:");
	double preco = sc.nextDouble();
	
	System.out.println("Digite a data de validade do produto: ");
	System.out.println("dia:");
	int dia = sc.nextInt();
	System.out.println("mês:");
	int mes = sc.nextInt();
	System.out.println("ano:");
	int ano = sc.nextInt();
	
	Data dataValidade = new Data(dia, mes, ano);
	Produto produto = new Produto (nome, preco, dataValidade);
	
	Data data = new Data(20, 10, 2023);
	
	if (produto.estaVencido(data)){
		System.out.println("O PRODUTO ESTÁ VENCIDO");
		}
		else{
		System.out.println("PRODUTO NÃO VENCIDO");
		}
	
	System.out.println(produto.toString());


	sc.close();
	scString.close();
	}
}
