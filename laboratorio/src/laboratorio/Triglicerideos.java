
package laboratorio;

import javax.swing.JOptionPane;


public class Triglicerideos extends Exame{
    private double quantidadeTriglicerideos;
    private String resultado;
    
    public Triglicerideos(String nomePaciente,String tipoSanguineo,int anoNascimento,double quantidadeTriglicerideos){
        super(nomePaciente,tipoSanguineo,anoNascimento);
        this.quantidadeTriglicerideos=quantidadeTriglicerideos;
        
    }
    public Triglicerideos(){
        super("","",0);
        coletarDados();
    }
    public void coletarDados(){
        this.nomePaciente=JOptionPane.showInputDialog("Digite o nome do paciente: ");
        this.tipoSanguineo=JOptionPane.showInputDialog("Digite o tipo sanguineo: ");
        this.anoNascimento=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
        this.quantidadeTriglicerideos=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de triglicerideos: "));
    }
    public void cadastrarExame(){
        int idade= 2023 - this.anoNascimento;
        if(idade<=9 && quantidadeTriglicerideos <75){
            this.resultado="Triglicerideos BOM";
        }else if(idade>10 && idade <=19 && quantidadeTriglicerideos<90){
            this.resultado="Triglicerideos BOM";
        }else if(idade>=20 && quantidadeTriglicerideos<150){
            this.resultado="Triglicerideos BOM";
        }else{
            this.resultado="Triglicerideos RUIM";
        }
    }
    public void mostrarResultado(){
        String mensagem="Nome:"+this.nomePaciente+"\nResultado Triglicerideos: "+quantidadeTriglicerideos+
                "\nClassificação: "+this.resultado;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
