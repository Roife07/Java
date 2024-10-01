
package laboratorio;

import java.time.LocalDate;
import javax.swing.JOptionPane;


public class Colesterol extends Exame {
    private double quantidadeLDL;
    private double quantidadeHDL;
    private char risco;
    private String resultadoLDL;
    private String resultadoHDL;
    
    public Colesterol(String nomePaciente,String tipoSanguineo, int anoNascimento, double quantidadeLDL,
            char risco){
        super(nomePaciente,tipoSanguineo,anoNascimento);
        this.quantidadeLDL=quantidadeLDL;
        this.quantidadeHDL=quantidadeHDL;
        this.risco=risco;
    }
    public Colesterol(){
        super("","",0);
        coletarDados();
    }
    
    public void coletarDados(){
        this.nomePaciente=JOptionPane.showInputDialog("Digite o nome do paciente: ");
        this.tipoSanguineo=JOptionPane.showInputDialog("Digite o tipo sanguineo: ");
        this.anoNascimento=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        this.quantidadeLDL=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade LDL: "));
        this.quantidadeHDL=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade HDL: "));
        this.risco=JOptionPane.showInputDialog("Digite o risco(B-baixo, M-médio, A-alto").charAt(0);
    }
    public void cadastroExame(){
        int idade= LocalDate.now().getYear() - this.anoNascimento;
        if((idade<=19 && quantidadeHDL>45)||(idade>19 && quantidadeHDL>40)){
            resultadoHDL="BOM";
        }else{
            resultadoHDL="RUIM";
        }
        
        if(quantidadeLDL<100){
            this.resultadoLDL="Risco Baixo";
        }else if(quantidadeLDL <70){
            this.resultadoLDL="Risco Médio";
        }else if(quantidadeLDL<50){
            this.resultadoLDL="Risco Alto";
        }else{
            this.resultadoLDL="Sem Risco";
        }
    }
    
    public void mostrarResultado(){
        String mensagem="Nome: "+this.nomePaciente + "\nResultadoLDL: "+quantidadeLDL + "\nResultadoHDL: "
                +quantidadeHDL +"\nResultado Risco: "+risco+"\nClassificação HDL: "+this.resultadoHDL 
                +"\nLDL: "+this.resultadoLDL;
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
