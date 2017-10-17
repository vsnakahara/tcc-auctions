package auctions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import utils.Util;

/**
 *
 * @author vanessa
 */
public class Estrutura {

    //List para todas as turmas -> T conjunto de todas as turmas a serem distribuídos
    private List<Turmas> turmas = new ArrayList<>();
    //List para todos os professores -> P é o conjunto de todos os professores a serem alocados
    private HashMap<Integer, Professor> professores = new HashMap<>();
    //list de Propostas Submetidas -> contém S turmas de interesse de um professor Pi.
    private List<Proposta> propostas = new ArrayList<>();

    private Set<Turmas> interseccaoPropostas = new HashSet<>();

    int[][] matriz = null;

    public void toPrint() {
        for (Proposta p : this.getPropostas()) {
            System.out.format("Prof id: %d | VL: %.2f | Vli: %.2f | ch: %d \n",
                    p.getIdProfessor(), p.getValor(), p.getValorIndividual(), p.getChTotal());
        }

    }

    public void preencherMatriz(Proposta proposta) {
        //errado 
        
        System.out.println(" \t turmas: "+this.getTurmas().size());
        System.out.println(" \t proposta: "+this.getPropostas().size());
        System.out.println(" \t list Turmas: "+this.getPropostas().get(0).getTurmas().size());
        System.out.println(" \t list Turmas2: "+this.getPropostas().get(1).getTurmas().size());
        matriz = new int[this.getTurmas().size()][this.getPropostas().size()];
        
        for (int i = 0; i < this.getTurmas().size()-1; i++) {
            for (int j = 0; j < proposta.getTurmas().size()-1; j++) {
                if (this.getTurmas().get(i).getId() == proposta.getTurmas().get(j).getId()) {
                    this.matriz[i][j] = 1;
                } else {
                    this.matriz[i][j] = 0;
                }
            }
        }
        matrizToString(proposta, matriz);
    }

    
    public void matrizToString(Proposta proposta, int matriz[][]) {
        String retStr = "";
        for (int i = 0; i < this.getTurmas().size()-1; i++) {
            for (int j = 0; j < proposta.getTurmas().size()-1; j++) {

                retStr += Integer.toString(matriz[i][j]);
                retStr += " ";
            }
        }
        System.out.println(retStr.trim());

    }

//    public void toPrinTurmas(List<Turmas> t){
//        for (Turmas turma : t) {
//            System.out.format("Prof id: %d | VL: %.2f | Vli: %.2f | ch: %d \n", 
//                    p.getIdProfessor(), p.getValor(), p.getValorIndividual(), p.getChTotal());
//        }
//    
//    }
    public void interseccaoListas(Estrutura e) {

        for (int i = 0; i < e.getPropostas().size() - 1; i++) {
            for (int j = 1; j < e.getPropostas().size(); j++) {

                if (i != j) {
//                    interseccaoTotal(e.getPropostas().get(i).getTurmas(), 
//                                                e.getPropostas().get(j).getTurmas());

                    this.getInterseccaoPropostas().addAll(Util.interseccao(e.getPropostas().get(i).getTurmas(),
                            e.getPropostas().get(j).getTurmas()));

                }
            }
        }

//        System.out.println("\ntam nova lista: " + this.getInterseccaoPropostas().size() + "\n");
    }

    public void balancearCargaHorariaProf(Estrutura e) {
        for (int i = 0; i < this.getPropostas().size() - 1; i++) {

            //diminuir o máximo possível CH do subconjunto, de cada professor
//            calcularCH(proposta);
//            System.out.println("******************************************************************");
            dividirEmSubconjuntos(this.getPropostas().get(i));
            e.toPrint();
        }

    }

