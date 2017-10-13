package utils;

import auctions.Estrutura;
import auctions.Proposta;
import auctions.Turmas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class Util {
    
    public static Turmas interseccao(List<Turmas> a, List<Turmas> b){
        Turmas novaTurma = null;
        
        for (int i = 0; i < a.size(); i++){
//            for (int j = 0; j < b.size(); j++){
                if (b.contains(a.get(i))){
                   novaTurma = a.get(i);
                   System.out.println("A: "+a.get(i).getId()+" "+a.get(i).getNome()); 
                   
                }
                
//            }
        }
        return novaTurma;
        
    }
    
    public static void interseccaoTotal(List<Turmas> a, List<Turmas> b){
        
        for (int i = 0; i < a.size(); i++){
            for (int j=0; j < b.size(); j++){
               
                if (a.containsAll(b)){
                   System.out.println("\nIntersecção Total: "+a.get(i).getNome());
                   System.out.println("Intersecção Total: "+b.get(j).getNome());
                }
                
            }
        }
    }
    
    public static void intersecaoListas(Estrutura e){
        
        List<Turmas> nova = new ArrayList<>();
        
        for (int i = 0; i < e.getPropostas().size()-1; i++) {
            ///não tá certo :sss
            nova.add(interseccao(e.getPropostas().get(i).getTurmas(), e.getPropostas().iterator().next().getTurmas()));
            
        }
        System.out.println("\ntam nova lista: "+nova.size());
        
    
    }
    
    
}
