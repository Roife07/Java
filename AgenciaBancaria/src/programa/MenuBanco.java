package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuBanco {
	
	static Scanner input = new Scanner(System.in);
	static ArrayList<MovimentacaoConta> contasBancarias;
	
	public static void main(String[] args) {
		contasBancarias = new ArrayList<MovimentacaoConta>();
		operacoes();
	}
	
	public static void operacoes(){
		
		System.out.println("Escolha uma opção: ");
		System.out.println("1- Cria uma conta ");
		System.out.println("2- Depósito ");
		System.out.println("3- Saque ");
		System.out.println("4- Transferência ");
		System.out.println("5- Dados da conta ");
		System.out.println("6- SAIR ");
		
		int operacoes = input.nextInt();
		
		switch (operacoes) {
		case 1: 
			criarConta();
			break;
		
		case 2: 
			deposito();
			break;
		
		case 3: 
			sacar();
			break;
		
		case 4: 
			transferencia();
			break;
		
		case 5: 
			dadosConta();
			break;
		
		case 6: 
			System.out.println("Até logo! Obrigado por usar nossos serviços");
			System.exit(0);

		default:
			System.out.println("Opção invalida");
			operacoes();
			break;
		}
			
		input.close();
	}
	
	public static void criarConta(){
		System.out.println("Digite um nome: ");
		String nome = input.next();
		System.out.println("Digite o seu CPF: ");
		String cpf = input.next();
		System.out.println("Digite o seu Email: ");
		String email = input.next();
		
		Cliente cliente = new Cliente(nome, email, cpf);
		MovimentacaoConta conta = new MovimentacaoConta(cliente);
		
		contasBancarias.add(conta);
		System.out.println("Sua conta foi criada com sucesso!");
		
		operacoes();
}
	
	private static MovimentacaoConta encontrarConta(int numeroconta) {
		MovimentacaoConta conta = null;
		if(contasBancarias.size()>0) {
			for(MovimentacaoConta c: contasBancarias) {
				if(c.getNumeroconta() == numeroconta);
				conta = c;
					
				}
			}
		return conta;
		}

	
	public static void deposito() {
		System.out.println("Digite o número da conta: ");
		int numeroconta = input.nextInt();
		
		MovimentacaoConta conta = encontrarConta(numeroconta);
			if(conta!= null) {
				System.out.println("Qual valor deseja depositar: ");
				double valorDeposito = input.nextDouble();
				conta.depositar(valorDeposito);
			}else {
				System.out.println("Conta não foi encontrada");
			}
		operacoes();
	}
	
	public static void sacar() {
		System.out.println("Digite o numero da conta: ");
		int numeroconta = input.nextInt();
		
		MovimentacaoConta conta = encontrarConta(numeroconta);
		if(conta!= null) {
			System.out.println("Qual valor deseja sacar:");
			double valorSaque = input.nextDouble();
			conta.sacar(valorSaque);
		}else {
			System.out.println("Conta não foi encontrada");
		}
		operacoes();
	}
	
	public static void transferencia() {
		System.out.println("Digite a conta para retirada do dinheiro");
		int numeroContaRetirada = input.nextInt();
		
		MovimentacaoConta contaRetirada = encontrarConta(numeroContaRetirada);
		
		if(contaRetirada!= null) {
			System.out.println("Digite a conta para receber a transferência:");
			int numeroContaReceber = input.nextInt();
			
			MovimentacaoConta contaReceber = encontrarConta(numeroContaReceber);
			if(contaReceber!= null) {
				System.out.println("Qual valor para transferir?");
				double valorTransferencia = input.nextDouble();
				contaRetirada.transferencia(contaReceber, valorTransferencia);
				System.out.println("Valor transferido com sucesso");
			}else {
				System.out.println("Não foi possivel transferir");
			}
		operacoes();
		}
		}
	
	public static void dadosConta() {
		if(contasBancarias.size()>0) {
			for(MovimentacaoConta infoconta : contasBancarias)
			System.out.println(infoconta);
		}else {
			System.out.println("Não há conta bancárias registradas");
		}
	operacoes();
	}

}