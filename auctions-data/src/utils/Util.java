package utils;

import auctions.Proposta;
import auctions.Turmas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class Util {

    public static List<Turmas> interseccao(List<Turmas> a, List<Turmas> b) {
        List<Turmas> novaTurma = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (b.contains(a.get(i))) {
                novaTurma.add(a.get(i));
                System.out.println("A: " + a.get(i).getId() + " " + a.get(i).getNome());

            }
        }

        return novaTurma;

    }

    public static void interseccaoTotal(List<Turmas> a, List<Turmas> b) {

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {

                if (a.containsAll(b) && b.containsAll(a)) {
                    System.out.println("\nIntersecção Total: " + a.get(i).getNome());
                    System.out.println("Intersecção Total: " + b.get(j).getNome());
                }

            }
        }
    }

    

}


// public boolean q(Proposta p, Turmas nova) {
//        for (Proposta prop : this.getPropostas()) {
//            if (!prop.equals(p) && prop.getTurmas().size() == 1) {
//                if (p.getIdProfessor() == prop.getIdProfessor()) {
//
//                    if (prop.getTurmas().containsKey(nova.getId())) {
//                        if (prop.getValorIndividual() < nova.getValorEstimado()) {
//
//                            System.out.println("Já existe> " + nova.getId());
//                            System.out.println("> já " + prop.getValorIndividual());
//                            System.out.println(">> new " + nova.getValorEstimado());
//
//                            return false;
//                        }
//
//                    }
//                } else {
//                    return true;
//                }
//
//            }
//        }
//        return false;
//    }

//    public void interseccaoListas(Estrutura e) {
//
//        for (int i = 0; i < e.getPropostas().size() - 1; i++) {
//            for (int j = 1; j < e.getPropostas().size(); j++) {
//
//                if (i != j) {
////                    interseccaoTotal(e.getPropostas().get(i).getTurmas(), 
////                                                e.getPropostas().get(j).getTurmas());
//
//                    this.getInterseccaoPropostas().addAll(Util.interseccao(e.getPropostas().get(i).getTurmas(),
//                            e.getPropostas().get(j).getTurmas()));
//
//                }
//            }
//        }
//
//    }


/*
    - valores significativos para valoração de itens 5, 10, 15 (Exemplo), e qual o seu grau de importância
    - o que significa os pesos negativos para as turmas que não foram escolhidas e como obtê-las
    - o que ocorre quando duas propostas do mesmo professor possui concorrência de itens 
        -- ex: vp1 = ({t1, t2}, 5) e vp2 = ({t2, t3}, 7)
    - utilizar matriz turmas-propostas, para descobrir a intersecção    

    matriz[1][100]

 */
