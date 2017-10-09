package auctions;

import java.util.List;

/**
 *
 * @author vanessa
 */
public class Estrutura {

    private List<Turmas> turmas;
    private List<Professor> professores;
    private List<Proposta> propostas;

    public List<Turmas> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turmas> turmas) {
        this.turmas = turmas;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Proposta> getPropostas() {
        return propostas;
    }

    public void setPropostas(List<Proposta> propostas) {
        this.propostas = propostas;
    }
    
    
    
}
