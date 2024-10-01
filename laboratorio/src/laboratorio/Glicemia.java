
package laboratorio;

import javax.swing.JOptionPane;


public class Glicemia extends Exame {
    private double quantidadeGlicose;
    private String resultado;
    
    public Glicemia(){
        super("", "", 0);
        coletarDados();
    } 
    private void coletarDados(){
        nomePaciente=JOptionPane.showInputDialog("Digite o nome do paciente: ");
        tipoSanguineo=JOptionPane.showInputDialog("Digite o tipo Sanguineo: ");
        anoNascimento=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        quantidadeGlicose=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de Glicose: "));
        
    }
    public void cadastroExame(){
        if(quantidadeGlicose<100){
            this.resultado="Normoglicemia";
        }else if(quantidadeGlicose>=100 && quantidadeGlicose <126){
            this.resultado="Pré-Diabetes";
        }else if(quantidadeGlicose>=126){
            this.resultado="Diabetes estabelecido";
        }
    }
    public void mostrarResultado(){
        String mensagem="Nome: "+this.nomePaciente+"\nREsultado: "+quantidadeGlicose+"\nClassificação: "
                +this.resultado;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
