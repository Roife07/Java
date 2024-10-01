
import java.util.Scanner;

public class Quadra {
    private String nome;
    private String tipoDaquadra;
    private int valorMinuto;

    public Quadra() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDaquadra() {
        return tipoDaquadra;
    }

    public void setTipoDaquadra(String tipoDaquadra) {
        this.tipoDaquadra = tipoDaquadra;
    }

    public int getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(int valorMinuto) {
        this.valorMinuto = valorMinuto;
    }
   
    
    public void CadastrarQuadra(){
        
        
        System.out.println("\nCadastro de Quadra.\n");
        try (Scanner EntradaInteiro = new Scanner(System.in)) {
            @SuppressWarnings("resource")
            Scanner scannerTexto = new Scanner(System.in);
            @SuppressWarnings("resource")
            Scanner scannerTexto2 = new Scanner(System.in);
            
            System.out.println("Informe o Nome: ");
            setNome(scannerTexto.next());

            System.out.println("Informe o Tipo da Quadra: ");
            setTipoDaquadra(scannerTexto2.next());
            
            System.out.println("Informe o Valor Minuto: ");
            setValorMinuto(EntradaInteiro.nextInt());
        }
        System.out.println("Cadastro Realizado com Sucesso.");
    }
    
    
}