    public void calcularCH(Proposta proposta) {
        //priority queue
        PriorityQueue<Turmas> Q = new PriorityQueue<>();
        Turmas t;
        Professor p;

        int chMax = 0, chMin = 0;

        for (int i = 0; i < proposta.getTurmas().size(); i++) {
            boolean b = Q.add(proposta.getTurmas().get(i));
        }

        //ideia Beligante!
        //pegar Ch max do profº que submeteu a proposta (turmas sobrando)
        // enquanto ch min for respeitada, remover o menor da lista
        //remover da lista de proposta(list[Turmas])
        p = this.getProfessores().get(proposta.getIdProfessor());
        chMax = p.gethMax();
        chMin = p.gethMin();
        System.out.println("chMinP: " + chMax);

        //CH Total da Proposta - CH individual da Turma
        //chMax é a carga horária máxima permitida
        while ((proposta.getChTotal() > chMax)) {
//             && (proposta.getChTotal() > chMin)
            t = Q.peek();

            System.out.println("\n nome:" + t.getNome());
            System.out.println("\t chT: " + t.getCh_turma());
            System.out.println("\t chP: " + proposta.getChTotal());
            System.out.println("\t vlP: " + proposta.getValor());
            System.out.println("\t vlIndP: " + proposta.getValorIndividual());

            proposta.getTurmas().remove(t);
            proposta.setChTotal(proposta.getChTotal() - t.getCh_turma());
            proposta.setValor((proposta.getValor() - (proposta.getValor() * 10) / 100));
            proposta.setValorIndividual(proposta.getValor() / (proposta.getTurmas().size()));

            System.out.println("\n");
            System.out.println("\t chP remove: " + proposta.getChTotal());
            System.out.println("\t vlP remove: " + proposta.getValor());
            System.out.println("\t vlIndP remove: " + proposta.getValorIndividual());

            System.out.println("\n\n\nQsize " + proposta.getTurmas().size());

            t = Q.remove();
        }

    }

    public void dividirEmSubconjuntos(Proposta proposta) {
        //pegar a Set<turmas> da intersecao
        interseccaoListas(this);
        Professor p = this.getProfessores().get(proposta.getIdProfessor());

//        System.out.println("\nList size: "+proposta.getTurmas().size());
//        System.out.println("\nSet size: "+this.getInterseccaoPropostas().size());
        //percorrer listas
        for (Turmas turmaProposta : proposta.getTurmas()) {
//            System.out.println("\nentrei");

            for (Turmas t : this.getInterseccaoPropostas()) {

//                System.out.println("\nentrei2");
//                System.out.println("id:" +t.getId());
//                System.out.println("pid:" +turmaProposta.getId());
                if (turmaProposta.getId() == t.getId()) {
                    System.out.println("\nentrei3");
                    //se estiver na lista é removido da listaa
                    //adicionar como uma nova nova proposta
                    //setar o valor individual da turma, para cada professor. 

                    List<Turmas> l = new ArrayList<>();
                    l.add(turmaProposta);

                    this.getPropostas().add(new Proposta(p.getId(), proposta.getValorIndividual(), l));

                    System.out.println("\nList size: " + this.getPropostas().size());
                    System.out.println("\nTurmast size: " + proposta.getTurmas().size());

                    proposta.getTurmas().remove(turmaProposta);

                }

            }
//            
        }

        System.out.println("\nList size: " + this.getPropostas().size());

    }

    public void escreverArquivo() throws IOException {
        String path = "/home/vanessa/Documentos/tcc-auctions/teste.lp";

        File file = new File(path);
        long begin = System.currentTimeMillis();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            writer.write("maximize obj: ");
            for (Proposta p : this.getPropostas()) {
                writer.write(p.getValor() + " P" + p.getIdProfessor() + "S" + " + ");

            }
//            writer.write("Arquivo gravado em : " + new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date()));
            writer.newLine();
            writer.newLine();
            writer.newLine();
            writer.write("Caminho da gravação: " + path);
            writer.newLine();
            writer.newLine();
            writer.newLine();
            long end = System.currentTimeMillis();
            writer.write("Tempo de gravação: " + (end - begin) + "ms.");
            //Criando o conteúdo do arquivo
            writer.flush();
            //Fechando conexão e escrita do arquivo.
        }
        System.out.println("Arquivo gravado em: " + path);

    }

    public List<Turmas> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turmas> turmas) {
        this.turmas = turmas;
    }

    public HashMap<Integer, Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(HashMap<Integer, Professor> professores) {
        this.professores = professores;
    }

    public List<Proposta> getPropostas() {
        return propostas;
    }

    public void setPropostas(List<Proposta> propostas) {
        this.propostas = propostas;
    }

    public Set<Turmas> getInterseccaoPropostas() {
        return interseccaoPropostas;
    }

    public void setInterseccaoPropostas(Set<Turmas> interseccaoPropostas) {
        this.interseccaoPropostas = interseccaoPropostas;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

}

/*
    - valores significativos para valoração de itens 5, 10, 15 (Exemplo), e qual o seu grau de importância
    - o que significa os pesos negativos para as turmas que não foram escolhidas e como obtê-las
    - o que ocorre quando duas propostas do mesmo professor possui concorrência de itens 
        -- ex: vp1 = ({t1, t2}, 5) e vp2 = ({t2, t3}, 7)
    - utilizar matriz turmas-propostas, para descobrir a intersecção    

    matriz[1][100]

*/




