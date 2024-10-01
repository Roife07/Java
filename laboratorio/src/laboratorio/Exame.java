
package laboratorio;


public abstract class Exame {
    protected String nomePaciente;
    protected String tipoSanguineo;
    protected int anoNascimento;
    
    public Exame(){
        
    }
    
    public Exame(String nomePaciente,String tipoSanguineo, int anoNascimento){
        this.nomePaciente =nomePaciente;
        this.tipoSanguineo=tipoSanguineo;
        this.anoNascimento=anoNascimento;
    }

    
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

   
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    
    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

   
    public int getAnoNascimento() {
        return anoNascimento;
    }

   
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
             
        
}
