package auctions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
            System.out.format("Prof id: %d | VL: %.2f | Vli: %.2f | ch: %d | sizeTurma: %d\n",
                    p.getIdProfessor(), p.getValor(), p.getValorIndividual(), p.getChTotal(), p.getTurmas().size());
        }

    }

    public void preencherMatriz(List<Proposta> p) {
        //matriz, com a ocorrência de turmas em cada proposta.
        // última linha possui a soma de ocorrências
        matriz = new int[this.getPropostas().size() + 1][this.getTurmas().size()];

        //a matriz[numPropostas][totalDisciplinas]
        int lastLine = p.size();
        for (int i = 0; i < p.size(); i++) {
            for (int j = 0; j < this.getTurmas().size(); j++) {
                this.matriz[i][j] = 0;

                for (Turmas t : p.get(i).getTurmas()) {

                    if ((t != null) && t.getId() == this.getTurmas().get(j).getId()) {
                        this.matriz[i][j] = 1;
                        this.matriz[lastLine][j] = matriz[p.size()][j] + 1;
                    }

                }
            }
        }
        matrizToString(matriz);
    }

    public void matrizToString(int matriz[][]) {
        String retStr = "";
        for (int i = 0; i < this.getPropostas().size() + 1; i++) {
            for (int j = 0; j < this.getTurmas().size(); j++) {
                retStr += Integer.toString(matriz[i][j]);
                retStr += " ";

            }
        }
        System.out.println(retStr.trim());

    }

    public void limparListaTurmas() {
        for (Proposta p : this.getPropostas()) {
            for (int j = 0; j < p.getTurmas().size() - 1; j++) {
                if (p.getTurmas().get(j) == null) {
                    p.getTurmas().remove(j);

                }

            }
        }

    }

    public void balancearCargaHorariaProf(Estrutura e) {
        for (int i = 0; i < this.getPropostas().size() - 1; i++) {

            //diminuir o máximo possível CH do subconjunto, de cada professor
//            calcularCH(proposta);
//            System.out.println("******************************************************************");
            preencherMatriz(e.getPropostas());
            ocorrencias();
            limparListaTurmas();
            //preencherMatriz(e.getPropostas());
            e.toPrint();
            //preencherMatriz(e.getPropostas());
        }

    }

    public void ocorrencias() {
        try {
            int lastLine = this.getPropostas().size();

            for (int i = 0; i < this.getPropostas().size(); i++) {

                for (int j = 0; j < this.getTurmas().size(); j++) {
                    System.out.println("\n\nj:" + j);
                    if (this.matriz[i][j] == 1 && this.matriz[lastLine][j] > 1) {
                        //caso em que houve concorrência pela turma j
                        calcularItemConcorrentes(i, j);

                    }
                    if (this.matriz[lastLine][j] == 0) {
                        //caso em que a turma j, não obteve proposta 
                        calcularItemSemProposta(j);

                    }

                }
            }
        } catch (Exception e) {
        }
    }

    public void calcularItemSemProposta(int id_turma) {
        this.getTurmas().get(id_turma).setValorEstimado((float) -1.00);
//        System.out.println("Id: "+this.getTurmas().get(id_turma).getId());
//        System.out.println("Novo valor: "+this.getTurmas().get(id_turma).getValorEstimado());

    }

    public void calcularItemConcorrentes(int id_proposta, int id_turma) {
        try {
            Turmas turma = this.getTurmas().get(id_turma);
            System.out.println("\t\t\tID_TURMA " + id_turma);
            System.out.println("\t\t turma size: " + this.getPropostas().get(id_proposta).getTurmas().size());

            for (int i = 0; i < this.getPropostas().get(id_proposta).getTurmas().size() - 1; i++) {
                if (this.getPropostas().get(id_proposta).getTurmas().get(i).getId() == turma.getId()) {
                    System.out.println("\t\t\t\tentrei3");

                    Turmas nova = this.getPropostas().get(id_proposta).getTurmas().get(i);
                    this.getPropostas().get(id_proposta).getTurmas().set(i, null);

                    List<Turmas> l = new ArrayList<>();
                    l.add(nova);

                    this.getPropostas().add(new Proposta(this.getPropostas().get(id_proposta).getIdProfessor(),
                            this.getPropostas().get(id_proposta).getValorIndividual(), l));
                    this.getPropostas().get(id_proposta).setChTotal(this.getPropostas().get(id_proposta).getChTotal() - nova.getCh_turma());
                    this.getPropostas().get(id_proposta).setValor((this.getPropostas().get(id_proposta).getValor() - (this.getPropostas().get(id_proposta).getValor() * 10) / 100));
                    this.getPropostas().get(id_proposta).setValorIndividual(this.getPropostas().get(id_proposta).getValor() / (this.getPropostas().get(id_proposta).getTurmas().size()));

                }
            }
        } catch (Exception e) {
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

    public String printFuncaoObjetivo() {
        StringBuilder sb = new StringBuilder();

        for (Proposta p : this.getPropostas()) {
            sb.append(p.getValor() + " P" + p.getIdProfessor() + p.showItens(p.getTurmas()) + " + ");
        }

        for (Turmas t : this.getTurmas()) {
            if (t.getValorEstimado() != 0.00) {
                for (Map.Entry<Integer, Professor> prof : this.getProfessores().entrySet()) {
                    sb.append(" - " + t.getValorEstimado() + " P" + prof.getKey() + "T" + t.getId());
                }
            }

        }

        int ind = sb.toString().lastIndexOf("+ ");

        if (ind >= 0) {
            sb = new StringBuilder(sb).replace(ind, ind + 1, "");
        }
        return sb.toString();

    }

    public String printRestricaoTurmasAlocadas() {
        StringBuilder sb = new StringBuilder();
        boolean temProposta = false;

        for (Turmas t : this.getTurmas()) {
            for (Proposta p : this.getPropostas()) {
                if (p.getTurmas().contains(t)) {
                    sb.append(" P" + p.getIdProfessor()
                            + p.showItens(p.getTurmas()) + " + ");
                    temProposta = true;
                } 

            }
            if (temProposta) {
                int ind = sb.toString().lastIndexOf("+ ");
                if (ind >= 0) {
                    sb = new StringBuilder(sb).replace(ind, ind + 1, "");
                }
                sb.append("= 1\n");
            }
            temProposta = false;
        }
        
        for (Turmas t : this.getTurmas()) {
            if (t.getValorEstimado() != 0.00) {
                for (Map.Entry<Integer, Professor> prof : this.getProfessores().entrySet()) {
                    sb.append(" P" + prof.getKey() + "T" + t.getId()+" + ");
                    temProposta = true;
                }
            }
            if (temProposta) {
                int ind = sb.toString().lastIndexOf("+ ");
                if (ind >= 0) {
                    sb = new StringBuilder(sb).replace(ind, ind + 1, "");
                }
                sb.append("= 1\n");
            }
            temProposta = false;

        }

        return sb.toString();
    }

    public String printRestricaoProfessorSubconjuntos() {
        StringBuilder sb = new StringBuilder();
        boolean temProposta = false;

        for (Map.Entry<Integer, Professor> prof : this.getProfessores().entrySet()) {
            for (Proposta p : this.getPropostas()) {
                if (prof.getKey() == p.getIdProfessor()) {
                    sb.append("P").append(prof.getKey()).append(p.showItens(p.getTurmas())).append(" + ");
                    temProposta = true;
                }
            }
            if (temProposta) {
                int ind = sb.toString().lastIndexOf("+ ");
                if (ind >= 0) {
                    sb = new StringBuilder(sb).replace(ind, ind + 1, "");
                }
                sb.append(">= 1\n");
            }
            temProposta = false;
        }

        return sb.toString();
    }

    public String printChMin() {
        StringBuilder sb = new StringBuilder();
        boolean temProposta = false;

        for (Map.Entry<Integer, Professor> prof : this.getProfessores().entrySet()) {
            for (Proposta p : this.getPropostas()) {
                if (prof.getKey() == p.getIdProfessor()) {
                    sb.append(p.getChTotal() + " P" + p.getIdProfessor() + p.showItens(p.getTurmas()) + " + ");
                    temProposta = true;
                }

            }
            if (temProposta) {
                int ind = sb.toString().lastIndexOf("+ ");
                if (ind >= 0) {
                    sb = new StringBuilder(sb).replace(ind, ind + 1, "");
                }
                sb.append(" > " + prof.getValue().gethMin() + "\n");
            }
            temProposta = false;
        }
        return sb.toString();

    }

    public String printChMax() {
        StringBuilder sb = new StringBuilder();
        boolean temProposta = false;

        for (Map.Entry<Integer, Professor> prof : this.getProfessores().entrySet()) {
            for (Proposta p : this.getPropostas()) {
                if (prof.getKey() == p.getIdProfessor()) {
                    sb.append(p.getChTotal() + " P" + p.getIdProfessor() + p.showItens(p.getTurmas()) + " + ");
                    temProposta = true;
                }

            }
            if (temProposta) {
                int ind = sb.toString().lastIndexOf("+ ");
                if (ind >= 0) {
                    sb = new StringBuilder(sb).replace(ind, ind + 1, "");
                }
                sb.append(" <= " + prof.getValue().gethMax() + "\n");
            }
            temProposta = false;
        }
        return sb.toString();

    }

    public String printVarBinary() {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, Professor> prof : this.getProfessores().entrySet()) {
            for (Proposta p : this.getPropostas()) {
                if (prof.getKey() == p.getIdProfessor()) {
                    sb.append(" P" + p.getIdProfessor() + p.showItens(p.getTurmas()) + " ");
                }

            }
        }
        return sb.toString();
    }

    public void escreverArquivo() throws IOException {
        String path = "/home/vanessa/Documentos/tcc-auctions/teste2.lp";

        File file = new File(path);
        long begin = System.currentTimeMillis();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {

            writer.write("Maximize \nobj: ");
            writer.write(printFuncaoObjetivo());

            writer.newLine();
            writer.newLine();
            writer.write("Subject to ");
            writer.newLine();
            writer.write("\n" + printRestricaoTurmasAlocadas());
            writer.newLine();

            writer.write("\n" + printRestricaoProfessorSubconjuntos());

            writer.newLine();
            writer.write("\n" + printChMin());
            writer.newLine();
            writer.write("\n" + printChMax());
            writer.newLine();
            writer.write("BINARY");
            writer.newLine();
            writer.write("\n" + printVarBinary());
            writer.newLine();
            writer.write("END");
            //Criando o conteúdo do arquivo
            writer.flush();
            //Fechando conexão e escrita do arquivo.

//            writer.write("Caminho da gravação: " + path);
//            writer.write("Arquivo gravado em : " + new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(new Date()));
//            long end = System.currentTimeMillis();
//            writer.write("Tempo de gravação: " + (end - begin) + "ms.");
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
