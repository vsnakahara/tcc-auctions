package auctions;

import java.util.List;

/**
 *
 * @author vanessa
 */
public class Proposta {
    //lances dados pelos professores
    // ScT
    //soma da carga horária semanal todal de um conjunto S
  
    private int idProfessor;
    private float valor;
    private float valorIndividual;
    private int chTotal; 
    private List<Turmas> turmas;

    public Proposta(Integer idProfessor, float valor, List<Turmas> turmas) {
        this.idProfessor = idProfessor;
        this.valor = valor;
        this.turmas = turmas;
        this.chTotal = this.calcularCargaHoraria(turmas);
        this.valorIndividual = this.calcularValorIndividual(turmas);
    }

    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getChTotal() {
        return chTotal;
    }

    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }

    public List<Turmas> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turmas> turmas) {
        this.turmas = turmas;
    }

    public float getValorIndividual() {
        return valorIndividual;
    }

    public void setValorIndividual(float valorIndividual) {
        this.valorIndividual = valorIndividual;
    }
    
    
    
    public int calcularCargaHoraria(List<Turmas> t){
        
        int total = 0;
        for(int i = 0; i<t.size(); i++){
            total += t.get(i).getCh_turma();
        }
        
        return total;
    }
    
    public float calcularValorIndividual(List<Turmas> t){
        
        return this.getValor()/t.size();
        
    }
    
    public String showItens(List<Turmas> t){
        StringBuilder id_turmas = new StringBuilder();
        for(Turmas turma: t){
            id_turmas.append("T").append(turma.getId());
        }
        return id_turmas.toString();
    }
    
    
    
}
