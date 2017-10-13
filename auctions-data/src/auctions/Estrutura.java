package auctions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vanessa
 */
public class Estrutura {
    
    //List para todas as turmas -> T conjunto de todas as turmas a serem distribuídos
    private List<Turmas> turmas = new ArrayList<Turmas>();
    //List para todos os professores -> P é o conjunto de todos os professores a serem alocados
    private List<Professor> professores = new ArrayList<Professor>();
    //list de Propostas Submetidas -> contém S turmas de interesse de um professor Pi.
    private List<Proposta> propostas = new ArrayList<Proposta>();

    
//    public void estimarValorPropostas(){
//        for (Proposta p : this.getPropostas()) {
//            p.setValorIndividual(p.getValor() / p.getTurmas().size());
//            System.out.println("P"+p.getIdProfessor() + ", valor Individual: "+p.getValorIndividual());
//        }
//    
//    }
    
    public void toPrint(){
        for (Proposta p : this.getPropostas()) {
            System.out.format("Prof id: %d | VL: %.2f | Vli: %.2f | ch: %d \n", 
                    p.getIdProfessor(), p.getValor(), p.getValorIndividual(), p.getChTotal());
        }
    
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
    
    
}
