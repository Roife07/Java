package cadastro;

public class Produto {
	
	private static int codigo = 1;
	
	private int numerocodigo;
	private String nome;
	private double valor;
	
	public Produto(String nome, double valor) {
		this.numerocodigo = codigo;
		this.nome = nome;
		this.valor = valor;
		setNumerocodigo(getNumerocodigo() + 1);
	}
	
	public int getNumerocodigo() {
		return numerocodigo;
	}

	public void setNumerocodigo(int numerocodigo) {
		this.numerocodigo = numerocodigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	public String toString() {
		return "\nNome: " + this.getNome() +
				"\nCodigo: " + this.getNumerocodigo() +
				"\nValor: " + this.getValor();
}
	}
