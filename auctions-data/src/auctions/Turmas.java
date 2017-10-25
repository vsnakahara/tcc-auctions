package auctions;
 
/**
 *
 * @author vanessa
 */
public class Turmas implements Comparable<Turmas>{
    
    
    private int id;
    private String nome;
    private int ch_turma;
    private int semestre;
    
    private float valorEstimado;
    private float maiorValorEstimado;
    private float manorValorEstimado;

    public Turmas() {
        super();
    }
    
    
    
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turmas other = (Turmas) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    
    
    
    @Override
    public int compareTo(Turmas t) {
        if (this.ch_turma < t.ch_turma) {
            return -1;
        }
        if (this.ch_turma > t.ch_turma) {
            return 1;
        }
        return 0;
    }
    
    
    
    

}
