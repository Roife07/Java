import java.util.Scanner;

public class Locacao {
    private Locatorio locatorio;
    private Quadra quadra;
    private int tempoMinuto;
    private char necessitaEquipamento;

    public Locacao() {
    }

    public Locatorio getLocatorio() {
        return locatorio;
    }

    public void setLocatorio(Locatorio locatorio) {
        this.locatorio = locatorio;
    }

    public Quadra getQuadra() {
        return quadra;
    }

    public void setQuadra(Quadra quadra) {
        this.quadra = quadra;
    }

    public int getTempoMinuto() {
        return tempoMinuto;
    }

    public void setTempoMinuto(int tempoMinuto) {
        this.tempoMinuto = tempoMinuto;
    }

    public char getNecessitaEquipamento() {
        return necessitaEquipamento;
    }

    public void setNecessitaEquipamento(char necessitaEquipamento) {
        this.necessitaEquipamento = necessitaEquipamento;
    }
   
    public double calcularLocacao(){
        int valorMinuto = getQuadra().getValorMinuto();
        double valorLocao = valorMinuto * getTempoMinuto();
        
        if(getTempoMinuto() > 120){
            valorMinuto = (valorMinuto / 100) * 90;
        }
        valorLocao = valorMinuto * getTempoMinuto();
        if(getNecessitaEquipamento() == 'S' || getNecessitaEquipamento() == 's'){
            valorLocao = valorLocao + 50;
        }
        
        return valorLocao;
    }
    public void mostrarResumoLocacao(){
        System.out.println("\nResumo da Locação\nLocatario\nNome: "+getLocatorio().getNome()+
                "\nCpf: "+getLocatorio().getCpf()+
                "\nTelefone: "+getLocatorio().getTelefone()+
                "\nAno de Nascimento: "+getLocatorio().getAnoNascimento()+
                "\nQuadra"+
                "\nNome da Quadra: "+getQuadra().getNome()+
                "\nTipo: "+getQuadra().getTipoDaquadra()+
                "\nValor do Minuto: "+getQuadra().getValorMinuto()+
                "\nLocação"+
                "\nTempo em Minutos: "+getTempoMinuto()+
                "\nNecessita Equipamentos: "+getNecessitaEquipamento()+
                "\nValor Calculado: "+calcularLocacao());
        
    }
    public void cadastrarLocacao(){
        try (Scanner EntradaInteiro = new Scanner(System.in)) {
            @SuppressWarnings("resource")
            Scanner scannerTexto = new Scanner(System.in);
            
            Quadra quadra = new Quadra();
            Locatorio locatorio =  new Locatorio();
            
            quadra.CadastrarQuadra();    
            locatorio.cadastrarLocatorio();
            
            setQuadra(quadra);
            setLocatorio(locatorio);
            
            getLocatorio().verificarMaiorIdade();
            
            int idade = 2023 - getLocatorio().getAnoNascimento();
            if(idade >= 18){
                System.out.println("Informe a quantidade de tempo em Minutos: ");
                setTempoMinuto(EntradaInteiro.nextInt());
                
                System.out.println("Informe se necessita de equipamento (S - Sim, N - Não): ");
                setNecessitaEquipamento(scannerTexto.next().charAt(0));
                
                mostrarResumoLocacao();
            }else{
                System.out.println("Programa Encerrado por Locatorio ser Menor de Idade");
            }
        }
       
    }
}
