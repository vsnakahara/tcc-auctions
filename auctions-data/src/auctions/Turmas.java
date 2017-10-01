package auctions;

import java.util.HashMap;
    
/**
 *
 * @author vanessa
 */
public class Turmas {
    
    
    //T conjunto de todas as turmas a serem distribuídos
    //P é o conjunto de todos os professores a serem alocados
    //S turmas de interesse de um professor Pi.
    
    private String nome;
    private int ch_turma;
    
    HashMap<String, Turmas> conjuntoS = new HashMap<>();

    public Turmas() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCh_turma() {
        return ch_turma;
    }

    public void setCh_turma(int ch_turma) {
        this.ch_turma = ch_turma;
    }

    public HashMap<String, Turmas> getConjuntoS() {
        return conjuntoS;
    }

    public void setConjuntoS(HashMap<String, Turmas> conjuntoS) {
        this.conjuntoS = conjuntoS;
    }
    
    
    
    
}
