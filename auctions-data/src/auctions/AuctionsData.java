package auctions;

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
        
        turmas.getConjuntoS().put("S1", new Turmas("T1", 4, 0.00));
        turmas.getConjuntoS().put("S1", new Turmas("T2", 6, 0.00));
        turmas.getConjuntoS().put("S1", new Turmas("T3", 4, 0.00));
        
        turmas.getConjuntoS().put("S2", T4);
        turmas.getConjuntoS().put("S2", T5);
        
        turmas.viewConjunto("S1");
//        turmas.viewConjunto("S2");
        
    }
    
}