//    public void dividirEmSubconjuntos(Proposta proposta) {
//        //pegar a Set<turmas> da intersecao
//        interseccaoListas(this);
//        Professor p = this.getProfessores().get(proposta.getIdProfessor());
//
////        System.out.println("\nList size: "+proposta.getTurmas().size());
////        System.out.println("\nSet size: "+this.getInterseccaoPropostas().size());
//        //percorrer listas
//        for (Turmas turmaProposta : proposta.getTurmas()) {
////            System.out.println("\nentrei");
//
//            for (Turmas t : this.getInterseccaoPropostas()) {
//
////                System.out.println("\nentrei2");
////                System.out.println("id:" +t.getId());
////                System.out.println("pid:" +turmaProposta.getId());
//                if (turmaProposta.getId() == t.getId()) {
//                    System.out.println("\nentrei3");
//                    //se estiver na lista é removido da listaa
//                    //adicionar como uma nova nova proposta
//                    //setar o valor individual da turma, para cada professor. 
//
//                    List<Turmas> l = new ArrayList<>();
//                    l.add(turmaProposta);
//
//                    this.getPropostas().add(new Proposta(p.getId(), proposta.getValorIndividual(), l));
//
//                    System.out.println("\nList size: " + this.getPropostas().size());
//                    System.out.println("\nTurmast size: " + proposta.getTurmas().size());
//
//                    proposta.getTurmas().remove(turmaProposta);
//
//                }
//
//            }
////            
//        }
//
//        System.out.println("\nList size: " + this.getPropostas().size());
//
//    }
//    public void matrizToString(int matriz[][]) {
//        String retStr = "";
//        for (int j = 0; j < this.getTurmas().size()-1; j++) {
//            for (int i = 0; i < this.getTurmas().size()-1; i++) {
//                retStr += Integer.toString(matriz[j][i]);
//                retStr += " ";
//                System.out.println(" j: "+j+" i: "+i+" m: "+matriz[j][i]);
//            }
//        }
//        System.out.println(retStr.trim());
//
//    }
//    public void toPrinTurmas(List<Turmas> t){
//        for (Turmas turma : t) {
//            System.out.format("Prof id: %d | VL: %.2f | Vli: %.2f | ch: %d \n", 
//                    p.getIdProfessor(), p.getValor(), p.getValorIndividual(), p.getChTotal());
//        }
//    
//    }
//    public PriorityQueue<Turmas> adicionarFilaPrioridade(Proposta proposta, int id_turma) {
//        //priority queue
//        PriorityQueue<Turmas> Q = new PriorityQueue<>();
//        Turmas t;
//        Professor p;
//
//        int chMax = 0, chMin = 0;
//
//        Turmas turma = this.getTurmas().get(id_turma);
//        if (proposta.getTurmas().size() > 1) {
//            for (Map.Entry<Integer, Turmas> i : proposta.getTurmas().entrySet()) {
//
//                if (i.getKey() == turma.getId()) {
//                    boolean b = Q.add(i.getValue());
//                    System.out.println(b);
//                }
//            }
//        }
//        System.out.println("Q: "+Q.size());
//        return Q;
////        for (Map.Entry<Integer, Turmas> i : proposta.getTurmas().entrySet()) {
////            boolean b = Q.add(i.getValue());
////        }
//
//        
//
//    }
//    public void penalizarSubconjunto(PriorityQueue<Turmas> Q, Proposta proposta){
//        
//        Professor p;
//
//        int chMax = 0, chMin = 0;
//        
//        //ideia Beligante!
//        //pegar Ch max do profº que submeteu a proposta (turmas sobrando)
//        // enquanto ch min for respeitada, remover o menor da lista
//        //remover da lista de proposta(list[Turmas])
//        p = this.getProfessores().get(proposta.getIdProfessor());
//        chMax = p.gethMax();
//        chMin = p.gethMin();
//        System.out.println("chMinP: " + chMax);
//
//        //CH Total da Proposta - CH individual da Turma
//        //chMax é a carga horária máxima permitida
//        while ((proposta.getChTotal() > chMax)) {
////             && (proposta.getChTotal() > chMin)
//            Turmas t = Q.peek();
//
////            System.out.println("\n nome:" + t.getNome());
////            System.out.println("\t chTur: " + t.getCh_turma());
////            System.out.println("\t chProp: " + proposta.getChTotal());
////            System.out.println("\t vlP: " + proposta.getValor());
////            System.out.println("\t vlIndP: " + proposta.getValorIndividual());
//
//            proposta.getTurmas().remove(t.getId());
//            proposta.setChTotal(proposta.getChTotal() - t.getCh_turma());
//            proposta.setValor((proposta.getValor() - (proposta.getValor() * 10) / 100));
//            proposta.setValorIndividual(proposta.getValor() / (proposta.getTurmas().size()));
//
////            System.out.println("\n");
////            System.out.println("\t chProp remove: " + proposta.getChTotal());
////            System.out.println("\t vlProp remove: " + proposta.getValor());
////            System.out.println("\t vlIndP remove: " + proposta.getValorIndividual());
////
//            System.out.println("\n\n\nQsize " + proposta.getTurmas().size());
//
//            t = Q.remove();
//        }
//    }
