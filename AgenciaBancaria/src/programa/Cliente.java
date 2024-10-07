package programa;

public class Cliente {
	
	private static int counter =1; 
	
	private String nome;
	private String email;
	private String cpf;
	
	public Cliente(String nome, String email, String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	
		setCounter(getCounter() + 1);
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return "\nNome: " + this.getNome() +
				"\nNome: " + this.getEmail() +
				"\nNome: " + this.getCpf();
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Cliente.counter = counter;
	}
	
	
}
