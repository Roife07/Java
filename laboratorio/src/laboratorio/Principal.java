
package laboratorio;


public class Principal {
    public static void main (String[] args){
        Glicemia exameGlicemia=new Glicemia();
        exameGlicemia.cadastroExame();
        exameGlicemia.mostrarResultado();
        
        Colesterol exameColesterol=new Colesterol();
        exameColesterol.cadastroExame();
        exameColesterol.mostrarResultado();
        
        Triglicerideos exameTriglicerideos=new Triglicerideos();
        exameTriglicerideos.cadastrarExame();
        exameTriglicerideos.mostrarResultado();
    }
}
