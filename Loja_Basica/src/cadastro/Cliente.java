package cadastro;

public class Cliente {
	
	private static int counterClientes = 1;
	
	private String nome;
	private String email;
	private int numerocliente;
	
	public Cliente(String nome, String email) {
		this.numerocliente = counterClientes;
		this.nome = nome;
		this.email = email;
		setNumerocliente(getNumerocliente() + 1);
	
	}
	public int getNumerocliente() {
		return numerocliente;
	}

	public void setNumerocliente(int numerocliente) {
		this.numerocliente = numerocliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String toString() {
		return 	"\nID: " + this.getNumerocliente()+
				"\nNome: " + this.getNome() +
				"\nEmail: " + this.getEmail();
	}
	
}
