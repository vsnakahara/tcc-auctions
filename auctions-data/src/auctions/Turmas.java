package auctions;
 
import java.util.Objects;

/**
 *
 * @author vanessa
 */
public class Turmas {
    
    
    private int id;
    private String nome;
    private int ch_turma;
    private int semestre;
    
    private float valorEstimado;
    private float maiorValorEstimado;
    private float manorValorEstimado;
    
    public Turmas(int id, String nome, int ch_turma, int semestre) {
        this.id = id;
        this.nome = nome;
        this.ch_turma = ch_turma;
        this.semestre = semestre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public float getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(float valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public float getMaiorValorEstimado() {
        return maiorValorEstimado;
    }

    public void setMaiorValorEstimado(float maiorValorEstimado) {
        this.maiorValorEstimado = maiorValorEstimado;
    }

    public float getManorValorEstimado() {
        return manorValorEstimado;
    }

    public void setManorValorEstimado(float manorValorEstimado) {
        this.manorValorEstimado = manorValorEstimado;
    }

}
