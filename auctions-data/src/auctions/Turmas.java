package auctions;
 
import java.util.Objects;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + this.ch_turma;
        hash = 29 * hash + this.semestre;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.valorEstimado) ^ (Double.doubleToLongBits(this.valorEstimado) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.maiorValorEstimado) ^ (Double.doubleToLongBits(this.maiorValorEstimado) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.manorValorEstimado) ^ (Double.doubleToLongBits(this.manorValorEstimado) >>> 32));
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
        if (this.ch_turma != other.ch_turma) {
            return false;
        }
        if (this.semestre != other.semestre) {
            return false;
        }
        if (Double.doubleToLongBits(this.valorEstimado) != Double.doubleToLongBits(other.valorEstimado)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maiorValorEstimado) != Double.doubleToLongBits(other.maiorValorEstimado)) {
            return false;
        }
        if (Double.doubleToLongBits(this.manorValorEstimado) != Double.doubleToLongBits(other.manorValorEstimado)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
}
