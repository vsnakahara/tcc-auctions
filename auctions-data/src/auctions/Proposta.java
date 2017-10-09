package auctions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class Proposta {
    //lances dados pelos professores
    // ScT
    //soma da carga horária semanal todal de um conjunto S
    
    
    private int cd_proposta;
    private int cargaHoraria;
    private double valor;
    
    private Professor professor;
    private List<Turmas> turmas = new ArrayList<>();
    
	
    

    
    public Proposta(int cd_proposta, int cargaHoraria, double valor, 
            Professor professor, String subconjunto) {
        this.cd_proposta = cd_proposta;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
        this.professor = professor;
        
    }

    public int getCd_proposta() {
        return cd_proposta;
    }

    public void setCd_proposta(int cd_proposta) {
        this.cd_proposta = cd_proposta;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    
    
}
