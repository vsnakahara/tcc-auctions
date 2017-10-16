package auctions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
    private List<Professor> professores = new ArrayList<>();
    //list de Propostas Submetidas -> contém S turmas de interesse de um professor Pi.
    private List<Proposta> propostas = new ArrayList<>();

    private Set<Turmas> interseccaoPropostas = new HashSet<>();
    
    public void toPrint(){
        for (Proposta p : this.getPropostas()) {
            System.out.format("Prof id: %d | VL: %.2f | Vli: %.2f | ch: %d \n", 
                    p.getIdProfessor(), p.getValor(), p.getValorIndividual(), p.getChTotal());
        }
    
    }
    
    public void interseccaoListas(Estrutura e) {

        for (int i = 0; i < e.getPropostas().size() - 1; i++) {
            for (int j = 1; j < e.getPropostas().size(); j++) {

                if(i != j){
//                    interseccaoTotal(e.getPropostas().get(i).getTurmas(), 
//                                                e.getPropostas().get(j).getTurmas());
                    
                    this.getInterseccaoPropostas().addAll(Util.interseccao(e.getPropostas().get(i).getTurmas(), 
                                                e.getPropostas().get(j).getTurmas()));
                    
                }
            }
        }

        System.out.println("\ntam nova lista: " + this.getInterseccaoPropostas().size()+"\n");

    }
    
    public void balancearCargaHorariaProf(Estrutura e){
        for (Proposta proposta : e.getPropostas()) {
            //diminuir o máximo possível CH do subconjunto, de cada professor
            calcularCH(proposta);          
            
        }
        
        
    }
    
    public void calcularCH(Proposta proposta){
        //priority 
        PriorityQueue<Turmas> Q = new PriorityQueue<>();
        
        for(Turmas turma : proposta.getTurmas()){
            Q.add(turma);
            //ideia Beligante!
            //pegar Ch min do profº que submeteu a proposta
            // enquanto ch min for respeitada, remover o menor da lista
            //remover da lista de proposta(list[Turmas])
            
            
        }
        
        
            
        
    }
    
    
    public void dividirEmSubconjuntos(Proposta proposta){
        //pegar a Set<turmas> da intersecao
        //percorrer listas
        //se estiver na lista é removido da listaa
        //adicionar como uma nova nova proposta
        //setar o valor individual da turma, para cada professor. 
    }
    
    
    
    
    
    
    
    
    
    
    public void escreverArquivo() throws IOException{
        String path = "/home/vanessa/Documentos/tcc-auctions/teste.lp";
	
        File file = new File(path);
        long begin = System.currentTimeMillis();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            
            writer.write("maximize obj: ");
            for (Proposta p : this.getPropostas()) {
                writer.write(p.getValor()+" P"+p.getIdProfessor()+"S"+" + ");
                
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

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
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

    
    
}
