package auctions;

import java.util.ArrayList;

/**
 *
 * @author vanessa
 */
public class AuctionsData {
    
    public static void main(String[] args) {
        
        Turmas turmas = new Turmas();
        
        Turmas T1 =  new Turmas("T1", 4, 0.00);
        Turmas T2 =  new Turmas("T2", 6, 0.00);
        Turmas T3 =  new Turmas("T3", 4, 0.00);
        Turmas T4 =  new Turmas("T4", 6, 0.00);
        Turmas T5 =  new Turmas("T5", 4, 0.00);
        ArrayList turma = new ArrayList();
        ArrayList turma2 = new ArrayList();
        turma.add(T1);
        turma.add(T2);
        turma.add(T3);
        turma2.add(T4);
        turma2.add(T5);
        
        turmas.getConjuntoS().put("S1", turma);
        turmas.getConjuntoS().put("S2", turma2);
        
        
        
        turmas.viewConjunto("S2");
        Professor p1 = new Professor("P1", 10, 20);
        Professor p2 = new Professor("P2", 8, 16);
        Professor p3 = new Professor("P3", 12, 22);
        
        
    }
    
}
