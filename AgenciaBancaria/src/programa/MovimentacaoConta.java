package programa;

import Utilitarios.Utils;

public class MovimentacaoConta {

	private static int contadorDeContas = 1;

	private int numeroconta;
	private Cliente cliente;
	private double saldo;

	public MovimentacaoConta(Cliente cliente) {
		super();
		this.numeroconta = contadorDeContas;
		this.cliente = cliente;
		contadorDeContas += 1;

	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		return "\nNúmero da conta: " + this.getNumeroconta() + "\nNome: " + this.cliente.getNome() + "\nCPF: "
				+ this.cliente.getCpf() + "\nEmail: " + this.cliente.getEmail() + "\nSaldo: " + Utils.doubleTostString(this.getSaldo()) + "\n";
	}

	public void depositar(double valor) {
		if (valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("O depósito foi realizado com sucesso ");
		} else {
			System.out.println("O depósito não foi possível ser realizado ");
		}
	}
	
	public void sacar(double valor) {
		if (valor>0 && this.getSaldo()>= valor) {
			setSaldo(getSaldo()-valor);
	} else {
		System.out.println("Não foi possível realizar o saque ");
		}
	}
	
	public void transferencia(MovimentacaoConta contaParaDeposito , double valor) {
		if(valor>0 && this.getSaldo()>= valor) {
			setSaldo(getSaldo()-valor);
			contaParaDeposito.saldo = contaParaDeposito.getSaldo() - valor;
			System.out.println("Transferência realizada com sucesso");
		}else {
			System.out.println("Não foi possível realizar a transferência ");
		}	
		
	}
}
