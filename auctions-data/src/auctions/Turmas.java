package auctions;
 
/**
 *
 * @author vanessa
 */
public class Turmas {
    
    
    //T conjunto de todas as turmas a serem distribuídos
    //P é o conjunto de todos os professores a serem alocados
    //S turmas de interesse de um professor Pi.
    
    private int id;
    private String nome;
    private int ch_turma;
    private int semestre;
    private double valorEstimado;
    private double maiorValorEstimado;
    private double manorValorEstimado;
    
    public Turmas() {
        super();
    }

    public Turmas(String nome, int ch_turma, double valorEstimado) {
        this.nome = nome;
        this.ch_turma = ch_turma;
        this.valorEstimado = valorEstimado;
    }
    
    

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
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

    public double getMaiorValorEstimado() {
        return maiorValorEstimado;
    }

    public void setMaiorValorEstimado(double maiorValorEstimado) {
        this.maiorValorEstimado = maiorValorEstimado;
    }

    public double getManorValorEstimado() {
        return manorValorEstimado;
    }

    public void setManorValorEstimado(double manorValorEstimado) {
        this.manorValorEstimado = manorValorEstimado;
    }
    
    
    
    
    
    
}
