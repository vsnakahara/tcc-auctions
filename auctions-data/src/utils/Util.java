package utils;

import auctions.Turmas;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class Util {
    
    public void interseccao(List<Turmas> a, List<Turmas> b){
        
        for (int i = 0; i < a.size(); i++){
            for (int j=0; j < b.size(); j++){
//                a.get(0).getId() == b.get(0).getId()
                
                if (a.get(i).getId() == b.get(j).getId()){
                   System.out.println("A: "+a.get(i).getNome());
                   System.out.println("B: "+b.get(j).getNome());
                }
                
            }
        }
        
    }
    
    public void interseccaoTotal(List<Turmas> a, List<Turmas> b){
        
        for (int i = 0; i < a.size(); i++){
            for (int j=0; j < b.size(); j++){
               
                if (a.containsAll(b)){
                   System.out.println("\nIntersecção Total: "+a.get(i).getNome());
                   System.out.println("Intersecção Total: "+b.get(j).getNome());
                }
                
            }
        }
    }
    
    
    
}
