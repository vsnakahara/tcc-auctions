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
               
                if (a.get(i).equals(b.get(j))){
                   System.out.println("A: "+a.get(i).getNome());
                   System.out.println("B: "+b.get(j).getNome());
                }
                
            }
        }
        
    }
    
    public void interseccaoTotal(List<Turmas> a, List<Turmas> b){
        
        for (int i = 0; i < a.size(); i++){
            for (int j=0; j < b.size(); j++){
               
                if (a.get(i).equals(b.get(j))){
                   System.out.println("\nIntersecção Total A: "+a.get(i).getNome());
                   System.out.println("Intersecção Total B: "+b.get(j).getNome());
                   
                   
               }
                
            }
        }
    }
    
    
    
}
