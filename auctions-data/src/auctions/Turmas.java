package auctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
    
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
    private double valorEstimado;
    private double maiorValorEstimado;
    private double manorValorEstimado;
    
    
    HashMap<String, ArrayList<Turmas>> conjuntoS = new HashMap<>();
    
    
    public void viewConjunto(String chave){
        for (Map.Entry<String, ArrayList<Turmas>> entry : conjuntoS.entrySet()) {
            
            if(entry.getKey().equals(chave)){
                String key = entry.getKey();
                for(int i = 0; i < entry.getValue().size(); i++){
                    System.out.print(entry.getValue().get(i).nome+" ");
                }
                
            }
        }
    }
   
    
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

    public HashMap<String, ArrayList<Turmas>> getConjuntoS() {
        return conjuntoS;
    }

    public void setConjuntoS(HashMap<String, ArrayList<Turmas>> conjuntoS) {
        this.conjuntoS = conjuntoS;
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
