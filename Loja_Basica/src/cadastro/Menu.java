package cadastro;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	static Scanner input = new Scanner(System.in);
	static ArrayList<Cliente> clienteslist;
	static ArrayList<Produto> produtlist;
	
	public static void main(String[] args) {
		clienteslist = new ArrayList<Cliente>();
		produtlist = new ArrayList<Produto>(); 
		menu();
		
	}
	
	private static void menu() {
		
		System.out.println("-----------------------");
		System.out.println("--Escolha uma opção: --");
		System.out.println("| 1- Cadastro Cliente |");
		System.out.println("| 2- Cadastro Produto |");
		System.out.println("| 3- Compras          |");
		System.out.println("| 4- Listar clientes  |");
		System.out.println("| 5- Listar produtos  |");
		System.out.println("| 6- SAIR             |");
		
		int menu = input.nextInt();
		
	switch (menu) {
	
	case 1:
		cadastroCliente();
		break;
	case 2:
		cadastroProduto();
		break;
	case 3:
		vendas();
		break;
	case 4:
		listaClientes();
		break;
	case 5:
		listaProdutos();
		break;
	case 6:
		System.out.println("Obrigado por usar nosso sistema!");
		System.exit(0);
		break;
	default:
		System.out.println("Opção inválida, Tente outra");
		menu();
		break;
	

	}
	}
	
	private static void cadastroCliente() {
		
		System.out.println("Digite o seu nome: ");
		String nome = input.next();
		System.out.println("Digite o seu E-mail: ");
		String email = input.next();
		
		Cliente cliente = new Cliente (nome, email);
		
		clienteslist.add(cliente);
		
		System.out.println("Cliente Cadastrado"+cliente);
		menu();
	}
	
	private static void cadastroProduto() {

	System.out.println("Digite o nome do produto: ");
	String nome = input.next();
	System.out.println("Digite o seu valor: ");
	double valor = input.nextDouble();
	
	Produto produto = new Produto(nome, valor);
	produtlist.add(produto);
	
	System.out.println("Produto cadastrado" + produto);
	menu();
}
	
	private static Cliente encontrarCliente(int numerocliente) {
		Cliente  cliente = null;
		if(clienteslist.size()>0) {
			for(Cliente c: clienteslist) {
				if(c.getNumerocliente() == numerocliente);
				cliente = c;
					
				}
			}
		return cliente;
		}
	
	private static Produto encontrarProdutos(int numerocodigo) {
		Produto objetos = null;
		if(produtlist.size()>0) {
			for(Produto p: produtlist) {
				if(p.getNumerocodigo()== numerocodigo);
				objetos = p;
			}
		}
		return objetos;
	}
	
	private static void vendas() {
		System.out.println("Digite o codigo do cliente: ");
		int numerocliente = input.nextInt();
		
		Cliente cliente = encontrarCliente(numerocliente);
		if(cliente!= null) {
			System.out.println("Qual codigo do produto: ");
			int Numerocodigo  = input.nextInt();
			
			Produto objetos = encontrarProdutos(Numerocodigo);
			if(objetos != null) {
				System.out.println("Valor de "+ objetos.getValor()+" a ser pago. Como será o pagamento?" );
				
		}else {
			System.out.println("Produto não encontrado");
		}
		}else {
			System.out.println("Cliente não encontrado");
		}
		menu();
	}
	
	private static void listaClientes() {
		if(clienteslist.size()>0) {
			for(Cliente infoconta : clienteslist)
			System.out.println(infoconta);
		}else {
			System.out.println("Não há clientes registrados");
		}
	menu();
			
		}
		
	private static void listaProdutos() {
		if(produtlist.size()>0) {
			for(Produto infoproduto : produtlist)
			System.out.println(infoproduto);
		}else {
			System.out.println("Não há produtos registrados");
		}
	menu();
	}
		
}
