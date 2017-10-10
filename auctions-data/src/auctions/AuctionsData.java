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
    
    public void popularDados(){
        
        Turmas T1 = new Turmas(1, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T2 = new Turmas(2, "ANALISE DE SISTEMAS DE SOFTWARE", 4, 2);
        Turmas T3 = new Turmas(3, "BANCO DE DADOS I", 4, 2);
        Turmas T4 = new Turmas(4, "PROJETO E ANALISE DE ALGORITMOS", 6, 2);
        Turmas T5 = new Turmas(5, "INTERACAO SER-HUMANO COMPUTADOR", 4, 2);
        Turmas T6 = new Turmas(6, "LINGUAGENS FORMAIS E AUTOMATOS", 6, 2);
        Turmas T7 = new Turmas(7, "IMPLEMENTACAO DE SIST. DE SOFTWARE", 4, 2);
        
        Estrutura e = new Estrutura();        
        e.getTurmas().add(T1);
        e.getTurmas().add(T2);
        e.getTurmas().add(T3);
        e.getTurmas().add(T4);
        e.getTurmas().add(T5);
        e.getTurmas().add(T6);
        e.getTurmas().add(T7);
        
        e.getProfessores().add(new Professor(1, "P1", 4, 14));
        e.getProfessores().add(new Professor(2, "P2", 4, 14));
        e.getProfessores().add(new Professor(3, "P3", 4, 14));
        
        List<Turmas> s1 = new ArrayList<>();
        s1.add(T1);
        s1.add(T2);
        
        List<Turmas> s2 = new ArrayList<>();
        s2.add(T3);
        s2.add(T4);
        
        List<Turmas> s3 = new ArrayList<>();
        s3.add(T5);
        s3.add(T6);
        
        e.getPropostas().add(new Proposta(1, 5, s1));
        e.getPropostas().add(new Proposta(2, 6, s2));
        e.getPropostas().add(new Proposta(3, 7, s3));
        
        e.estimarValorPropostas();
    }
    
    public static void main(String[] args) {
        AuctionsData ad = new AuctionsData();
        ad.popularDados();
        
        
    }
    
}
