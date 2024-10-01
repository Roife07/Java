import java.util.Scanner;

public class Locatorio {
    private String nome;
    private String cpf;
    private String telefone;
    private int anoNascimento; 

    public Locatorio() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
     public void verificarMaiorIdade(){
         
        int idade = 2023 - getAnoNascimento();
        if(idade >= 18){
            System.out.println("Locatorio é Maior de Idade");
        }else{
            System.out.println("Locatorio é Menor de Idade");
        }
    }
    
    public void cadastrarLocatorio(){
        @SuppressWarnings("resource")
        Scanner scannerTexto = new Scanner(System.in);
        
        System.out.println("\nCadastro de Locatorio.\n");
        try (Scanner EntradaInteiro = new Scanner(System.in)) {
            System.out.println("Informe o Nome: ");
            setNome(scannerTexto.next());

            System.out.println("Informe o CPF: ");
            setCpf(scannerTexto.next());
            
            System.out.println("Informe o Telefone: ");
            setTelefone(scannerTexto.next());
            
            System.out.println("Informe o Ano de Nascimento: ");
            setAnoNascimento(EntradaInteiro.nextInt());
        }

        
        System.out.println("Cadastro Realizado com Sucesso.");
    
    }
}
