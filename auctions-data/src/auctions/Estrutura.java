package auctions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

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

    //matriz de ocorrências
    int[][] matriz = null;

    public void toPrint() {
        for (Proposta p : this.getPropostas()) {
            System.out.format("Prof id: %d | VL: %.2f | Vli: %.2f | ch: %d | sizeTurma: %d | Turmas: %s\n",
                    p.getIdProfessor(), p.getValor(), p.getValorIndividual(), p.getChTotal(),
                    p.getTurmas().size(), p.showItens(p.getTurmas()));
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

                for (Map.Entry<Integer, Turmas> t : p.get(i).getTurmas().entrySet()) {

                    if ((t != null) && t.getKey() == this.getTurmas().get(j).getId()) {
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

    public void balancearCargaHorariaProf(Estrutura e) {

        preencherMatriz(e.getPropostas());
        //diminuir o máximo possível CH do subconjunto, de cada professor
        for (Proposta p : e.getPropostas()) {
            penalizar(p);
        }

        System.out.println("******************************************************************");

        ocorrencias();
        preencherMatriz(e.getPropostas());
        
        for (Proposta p : e.getPropostas()) {
            penalizar(p);
        }
        preencherMatriz(e.getPropostas());
        System.out.println("******************************************************************");
        ocorrenciaMesmoProfessor();
        preencherMatriz(e.getPropostas());
        
        
    }

    public void ocorrencias() {
        
            int lastLine = this.getPropostas().size();
            //matriz = new int[this.getPropostas().size() + 1][this.getTurmas().size()];
            
            
            for (int i = 0; i < lastLine; i++) {
                for (int j = 0; j < this.getTurmas().size(); j++) {
                    if (this.matriz[i][j] == 1 && this.matriz[lastLine][j] > 1) {
                        //caso em que houve concorrência pela turma j                        
//                        System.out.println("( = 1 )"+ " i: "+ i + " j: "+j);
                        calcularItemConcorrentes(i, j);
                        
                        

                    }
                    if (this.matriz[lastLine][j] == 0) {
                        //caso em que a turma j, não obteve proposta 

    //                        System.out.println("( = 0 )"+ " i: "+ i + " j: "+j);
                        calcularItemSemProposta(j);

                    }
                }
            }
            
            
            
    }

    public void penalizar(Proposta proposta) {
        int lastLine = this.getPropostas().size();
        int num_turmas = 0;
        if(proposta.getChTotal() > 14){
            
            
            for (Map.Entry<Integer, Turmas> turma : proposta.getTurmas().entrySet()) {
                for (int j = 0; j < this.getTurmas().size()-1; j++) {
                    if (turma.getKey() == this.getTurmas().get(j).getId()
                            && this.matriz[lastLine][j] == 1) {
                        num_turmas++;
                    }
                }
            }
            if(num_turmas == proposta.getTurmas().size()-1){
                System.out.println("deu");
                calcularCH(proposta);
            }
        }
        
        
    }

    public void calcularItemSemProposta(int id_turma) {
        this.getTurmas().get(id_turma).setValorEstimado((float) -(15 * 10) / 100);

//        System.out.println("Id: "+this.getTurmas().get(id_turma).getId());
//        System.out.println("Novo valor: "+this.getTurmas().get(id_turma).getValorEstimado());
    }

    public void calcularItemConcorrentes(int id_proposta, int id_turma) {
        try {

            Proposta p = this.getPropostas().get(id_proposta);
            int indice = 0;

            Turmas turma = this.getTurmas().get(id_turma);
            if (p.getTurmas().size() > 1) {
                for (Map.Entry<Integer, Turmas> i : p.getTurmas().entrySet()) {

                    if (i.getKey() == turma.getId()) {

                        Turmas nova = p.getTurmas().get(i.getKey());

                        indice = i.getKey();

                        HashMap<Integer, Turmas> l = new HashMap<>();
                        l.put(1, nova);

                        this.getPropostas().add(new Proposta(p.getIdProfessor(),
                                p.getValorIndividual(), l));

                        this.getPropostas().get(id_proposta).setChTotal(p.getChTotal() - nova.getCh_turma());
                        this.getPropostas().get(id_proposta).setValor((p.getValor() - (this.getPropostas().get(id_proposta).getValor() * 10) / 100));

                    }
                }
            }

            p.getTurmas().remove(indice);
            this.getPropostas().get(id_proposta).setValorIndividual(p.getValor()
                    / (this.getPropostas().get(id_proposta).getTurmas().size()));

        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }

    public void calcularCH(Proposta proposta) {
        //priority queue
        PriorityQueue<Turmas> Q = new PriorityQueue<>();
        Turmas t = null;
        Professor p;

        int chMax = 0, chMin = 0;

        for (Map.Entry<Integer, Turmas> turma : proposta.getTurmas().entrySet()) {
            boolean b = Q.add(turma.getValue());
        }

        //ideia Beligante!
        //pegar Ch max do profº que submeteu a proposta (turmas sobrando)
        // enquanto ch min for respeitada, remover o menor da lista
        //remover da lista de proposta(list[Turmas])
        p = this.getProfessores().get(proposta.getIdProfessor());
        chMax = p.gethMax();
        chMin = p.gethMin();
//        System.out.println("chMinP: " + chMax);

        //CH Total da Proposta - CH individual da Turma
        //chMax é a carga horária máxima permitida
        while ((proposta.getChTotal() > chMax)) {
            
//               && (proposta.getChTotal() > chMin)
            t = Q.peek();
            proposta.getTurmas().remove(t.getId());
            
            proposta.setChTotal(proposta.getChTotal() - t.getCh_turma());
            proposta.setValor((proposta.getValor() - (proposta.getValor() * 10) / 100));
            proposta.setValorIndividual(proposta.getValor() / (proposta.getTurmas().size()));

            
            t = Q.remove();
            
            for(int i = 0; i < this.getTurmas().size()-1; i++){
                if(t != null && t.getId() == this.getTurmas().get(i).getId()){
                    System.out.println("id remove: "+t.getId());
                    this.getTurmas().get(i).setValorEstimado((float) -(15 * 10) / 100);
                }
            }
            
        }
        
        
        preencherMatriz(this.getPropostas());

    }

    public void ocorrenciaMesmoProfessor() {
        int lastLine = this.getPropostas().size();
        
        
        for (Proposta p : this.getPropostas()) {
            for (Map.Entry<Integer, Professor> prof : this.getProfessores().entrySet()) {
                for (int j = 0; j < this.getTurmas().size(); j++) {
                    if(this.matriz[lastLine][j] > 1
                            && prof.getKey() == p.getIdProfessor()){
                        
                        if (p.getTurmas().containsKey(this.getTurmas().get(j).getId())) {
                            System.out.println("novos "+p.showItens(p.getTurmas()));
                        }
                    
                    }
                }
            }
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
                    sb.append(t.getValorEstimado() + " P" + prof.getKey() + "T" + t.getId() + " ");
                }
            }

        }

        int ind = sb.toString().lastIndexOf("+ ");

        if (ind >= 0) {
            sb = new StringBuilder(sb).replace(ind, ind + 1, "");
        }
        return sb.append(";").toString();

    }

    public String printRestricaoTurmasAlocadas() {
        StringBuilder sb = new StringBuilder();
        boolean temProposta = false;

        for (Turmas t : this.getTurmas()) {
            for (Proposta p : this.getPropostas()) {

                if (p.getTurmas().containsValue(t)) {
                    sb.append("P" + p.getIdProfessor()
                            + p.showItens(p.getTurmas()) + " + ");
                    temProposta = true;
                }

            }
            if (temProposta) {
                int ind = sb.toString().lastIndexOf("+ ");
                if (ind >= 0) {
                    sb = new StringBuilder(sb).replace(ind, ind + 1, "");
                }
                sb.append("= 1;\n");
            }
            temProposta = false;
        }

        for (Turmas t : this.getTurmas()) {
            if (t.getValorEstimado() != 0.00) {
                for (Map.Entry<Integer, Professor> prof : this.getProfessores().entrySet()) {
                    sb.append("P" + prof.getKey() + "T" + t.getId() + " + ");
                    temProposta = true;
                }
            }
            if (temProposta) {
                int ind = sb.toString().lastIndexOf("+ ");
                if (ind >= 0) {
                    sb = new StringBuilder(sb).replace(ind, ind + 1, "");
                }
                sb.append("= 1;\n");
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
            for (Turmas t : this.getTurmas()) {
                if (t.getValorEstimado() != 0.00) {
                    sb.append(" P" + prof.getKey() + "T" + t.getId() + " + ");
                }
            }
            if (temProposta) {
                int ind = sb.toString().lastIndexOf("+ ");
                if (ind >= 0) {
                    sb = new StringBuilder(sb).replace(ind, ind + 1, "");
                }
                sb.append(">= 1;\n");
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
            for (Turmas t : this.getTurmas()) {
                if (t.getValorEstimado() != 0.00) {
                    sb.append(t.getCh_turma() + " P" + prof.getKey() + "T" + t.getId() + " + ");
                }
                temProposta = true;
            }

            if (temProposta) {
                int ind = sb.toString().lastIndexOf("+ ");
                if (ind >= 0) {
                    sb = new StringBuilder(sb).replace(ind, ind + 1, "");
                }
                sb.append(" > " + prof.getValue().gethMin() + ";\n");
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
            for (Turmas t : this.getTurmas()) {
                if (t.getValorEstimado() != 0.00) {
                    sb.append(t.getCh_turma() + " P" + prof.getKey() + "T" + t.getId() + " + ");
                }
                temProposta = true;
            }

            if (temProposta) {
                int ind = sb.toString().lastIndexOf("+ ");
                if (ind >= 0) {
                    sb = new StringBuilder(sb).replace(ind, ind + 1, "");
                }
                sb.append(" <= " + prof.getValue().gethMax() + ";\n");
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

            for (Turmas t : this.getTurmas()) {
                if (t.getValorEstimado() != 0.00) {
                    sb.append(" P" + prof.getKey() + "T" + t.getId() + " ");
                }
            }
        }
        return sb.toString();
    }

    public int gerarValor() {
        List<Integer> possiveis = new ArrayList<Integer>();
        possiveis.add(5); // baixa preferencia
        possiveis.add(10); // media preferencia
        possiveis.add(15); // alta preferencia
        
        int indice = (int) (Math.random() * possiveis.size());
        System.out.println(possiveis.get(indice));
        
        return possiveis.get(indice);      

    }
    
    public HashMap<Integer, Turmas> gerarHashTurmas(int num_turmas) {
        int indice = 0;
        
        HashMap<Integer, Turmas> s = new HashMap<>();
        
        while(s.size() < num_turmas){
            indice = (int) (Math.random() * this.getTurmas().size());
            System.out.println(this.getTurmas().get(indice).getId());
            s.put(this.getTurmas().get(indice).getId(), this.getTurmas().get(indice));
            
        }
                    
        System.out.println("size S:"+ s.size());
       
        return s;

    }
    
    public void gerarNumeroPropostas(Estrutura e, int id_professor) {
        int c = 0;
        //Random gerador = new Random();
        int randomNum = 1 + (int)(Math.random() * (5 - 1));
        int randomNumTurmas = 1 + (int)(Math.random() * (5 - 1));
        System.out.println("\n\nnumber:" + randomNum);
        
        while(c < randomNum){
            HashMap<Integer, Turmas> s = new HashMap<>();
            s = e.gerarHashTurmas(randomNumTurmas); 
            
            e.getPropostas().add(new Proposta(id_professor, gerarValor(), s));
            c++;
        }
        
        
        

    }

    public void escreverArquivo() throws IOException {
        String path = "/home/vanessa/Documentos/tcc-auctions/teste13.lp";

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
            writer.write("\n" + printVarBinary().trim() + ";\n");
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
        System.out.println("\n\n\n\nArquivo gravado em: " + path);

    }
    
    

    //getters e setters
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

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

}