package auctions;

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
    private Turmas turmas = new Turmas();
    Professor professor = new Professor();

    public Proposta(int cd_proposta, int cargaHoraria, double valor) {
        this.cd_proposta = cd_proposta;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
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

    public Turmas getTurmas() {
        return turmas;
    }

    public void setTurmas(Turmas turmas) {
        this.turmas = turmas;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    
    
}
