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
    
    
    
    
}
