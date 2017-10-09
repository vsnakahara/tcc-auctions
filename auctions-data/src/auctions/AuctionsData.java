package auctions;

import java.util.ArrayList;
import java.util.List;
import utils.Util;

/**
 *
 * @author vanessa
 */
public class AuctionsData {
    Util util = new Util();
    
    public void show(){
        Turmas turmas = new Turmas();
        
        Turmas T1 =  new Turmas("T1", 4, 0.00);
        Turmas T2 =  new Turmas("T2", 6, 0.00);
        Turmas T3 =  new Turmas("T3", 4, 0.00);
        Turmas T4 =  new Turmas("T4", 6, 0.00);
        Turmas T5 =  new Turmas("T5", 4, 0.00);
        
        List<Turmas> turma = new ArrayList();
        List<Turmas> turma2 = new ArrayList();
        
        turma.add(T1);
        turma.add(T2);
        turma.add(T3);
        
        
        turma2.add(T3);
        turma2.add(T4);
        turma2.add(T5);
        
        util.interseccao(turma, turma2);
        util.interseccaoTotal(turma, turma2);
        
    }
    
    public static void main(String[] args) {
        AuctionsData a = new AuctionsData();
    
        a.show();
        
        Turmas turmas = new Turmas();
        
        Turmas T1 =  new Turmas("T1", 4, 0.00);
        Turmas T2 =  new Turmas("T2", 6, 0.00);
        Turmas T3 =  new Turmas("T3", 4, 0.00);
        Turmas T4 =  new Turmas("T4", 6, 0.00);
        Turmas T5 =  new Turmas("T5", 4, 0.00);
        
        List<Turmas> turma = new ArrayList();
        List<Turmas> turma2 = new ArrayList();
        
        turma.add(T1);
        turma.add(T2);
        turma.add(T3);
        turma2.add(T4);
        turma2.add(T3);
        turma2.add(T5);
        
        
//        turmas.viewConjunto("S2");
        Professor p1 = new Professor("P1", 10, 20);
        Professor p2 = new Professor("P2", 8, 16);
        Professor p3 = new Professor("P3", 12, 22);
        
        
        
//        Proposta proposta = new Proposta(1, turmas.calcularCHTotal("S1"), 10, p1, "S1");
        
//        Proposta prop = new Proposta(2, turmas.calcularCHTotal("S2"), 5, p2, "S2");
//        Proposta prop2 = new Proposta(2, turmas.calcularCHTotal("S1"), 6, p3, "S1");
//        Proposta prop3 = new Proposta(2, turmas.calcularCHTotal("S2"), 10, p3, "S2");
        
        ConjuntoTurmas c = new ConjuntoTurmas();
        Estrutura e = new Estrutura();
        Estrutura ee = new Estrutura();
        
        
        
        
        
        
        
        
        


    }
    
}
