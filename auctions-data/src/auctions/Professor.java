package auctions;

/**
 *
 * @author vanessa
 */
public class Professor {
    
    //carga horaria minima e maxima semanal
    private String nome;
    private int hMin;
    private int hMax;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int gethMin() {
        return hMin;
    }

    public void sethMin(int hMin) {
        this.hMin = hMin;
    }

    public int gethMax() {
        return hMax;
    }

    public void sethMax(int hMax) {
        this.hMax = hMax;
    }
    
    
}
