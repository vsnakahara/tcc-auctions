package utils;

import auctions.Turmas;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class Util {
    
    public boolean interseccao(List<Turmas> a, List<Turmas> b){
        
        for (int i = 0; i < a.size(); i++){
            for (int j=0; j < b.size(); j++){
               
                if (a.contains(b)){
                   System.out.println("\nIntersecção: "+a.get(i).getNome());
                   return true;
               }
                
            }
        }
        return false;
    }
    
    public boolean interseccaoTotal(List<Turmas> a, List<Turmas> b){
        
        for (int i = 0; i < a.size(); i++){
            for (int j=0; j < b.size(); j++){
               
                if (a.containsAll(b)){
                   System.out.println("\nIntersecção Total: "+a.get(i).getNome());
                   return true;
               }
                
            }
        }
        return false;
    }
    
    
    
}
