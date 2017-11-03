package auctions;

import java.util.HashMap;
import java.util.Map;

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
    private HashMap<Integer, Turmas> turmas;

    public Proposta(Integer idProfessor, float valor, HashMap<Integer, Turmas> turmas) {
        this.idProfessor = idProfessor;
        this.valor = valor;
        this.turmas = turmas;
        this.chTotal = this.calcularCargaHoraria(turmas);
        this.valorIndividual = this.calcularValorIndividual(turmas);
    }
    
    public int calcularCargaHoraria(HashMap<Integer,Turmas> t){
        
        int total = 0;
        for (Map.Entry<Integer,Turmas> i : t.entrySet()) {
            total += i.getValue().getCh_turma();
        }
        
        return total;
    }
    
    public float calcularValorIndividual(HashMap<Integer,Turmas> t){
        
        return this.getValor()/t.size();
        
    }
    
    public String showItens(HashMap<Integer,Turmas> t){
        StringBuilder id_turmas = new StringBuilder();
        try{
            for (Map.Entry<Integer,Turmas> i : t.entrySet()) {
                if(t != null){
                    id_turmas.append("T").append(i.getValue().getId());
                }
            }
        }catch(Exception e){}
        return id_turmas.toString();
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

    public float getValorIndividual() {
        return valorIndividual;
    }

    public void setValorIndividual(float valorIndividual) {
        this.valorIndividual = valorIndividual;
    }

    public HashMap<Integer, Turmas> getTurmas() {
        return turmas;
    }

    public void setTurmas(HashMap<Integer, Turmas> turmas) {
        this.turmas = turmas;
    }
    
    
    
    
    
    
    
    
    
}
