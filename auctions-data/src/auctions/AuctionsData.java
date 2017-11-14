package auctions;

import java.io.IOException;
import java.util.Map;

/**
 *
 * @author vanessa
 */
public class AuctionsData {

    public void popularCaso1() throws IOException {
        //semestre 1
        Turmas T0 = new Turmas(0, "TRABALHO DE GRADUACAO", 2, 1);
        Turmas T1 = new Turmas(1, "FUNDAMENTOS DA COMPUTACAO", 3, 1);
        Turmas T2 = new Turmas(2, "FUNDAMENTOS DA COMPUTACAO", 3, 1);
        Turmas T3 = new Turmas(3, "METODOS FORMAIS II", 4, 1);
        Turmas T4 = new Turmas(4, "ESTRUTURA DE DADOS", 4, 1);
        Turmas T5 = new Turmas(5, "FUNDAMENTOS DE TECNOL.DA INFORMACAO", 4, 1);
        Turmas T6 = new Turmas(6, "FUND. DE PESQUISA EM INFORMATICA", 4, 1);
        Turmas T7 = new Turmas(7, "FUND. DE PESQUISA EM INFORMATICA", 4, 1);
        Turmas T8 = new Turmas(8, "PROC.DE SOFTWARE E E. DE REQUISITOS", 4, 1);
        Turmas T9 = new Turmas(9, "PROC.DE SOFTWARE E E. DE REQUISITOS", 4, 1);
        Turmas T10 = new Turmas(10, "ARQ. E ORGANIZACAO DE COMPUTADORES", 4, 1);
        Turmas T11 = new Turmas(11, "ESTRUTURAS DE DADOS", 6, 1);
        Turmas T12 = new Turmas(12, "ESTRUTURAS DE DADOS", 6, 1);
        Turmas T13 = new Turmas(13, "PROJETO DE SISTEMAS DE SOFTWARE", 4, 1);
        Turmas T14 = new Turmas(14, "PROJETO DE SISTEMAS DE SOFTWARE", 4, 1);
        Turmas T15 = new Turmas(15, "ORGANIZACAO E RECUPERACAO DE DADOS", 4, 1);
        Turmas T16 = new Turmas(16, "PROGRAMACAO DE SISTEMAS WEB", 4, 1);
        Turmas T17 = new Turmas(17, "ALGORITMOS EM GRAFOS", 4, 1);
        Turmas T18 = new Turmas(18, "ALGORITMOS EM GRAFOS", 4, 1);
        Turmas T19 = new Turmas(19, "PROGRAMACAO ORIENTADA A OBJETOS", 4, 1);
        
        //semestre 2
//        Turmas T0 = new Turmas(0, "TRABALHO DE GRADUACAO", 12, 2);
//        Turmas T1 = new Turmas(1, "FUNDAMENTOS DA COMPUTACAO", 3, 2);
//        Turmas T2 = new Turmas(2, "FUNDAMENTOS DA COMPUTACAO", 3, 2);
//        Turmas T3 = new Turmas(3, "FUNDAMENTOS DA COMPUTACAO", 4, 2);
//        Turmas T4 = new Turmas(4, "FUNDAMENTOS DA COMPUTACAO", 4, 2);
//        Turmas T5 = new Turmas(5, "AMBIENTES DE DESENV. DE SOFTWARE", 4, 2);
//        Turmas T6 = new Turmas(6, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
//        Turmas T7 = new Turmas(7, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
//        Turmas T8 = new Turmas(8, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
//        Turmas T9 = new Turmas(9, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
//        Turmas T10 = new Turmas(10, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
//        Turmas T11 = new Turmas(11, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
//        Turmas T12 = new Turmas(12, "ALGORITMOS E PROGRAM. DE COMPUT", 6, 2);
//        Turmas T13 = new Turmas(13, "ALGORITMOS E PROGRAM. DE COMPUT", 6, 2);
//        Turmas T14 = new Turmas(14, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
//        Turmas T15 = new Turmas(15, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
//        Turmas T16 = new Turmas(16, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
//        Turmas T17 = new Turmas(17, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
//        Turmas T18 = new Turmas(18, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
//        Turmas T19 = new Turmas(19, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
//        Turmas T20 = new Turmas(20, "CIRCUITOS DIGITAIS", 4, 2);
        

        Estrutura e = new Estrutura();
        e.getTurmas().clear();
        e.getTurmas().add(T0);
        e.getTurmas().add(T1);
        e.getTurmas().add(T2);

        e.getTurmas().add(T3);
        e.getTurmas().add(T4);
        e.getTurmas().add(T5);
        e.getTurmas().add(T6);
        e.getTurmas().add(T7);
        e.getTurmas().add(T8);
        e.getTurmas().add(T9);

        e.getTurmas().add(T10);
        e.getTurmas().add(T11);
        e.getTurmas().add(T12);
        e.getTurmas().add(T13);
        e.getTurmas().add(T14);
        e.getTurmas().add(T15);
        e.getTurmas().add(T16);
        e.getTurmas().add(T17);
        e.getTurmas().add(T18);
        e.getTurmas().add(T19);

        e.getPropostas().clear();
        e.getProfessores().clear();
        e.getProfessores().put(1, new Professor(1, "P1", 8, 20));
        e.getProfessores().put(2, new Professor(2, "P2", 8, 20));
        e.getProfessores().put(3, new Professor(3, "P3", 8, 20));
        e.getProfessores().put(4, new Professor(4, "P4", 8, 20));
        e.getProfessores().put(5, new Professor(5, "P5", 16, 20));

        System.out.println("******************************************************************");

        for (int i = 0; i < e.getTurmas().size() - 1; i++) {
            e.gettCopy().put(e.getTurmas().get(i).getId(), e.getTurmas().get(i));
        }

        int randomIndiceTurma = 1 + (int) (Math.random() * (19 - 1));
        System.out.println("sorteio: " + randomIndiceTurma);
        int casosConcorrentes = Math.round((5 * 25) / 100);
        System.out.println("percent "+casosConcorrentes);
        
        for (Map.Entry<Integer, Professor> prof : e.getProfessores().entrySet()) {
            e.gerarCaso1(e, prof.getKey(), randomIndiceTurma, casosConcorrentes+1);
        }

        e.toPrint();
        System.out.println("******************************************************************");
        e.balancearCargaHorariaProf(e);
        e.concorrenciaMesmoProfessor();
        System.out.println("******************************************************************");

        e.toPrint();

        e.escreverArquivo("1s");

        System.out.println("******************************************************************");
    }

    public void popularCaso2() throws IOException   {
        //1 semestre
//        Turmas T0 = new Turmas(0, "TRABALHO DE GRADUACAO", 2, 1);
//        Turmas T1 = new Turmas(1, "FUNDAMENTOS DA COMPUTACAO", 3, 1);
//        Turmas T2 = new Turmas(2, "FUNDAMENTOS DA COMPUTACAO", 3, 1);
//        Turmas T3 = new Turmas(3, "METODOS FORMAIS II", 4, 1);
//        Turmas T4 = new Turmas(4, "ESTRUTURA DE DADOS", 4, 1);
//        Turmas T5 = new Turmas(5, "FUNDAMENTOS DE TECNOL.DA INFORMACAO", 4, 1);
//        Turmas T6 = new Turmas(6, "FUND. DE PESQUISA EM INFORMATICA", 4, 1);
//        Turmas T7 = new Turmas(7, "FUND. DE PESQUISA EM INFORMATICA", 4, 1);
//        Turmas T8 = new Turmas(8, "PROC.DE SOFTWARE E E. DE REQUISITOS", 4, 1);
//        Turmas T9 = new Turmas(9, "PROC.DE SOFTWARE E E. DE REQUISITOS", 4, 1);
//        Turmas T10 = new Turmas(10, "ARQ. E ORGANIZACAO DE COMPUTADORES", 4, 1);
//        Turmas T11 = new Turmas(11, "ESTRUTURAS DE DADOS", 6, 1);
//        Turmas T12 = new Turmas(12, "ESTRUTURAS DE DADOS", 6, 1);
//        Turmas T13 = new Turmas(13, "PROJETO DE SISTEMAS DE SOFTWARE", 4, 1);
//        Turmas T14 = new Turmas(14, "PROJETO DE SISTEMAS DE SOFTWARE", 4, 1);
//        Turmas T15 = new Turmas(15, "ORGANIZACAO E RECUPERACAO DE DADOS", 4, 1);
//        Turmas T16 = new Turmas(16, "PROGRAMACAO DE SISTEMAS WEB", 4, 1);
//        Turmas T17 = new Turmas(17, "ALGORITMOS EM GRAFOS", 4, 1);
//        Turmas T18 = new Turmas(18, "ALGORITMOS EM GRAFOS", 4, 1);
//        Turmas T19 = new Turmas(19, "PROGRAMACAO ORIENTADA A OBJETOS", 4, 1);
//        Turmas T20 = new Turmas(20, "SISTEMAS OPERACIONAIS", 4, 1);
//        Turmas T21 = new Turmas(21, "SISTEMAS DIGITAIS", 4, 1);
//        Turmas T22 = new Turmas(22, "INFORMATICA E SOCIEDADE", 2, 1);
//        Turmas T23 = new Turmas(23, "MODELAGEM E OTIMIZACAO ALGORITMICA", 6, 1);
//        Turmas T24 = new Turmas(24, "PARADIGMA DE PROG. LOG. E FUNCIONAL", 4, 1);
//        Turmas T25 = new Turmas(25, "GERENCIAMENTO DE PROJETOS", 4, 1);
//        Turmas T26 = new Turmas(26, "METODOS FORMAIS", 4, 1);
//        Turmas T27 = new Turmas(27, "SISTEMAS DISTRIBUIDOS", 4, 1);
//        Turmas T28 = new Turmas(28, "INTELIGENCIA ARTIFICIAL", 6, 1);
//        Turmas T29 = new Turmas(29, "TRABALHO DE CONCLUSAO DE CURSO", 1, 1);
//        Turmas T30 = new Turmas(30, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
//        Turmas T31 = new Turmas(31, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
//        Turmas T32 = new Turmas(32, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
//        Turmas T33 = new Turmas(33, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
//        Turmas T34 = new Turmas(34, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
//        Turmas T35 = new Turmas(35, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
//        Turmas T36 = new Turmas(36, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
//        Turmas T37 = new Turmas(37, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
//        Turmas T38 = new Turmas(38, "FUNDAMENTOS DE ELETRONICA", 6, 1);
//        Turmas T39 = new Turmas(39, "FUNDAMENTOS DE ELETRONICA", 6, 1);
        
        //2 semestre
        
        Turmas T0 = new Turmas(0, "TRABALHO DE GRADUACAO", 12, 2);
        Turmas T1 = new Turmas(1, "FUNDAMENTOS DA COMPUTACAO", 3, 2);
        Turmas T2 = new Turmas(2, "FUNDAMENTOS DA COMPUTACAO", 3, 2);
        Turmas T3 = new Turmas(3, "FUNDAMENTOS DA COMPUTACAO", 4, 2);
        Turmas T4 = new Turmas(4, "FUNDAMENTOS DA COMPUTACAO", 4, 2);
        Turmas T5 = new Turmas(5, "AMBIENTES DE DESENV. DE SOFTWARE", 4, 2);
        Turmas T6 = new Turmas(6, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T7 = new Turmas(7, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T8 = new Turmas(8, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
        Turmas T9 = new Turmas(9, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
        Turmas T10 = new Turmas(10, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
        Turmas T11 = new Turmas(11, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
        Turmas T12 = new Turmas(12, "ALGORITMOS E PROGRAM. DE COMPUT", 6, 2);
        Turmas T13 = new Turmas(13, "ALGORITMOS E PROGRAM. DE COMPUT", 6, 2);
        Turmas T14 = new Turmas(14, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T15 = new Turmas(15, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T16 = new Turmas(16, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T17 = new Turmas(17, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T18 = new Turmas(18, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T19 = new Turmas(19, "FUNDAMENTOS DA COMPUTACAO", 2, 2);

        Turmas T20 = new Turmas(20, "CIRCUITOS DIGITAIS", 4, 2);
        Turmas T21 = new Turmas(21, "CIRCUITOS DIGITAIS", 4, 2);
        Turmas T22 = new Turmas(22, "CIRCUITOS DIGITAIS", 4, 2);
        Turmas T23 = new Turmas(23, "CIRCUITOS DIGITAIS", 4, 2);
        Turmas T24 = new Turmas(24, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T25 = new Turmas(25, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T26 = new Turmas(26, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T27 = new Turmas(27, "ANALISE DE SISTEMAS DE SOFTWARE", 4, 2);
        Turmas T28 = new Turmas(28, "ANALISE DE SISTEMAS DE SOFTWARE", 4, 2);
        Turmas T29 = new Turmas(29, "BANCO DE DADOS I", 4, 2);
        Turmas T30 = new Turmas(30, "INTERACAO SER-HUMANO COMPUTADOR", 4, 2);
        Turmas T31 = new Turmas(31, "PROJETO E ANALISE DE ALGORITMOS", 6, 2);
        Turmas T32 = new Turmas(32, "PROJETO E ANALISE DE ALGORITMOS", 6, 2);
        Turmas T33 = new Turmas(33, "PROJETO E ANALISE DE ALGORITMOS", 6, 2);
        Turmas T34 = new Turmas(34, "PARADIGMA DE PROG.IMP.E O.A OBJETOS", 4, 2);
        Turmas T35 = new Turmas(35, "COMPUTACAO GRAFICA", 4, 2);
        Turmas T36 = new Turmas(36, "PARADIGMA DE PROG.IMP.E O.A OBJETOS", 4, 2);
        Turmas T37 = new Turmas(37, "IMPLEMENTACAO DE SIST. DE SOFTWARE", 4, 2);
        Turmas T38 = new Turmas(38, "IMPLEMENTACAO DE SIST. DE SOFTWARE", 4, 2);
        Turmas T39 = new Turmas(39, "BANCO DE DADOS II", 4, 2);
        

        Estrutura e = new Estrutura();
        e.getTurmas().clear();
        e.getTurmas().add(T0);
        e.getTurmas().add(T1);
        e.getTurmas().add(T2);

        e.getTurmas().add(T3);
        e.getTurmas().add(T4);
        e.getTurmas().add(T5);
        e.getTurmas().add(T6);
        e.getTurmas().add(T7);
        e.getTurmas().add(T8);
        e.getTurmas().add(T9);

        e.getTurmas().add(T10);
        e.getTurmas().add(T11);
        e.getTurmas().add(T12);
        e.getTurmas().add(T13);
        e.getTurmas().add(T14);
        e.getTurmas().add(T15);
        e.getTurmas().add(T16);
        e.getTurmas().add(T17);
        e.getTurmas().add(T18);
        e.getTurmas().add(T19);
        e.getTurmas().add(T20);
        e.getTurmas().add(T21);
        e.getTurmas().add(T22);
        e.getTurmas().add(T23);
        e.getTurmas().add(T24);
        e.getTurmas().add(T25);
        e.getTurmas().add(T26);
        e.getTurmas().add(T27);
        e.getTurmas().add(T28);
        e.getTurmas().add(T29);

        e.getTurmas().add(T30);
        e.getTurmas().add(T31);
        e.getTurmas().add(T32);
        e.getTurmas().add(T33);
        e.getTurmas().add(T34);
        e.getTurmas().add(T35);
        e.getTurmas().add(T36);
        e.getTurmas().add(T37);
        e.getTurmas().add(T38);
        e.getTurmas().add(T39);

        
        e.getPropostas().clear();
        e.getProfessores().clear();
        e.getProfessores().put(1, new Professor(1, "P1", 8, 20));
        e.getProfessores().put(2, new Professor(2, "P2", 8, 20));
        e.getProfessores().put(3, new Professor(3, "P3", 8, 20));
        e.getProfessores().put(4, new Professor(4, "P4", 8, 20));
        e.getProfessores().put(5, new Professor(5, "P5", 16, 20));

        System.out.println("******************************************************************");

        for (int i = 0; i < e.getTurmas().size() - 1; i++) {
            e.gettCopy().put(e.getTurmas().get(i).getId(), e.getTurmas().get(i));
        }

        int randomIndiceTurma = 1 + (int) (Math.random() * (20 - 1));
        System.out.println("sorteio: " + randomIndiceTurma);
        int casosConcorrentes = Math.round((5 * 25) / 100);

        for (Map.Entry<Integer, Professor> prof : e.getProfessores().entrySet()) {
            e.gerarCaso1(e, prof.getKey(), randomIndiceTurma, casosConcorrentes);
        }

        e.toPrint();
        System.out.println("******************************************************************");
        e.balancearCargaHorariaProf(e);
        e.concorrenciaMesmoProfessor();
        System.out.println("******************************************************************");

        e.toPrint();

        e.escreverArquivo("2s");

        System.out.println("******************************************************************");
    }

    public void popularCaso3() throws IOException {
        //1 semestre
        
//        Turmas T0 = new Turmas(0, "TRABALHO DE GRADUACAO", 2, 1);
//        Turmas T1 = new Turmas(1, "FUNDAMENTOS DA COMPUTACAO", 3, 1);
//        Turmas T2 = new Turmas(2, "FUNDAMENTOS DA COMPUTACAO", 3, 1);
//        Turmas T3 = new Turmas(3, "METODOS FORMAIS II", 4, 1);
//        Turmas T4 = new Turmas(4, "ESTRUTURA DE DADOS", 4, 1);
//        Turmas T5 = new Turmas(5, "FUNDAMENTOS DE TECNOL.DA INFORMACAO", 4, 1);
//        Turmas T6 = new Turmas(6, "FUND. DE PESQUISA EM INFORMATICA", 4, 1);
//        Turmas T7 = new Turmas(7, "FUND. DE PESQUISA EM INFORMATICA", 4, 1);
//        Turmas T8 = new Turmas(8, "PROC.DE SOFTWARE E E. DE REQUISITOS", 4, 1);
//        Turmas T9 = new Turmas(9, "PROC.DE SOFTWARE E E. DE REQUISITOS", 4, 1);
//        Turmas T10 = new Turmas(10, "ARQ. E ORGANIZACAO DE COMPUTADORES", 4, 1);
//        Turmas T11 = new Turmas(11, "ESTRUTURAS DE DADOS", 6, 1);
//        Turmas T12 = new Turmas(12, "ESTRUTURAS DE DADOS", 6, 1);
//        Turmas T13 = new Turmas(13, "PROJETO DE SISTEMAS DE SOFTWARE", 4, 1);
//        Turmas T14 = new Turmas(14, "PROJETO DE SISTEMAS DE SOFTWARE", 4, 1);
//        Turmas T15 = new Turmas(15, "ORGANIZACAO E RECUPERACAO DE DADOS", 4, 1);
//        Turmas T16 = new Turmas(16, "PROGRAMACAO DE SISTEMAS WEB", 4, 1);
//        Turmas T17 = new Turmas(17, "ALGORITMOS EM GRAFOS", 4, 1);
//        Turmas T18 = new Turmas(18, "ALGORITMOS EM GRAFOS", 4, 1);
//        Turmas T19 = new Turmas(19, "PROGRAMACAO ORIENTADA A OBJETOS", 4, 1);
//        Turmas T20 = new Turmas(20, "SISTEMAS OPERACIONAIS", 4, 1);
//        Turmas T21 = new Turmas(21, "SISTEMAS DIGITAIS", 4, 1);
//        Turmas T22 = new Turmas(22, "INFORMATICA E SOCIEDADE", 2, 1);
//        Turmas T23 = new Turmas(23, "MODELAGEM E OTIMIZACAO ALGORITMICA", 6, 1);
//        Turmas T24 = new Turmas(24, "PARADIGMA DE PROG. LOG. E FUNCIONAL", 4, 1);
//        Turmas T25 = new Turmas(25, "GERENCIAMENTO DE PROJETOS", 4, 1);
//        Turmas T26 = new Turmas(26, "METODOS FORMAIS", 4, 1);
//        Turmas T27 = new Turmas(27, "SISTEMAS DISTRIBUIDOS", 4, 1);
//        Turmas T28 = new Turmas(28, "INTELIGENCIA ARTIFICIAL", 6, 1);
//        Turmas T29 = new Turmas(29, "TRABALHO DE CONCLUSAO DE CURSO", 1, 1);
//        Turmas T30 = new Turmas(30, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
//        Turmas T31 = new Turmas(31, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
//        Turmas T32 = new Turmas(32, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
//        Turmas T33 = new Turmas(33, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
//        Turmas T34 = new Turmas(34, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
//        Turmas T35 = new Turmas(35, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
//        Turmas T36 = new Turmas(36, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
//        Turmas T37 = new Turmas(37, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
//        Turmas T38 = new Turmas(38, "FUNDAMENTOS DE ELETRONICA", 6, 1);
//        Turmas T39 = new Turmas(39, "FUNDAMENTOS DE ELETRONICA", 6, 1);
//        Turmas T40 = new Turmas(40, "FUNDAMENTOS DE ELETRONICA", 6, 1);
//        Turmas T41 = new Turmas(41, "FUNDAMENTOS DE ELETRONICA", 6, 1);
//        Turmas T42 = new Turmas(42, "FUND. DE TECNOLOGIA DA INFORMACAO", 4, 1);
//        Turmas T43 = new Turmas(43, "FUND. DE PESQUISA EM INFORMATICA", 2, 1);
//        Turmas T44 = new Turmas(44, "CIRCUITOS DIGITAIS II", 4, 1);
//        Turmas T45 = new Turmas(45, "CIRCUITOS DIGITAIS II", 4, 1);
//        Turmas T46 = new Turmas(46, "LINGUAGENS FORMAIS E AUTOMATOS", 6, 1);
//        Turmas T47 = new Turmas(47, "ESTRUTURAS DE DADOS", 6, 1);
//        Turmas T48 = new Turmas(48, "ESTRUTURAS DE DADOS", 6, 1);
//        Turmas T49 = new Turmas(49, "PROC.DE SOFT.E ENG. DE REQUISITOS", 4, 1);
//        Turmas T50 = new Turmas(50, "PROG.PARA INT.DE HARDW. E SOFTWARE", 4, 1);
//        Turmas T51 = new Turmas(51, "ARQUIT.E ORGANIZ.DE COMPUTADORES II", 4, 1);
//        Turmas T52 = new Turmas(52, "COMPUTABILIDADE", 4, 1);
//        Turmas T53 = new Turmas(53, "ORGANIZACAO E RECUPERACAO DE DADOS", 4, 1);
//        Turmas T54 = new Turmas(54, "ALGORITMOS EM GRAFOS", 4, 1);
//        Turmas T55 = new Turmas(55, "PROJETO DE SISTEMAS DE SOFTWARE", 4, 1);
//        Turmas T56 = new Turmas(56, "COMPUTACAO GRAFICA", 4, 1);
//        Turmas T57 = new Turmas(57, "REDES DE COMPUTADORES", 4, 1);
//        Turmas T58 = new Turmas(58, "PROGRAMACAO CONCORRENTE", 4, 1);
//        Turmas T59 = new Turmas(59, "INTELIGENCIA ARTIFICIAL", 4, 1);
        
        //2 semestre
        Turmas T0 = new Turmas(0, "TRABALHO DE GRADUACAO", 12, 2);
        Turmas T1 = new Turmas(1, "FUNDAMENTOS DA COMPUTACAO", 3, 2);
        Turmas T2 = new Turmas(2, "FUNDAMENTOS DA COMPUTACAO", 3, 2);
        Turmas T3 = new Turmas(3, "FUNDAMENTOS DA COMPUTACAO", 4, 2);
        Turmas T4 = new Turmas(4, "FUNDAMENTOS DA COMPUTACAO", 4, 2);
        Turmas T5 = new Turmas(5, "AMBIENTES DE DESENV. DE SOFTWARE", 4, 2);
        Turmas T6 = new Turmas(6, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T7 = new Turmas(7, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T8 = new Turmas(8, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
        Turmas T9 = new Turmas(9, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
        Turmas T10 = new Turmas(10, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
        Turmas T11 = new Turmas(11, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
        Turmas T12 = new Turmas(12, "ALGORITMOS E PROGRAM. DE COMPUT", 6, 2);
        Turmas T13 = new Turmas(13, "ALGORITMOS E PROGRAM. DE COMPUT", 6, 2);
        Turmas T14 = new Turmas(14, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T15 = new Turmas(15, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T16 = new Turmas(16, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T17 = new Turmas(17, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T18 = new Turmas(18, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T19 = new Turmas(19, "FUNDAMENTOS DA COMPUTACAO", 2, 2);

        Turmas T20 = new Turmas(20, "CIRCUITOS DIGITAIS", 4, 2);
        Turmas T21 = new Turmas(21, "CIRCUITOS DIGITAIS", 4, 2);
        Turmas T22 = new Turmas(22, "CIRCUITOS DIGITAIS", 4, 2);
        Turmas T23 = new Turmas(23, "CIRCUITOS DIGITAIS", 4, 2);
        Turmas T24 = new Turmas(24, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T25 = new Turmas(25, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T26 = new Turmas(26, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T27 = new Turmas(27, "ANALISE DE SISTEMAS DE SOFTWARE", 4, 2);
        Turmas T28 = new Turmas(28, "ANALISE DE SISTEMAS DE SOFTWARE", 4, 2);
        Turmas T29 = new Turmas(29, "BANCO DE DADOS I", 4, 2);
        Turmas T30 = new Turmas(30, "INTERACAO SER-HUMANO COMPUTADOR", 4, 2);
        Turmas T31 = new Turmas(31, "PROJETO E ANALISE DE ALGORITMOS", 6, 2);
        Turmas T32 = new Turmas(32, "PROJETO E ANALISE DE ALGORITMOS", 6, 2);
        Turmas T33 = new Turmas(33, "PROJETO E ANALISE DE ALGORITMOS", 6, 2);
        Turmas T34 = new Turmas(34, "PARADIGMA DE PROG.IMP.E O.A OBJETOS", 4, 2);
        Turmas T35 = new Turmas(35, "COMPUTACAO GRAFICA", 4, 2);
        Turmas T36 = new Turmas(36, "PARADIGMA DE PROG.IMP.E O.A OBJETOS", 4, 2);
        Turmas T37 = new Turmas(37, "IMPLEMENTACAO DE SIST. DE SOFTWARE", 4, 2);
        Turmas T38 = new Turmas(38, "IMPLEMENTACAO DE SIST. DE SOFTWARE", 4, 2);
        Turmas T39 = new Turmas(39, "BANCO DE DADOS II", 4, 2);
        Turmas T40 = new Turmas(40, "PROGRAMACAO EM LING. DE MONTAGEM", 4, 2);
        Turmas T41 = new Turmas(41, "LINGUAGENS FORMAIS E AUTOMATOS", 6, 2);
        Turmas T42 = new Turmas(42, "REDES DE COMPUTADORES", 4, 2);
        Turmas T43 = new Turmas(43, "IMPL. DE LINGUAGENS DE PROGRAMACAO", 4, 2);
        Turmas T44 = new Turmas(44, "PROGRAMACAO CONCORRENTE", 4, 2);
        Turmas T45 = new Turmas(45, "TRABALHO DE CONCLUSAO DE CURSO", 1, 2);
        Turmas T46 = new Turmas(46, "QUALIDADE DE SOFTWARE", 4, 2);
        Turmas T47 = new Turmas(47, "GERENCIAMENTO DE REDES DE COMPUT", 4, 2);
        Turmas T48 = new Turmas(48, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 2);
        Turmas T49 = new Turmas(49, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 2);
        Turmas T50 = new Turmas(50, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 2);
        Turmas T51 = new Turmas(51, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 2);
        Turmas T52 = new Turmas(52, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 2);
        Turmas T53 = new Turmas(53, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 2);
        Turmas T54 = new Turmas(54, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T55 = new Turmas(55, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T56 = new Turmas(56, "CIRCUITOS DIGITAIS I", 6, 2);
        Turmas T57 = new Turmas(57, "CIRCUITOS DIGITAIS I", 6, 2);
        Turmas T58 = new Turmas(58, "CIRCUITOS DIGITAIS I", 6, 2);
        Turmas T59 = new Turmas(59, "CIRCUITOS DIGITAIS I", 6, 2);

        Estrutura e = new Estrutura();
        e.getTurmas().clear();
        e.getTurmas().add(T0);
        e.getTurmas().add(T1);
        e.getTurmas().add(T2);

        e.getTurmas().add(T3);
        e.getTurmas().add(T4);
        e.getTurmas().add(T5);
        e.getTurmas().add(T6);
        e.getTurmas().add(T7);
        e.getTurmas().add(T8);
        e.getTurmas().add(T9);

        e.getTurmas().add(T10);
        e.getTurmas().add(T11);
        e.getTurmas().add(T12);
        e.getTurmas().add(T13);
        e.getTurmas().add(T14);
        e.getTurmas().add(T15);
        e.getTurmas().add(T16);
        e.getTurmas().add(T17);
        e.getTurmas().add(T18);
        e.getTurmas().add(T19);
        e.getTurmas().add(T20);
        e.getTurmas().add(T21);
        e.getTurmas().add(T22);
        e.getTurmas().add(T23);
        e.getTurmas().add(T24);
        e.getTurmas().add(T25);
        e.getTurmas().add(T26);
        e.getTurmas().add(T27);
        e.getTurmas().add(T28);
        e.getTurmas().add(T29);

        e.getTurmas().add(T30);
        e.getTurmas().add(T31);
        e.getTurmas().add(T32);
        e.getTurmas().add(T33);
        e.getTurmas().add(T34);
        e.getTurmas().add(T35);
        e.getTurmas().add(T36);
        e.getTurmas().add(T37);
        e.getTurmas().add(T38);
        e.getTurmas().add(T39);

        e.getTurmas().add(T40);
        e.getTurmas().add(T41);
        e.getTurmas().add(T42);
        e.getTurmas().add(T43);
        e.getTurmas().add(T44);
        e.getTurmas().add(T45);
        e.getTurmas().add(T46);
        e.getTurmas().add(T47);
        e.getTurmas().add(T48);
        e.getTurmas().add(T49);

        e.getTurmas().add(T50);
        e.getTurmas().add(T51);
        e.getTurmas().add(T52);
        e.getTurmas().add(T53);
        e.getTurmas().add(T54);
        e.getTurmas().add(T55);
        e.getTurmas().add(T56);
        e.getTurmas().add(T57);
        e.getTurmas().add(T58);
        e.getTurmas().add(T59);

        e.getPropostas().clear();
        e.getProfessores().clear();
        e.getProfessores().put(1, new Professor(1, "P1", 8, 20));
        e.getProfessores().put(2, new Professor(2, "P2", 8, 20));
        e.getProfessores().put(3, new Professor(3, "P3", 8, 20));
        e.getProfessores().put(4, new Professor(4, "P4", 8, 20));
        e.getProfessores().put(5, new Professor(5, "P5", 8, 20));
        e.getProfessores().put(6, new Professor(6, "P6", 8, 20));
        e.getProfessores().put(7, new Professor(7, "P7", 8, 20));
        e.getProfessores().put(8, new Professor(8, "P8", 8, 20));
        e.getProfessores().put(9, new Professor(9, "P9", 16, 20));
        e.getProfessores().put(10, new Professor(10, "P10", 16, 20));
        e.getProfessores().put(11, new Professor(11, "P11", 16, 20));
        e.getProfessores().put(12, new Professor(12, "P12", 8, 20));
        e.getProfessores().put(13, new Professor(13, "P13", 8, 20));
        e.getProfessores().put(14, new Professor(14, "P14", 8, 20));
        e.getProfessores().put(15, new Professor(15, "P15", 8, 20));

        System.out.println("******************************************************************");

        for (int i = 0; i < e.getTurmas().size() - 1; i++) {
            e.gettCopy().put(e.getTurmas().get(i).getId(), e.getTurmas().get(i));
        }

        int randomIndiceTurma = 1 + (int) (Math.random() * (20 - 1));
        System.out.println("sorteio: " + randomIndiceTurma);
        int casosConcorrentes = Math.round((5 * 25) / 100);

        for (Map.Entry<Integer, Professor> prof : e.getProfessores().entrySet()) {
            e.gerarCaso1(e, prof.getKey(), randomIndiceTurma, casosConcorrentes);
        }

        e.toPrint();
        System.out.println("******************************************************************");
        e.balancearCargaHorariaProf(e);
        e.concorrenciaMesmoProfessor();
        System.out.println("******************************************************************");

        e.toPrint();

        e.escreverArquivo("2s");

        System.out.println("******************************************************************");
    }

    public void popularSemestre2() throws IOException {
        Turmas T0 = new Turmas(0, "TRABALHO DE GRADUACAO", 12, 2);
        Turmas T1 = new Turmas(1, "FUNDAMENTOS DA COMPUTACAO", 3, 2);
        Turmas T2 = new Turmas(2, "FUNDAMENTOS DA COMPUTACAO", 3, 2);
        Turmas T3 = new Turmas(3, "FUNDAMENTOS DA COMPUTACAO", 4, 2);
        Turmas T4 = new Turmas(4, "FUNDAMENTOS DA COMPUTACAO", 4, 2);
        Turmas T5 = new Turmas(5, "AMBIENTES DE DESENV. DE SOFTWARE", 4, 2);
        Turmas T6 = new Turmas(6, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T7 = new Turmas(7, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T8 = new Turmas(8, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
        Turmas T9 = new Turmas(9, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
        Turmas T10 = new Turmas(10, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
        Turmas T11 = new Turmas(11, "LABORATORIO DE FUND. DE PROGRAMACAO", 1, 2);
        Turmas T12 = new Turmas(12, "ALGORITMOS E PROGRAM. DE COMPUT", 6, 2);
        Turmas T13 = new Turmas(13, "ALGORITMOS E PROGRAM. DE COMPUT", 6, 2);
        Turmas T14 = new Turmas(14, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T15 = new Turmas(15, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T16 = new Turmas(16, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T17 = new Turmas(17, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T18 = new Turmas(18, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T19 = new Turmas(19, "FUNDAMENTOS DA COMPUTACAO", 2, 2);
        Turmas T20 = new Turmas(20, "CIRCUITOS DIGITAIS", 4, 2);
        Turmas T21 = new Turmas(21, "CIRCUITOS DIGITAIS", 4, 2);
        Turmas T22 = new Turmas(22, "CIRCUITOS DIGITAIS", 4, 2);
        Turmas T23 = new Turmas(23, "CIRCUITOS DIGITAIS", 4, 2);
        Turmas T24 = new Turmas(24, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T25 = new Turmas(25, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T26 = new Turmas(26, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T27 = new Turmas(27, "ANALISE DE SISTEMAS DE SOFTWARE", 4, 2);
        Turmas T28 = new Turmas(28, "ANALISE DE SISTEMAS DE SOFTWARE", 4, 2);
        Turmas T29 = new Turmas(29, "BANCO DE DADOS I", 4, 2);
        Turmas T30 = new Turmas(30, "INTERACAO SER-HUMANO COMPUTADOR", 4, 2);
        Turmas T31 = new Turmas(31, "PROJETO E ANALISE DE ALGORITMOS", 6, 2);
        Turmas T32 = new Turmas(32, "PROJETO E ANALISE DE ALGORITMOS", 6, 2);
        Turmas T33 = new Turmas(33, "PROJETO E ANALISE DE ALGORITMOS", 6, 2);
        Turmas T34 = new Turmas(34, "PARADIGMA DE PROG.IMP.E O.A OBJETOS", 4, 2);
        Turmas T35 = new Turmas(35, "COMPUTACAO GRAFICA", 4, 2);
        Turmas T36 = new Turmas(36, "PARADIGMA DE PROG.IMP.E O.A OBJETOS", 4, 2);
        Turmas T37 = new Turmas(37, "IMPLEMENTACAO DE SIST. DE SOFTWARE", 4, 2);
        Turmas T38 = new Turmas(38, "IMPLEMENTACAO DE SIST. DE SOFTWARE", 4, 2);
        Turmas T39 = new Turmas(39, "BANCO DE DADOS II", 4, 2);
        Turmas T40 = new Turmas(40, "PROGRAMACAO EM LING. DE MONTAGEM", 4, 2);
        Turmas T41 = new Turmas(41, "LINGUAGENS FORMAIS E AUTOMATOS", 6, 2);
        Turmas T42 = new Turmas(42, "REDES DE COMPUTADORES", 4, 2);
        Turmas T43 = new Turmas(43, "IMPL. DE LINGUAGENS DE PROGRAMACAO", 4, 2);
        Turmas T44 = new Turmas(44, "PROGRAMACAO CONCORRENTE", 4, 2);
        Turmas T45 = new Turmas(45, "TRABALHO DE CONCLUSAO DE CURSO", 1, 2);
        Turmas T46 = new Turmas(46, "QUALIDADE DE SOFTWARE", 4, 2);
        Turmas T47 = new Turmas(47, "GERENCIAMENTO DE REDES DE COMPUT", 4, 2);
        Turmas T48 = new Turmas(48, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 2);
        Turmas T49 = new Turmas(49, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 2);
        Turmas T50 = new Turmas(50, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 2);
        Turmas T51 = new Turmas(51, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 2);
        Turmas T52 = new Turmas(52, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 2);
        Turmas T53 = new Turmas(53, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 2);
        Turmas T54 = new Turmas(54, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T55 = new Turmas(55, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T56 = new Turmas(56, "CIRCUITOS DIGITAIS I", 6, 2);
        Turmas T57 = new Turmas(57, "CIRCUITOS DIGITAIS I", 6, 2);
        Turmas T58 = new Turmas(58, "CIRCUITOS DIGITAIS I", 6, 2);
        Turmas T59 = new Turmas(59, "CIRCUITOS DIGITAIS I", 6, 2);
        Turmas T60 = new Turmas(60, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T61 = new Turmas(61, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T62 = new Turmas(62, "FUNDAMENTOS DE ALGORITMOS", 6, 2);
        Turmas T63 = new Turmas(63, "ARQUIT.E ORGANIZ.DE COMPUTADORES I", 6, 2);
        Turmas T64 = new Turmas(64, "PAR.DE PROG.IMP.E ORIENT.A OBJETOS", 4, 2);
        Turmas T65 = new Turmas(65, "PROJETO E ANALISE DE ALGORITMOS", 6, 2);
        Turmas T66 = new Turmas(66, "INTERACAO SER HUMANO COMPUTADOR", 4, 2);
        Turmas T67 = new Turmas(67, "ANALISE DE SISTEMAS DE SOFTWARE", 4, 2);
        Turmas T68 = new Turmas(68, "BANCO DE DADOS I", 4, 2);
        Turmas T69 = new Turmas(69, "MATEMATICA COMPUTACIONAL", 4, 2);
        Turmas T70 = new Turmas(70, "SISTEMAS OPERACIONAIS", 6, 2);
        Turmas T71 = new Turmas(71, "PARAD.DE PROGR.LOGICA E FUNCIONAL", 4, 2);
        Turmas T72 = new Turmas(72, "MODELAGEM E OTIMIZACAO ALGORITMICA", 6, 2);
        Turmas T73 = new Turmas(73, "IMPLEMENT. DE SISTEMAS DE SOFTWARE", 4, 2);
        Turmas T74 = new Turmas(74, "SISTEMAS DIGITAIS", 6, 2);
        Turmas T75 = new Turmas(75, "IMPLEMENT. DE LING. DE PROGRAMACAO", 4, 2);
        Turmas T76 = new Turmas(76, "INTELIGENCIA ARTIFICIAL II", 4, 2);
        Turmas T77 = new Turmas(77, "METODOS FORMAIS", 4, 2);
        Turmas T78 = new Turmas(78, "TRABALHO DE CONCLUSAO DE CURSO I", 1, 2);
        Turmas T79 = new Turmas(79, "ESTAGIO CURRICULAR SUPERVISIONADO", 20, 2);
        Turmas T80 = new Turmas(80, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T81 = new Turmas(81, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T82 = new Turmas(82, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T83 = new Turmas(83, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T84 = new Turmas(84, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T85 = new Turmas(85, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T86 = new Turmas(86, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T87 = new Turmas(87, "FUNDAMENTOS DE PROGRAMACAO", 3, 2);
        Turmas T88 = new Turmas(88, "SISTEMAS OPERACIONAIS", 4, 2);
        Turmas T89 = new Turmas(89, "BANCO DE DADOS", 4, 2);
        Turmas T90 = new Turmas(90, "ENGENHARIA DE SOFTWARE II", 4, 2);
        Turmas T91 = new Turmas(91, "COMPUTACAO DISTRIBUIDA", 4, 2);
        Turmas T92 = new Turmas(92, "FUNDAMENTOS DA PROGRAMACAO", 3, 2);
        Turmas T93 = new Turmas(93, "FUNDAMENTOS DA PROGRAMACAO", 3, 2);
        Turmas T94 = new Turmas(94, "FUNDAMENTOS DA PROGRAMACAO", 3, 2);
        Turmas T95 = new Turmas(95, "INFORMATICA APLICADA A AGRONOMIA", 3, 2);
        Turmas T96 = new Turmas(96, "INFORMATICA APLICADA A AGRONOMIA", 3, 2);
        Turmas T97 = new Turmas(97, "INFORMATICA APLICADA A AGRONOMIA", 3, 2);
        Turmas T98 = new Turmas(98, "INFORMATICA APLICADA A AGRONOMIA", 3, 2);

        Estrutura e = new Estrutura();
        e.getTurmas().clear();
        e.getTurmas().add(T0);
        e.getTurmas().add(T1);
        e.getTurmas().add(T2);

        e.getTurmas().add(T3);
        e.getTurmas().add(T4);
        e.getTurmas().add(T5);
        e.getTurmas().add(T6);
        e.getTurmas().add(T7);
        e.getTurmas().add(T8);
        e.getTurmas().add(T9);

        e.getTurmas().add(T10);
        e.getTurmas().add(T11);
        e.getTurmas().add(T12);
        e.getTurmas().add(T13);
        e.getTurmas().add(T14);
        e.getTurmas().add(T15);
        e.getTurmas().add(T16);
        e.getTurmas().add(T17);
        e.getTurmas().add(T18);
        e.getTurmas().add(T19);

        e.getTurmas().add(T20);
        e.getTurmas().add(T21);
        e.getTurmas().add(T22);
        e.getTurmas().add(T23);
        e.getTurmas().add(T24);
        e.getTurmas().add(T25);
        e.getTurmas().add(T26);
        e.getTurmas().add(T27);
        e.getTurmas().add(T28);
        e.getTurmas().add(T29);

        e.getTurmas().add(T30);
        e.getTurmas().add(T31);
        e.getTurmas().add(T32);
        e.getTurmas().add(T33);
        e.getTurmas().add(T34);
        e.getTurmas().add(T35);
        e.getTurmas().add(T36);
        e.getTurmas().add(T37);
        e.getTurmas().add(T38);
        e.getTurmas().add(T39);

        e.getTurmas().add(T40);
        e.getTurmas().add(T41);
        e.getTurmas().add(T42);
        e.getTurmas().add(T43);
        e.getTurmas().add(T44);
        e.getTurmas().add(T45);
        e.getTurmas().add(T46);
        e.getTurmas().add(T47);
        e.getTurmas().add(T48);
        e.getTurmas().add(T49);

        e.getTurmas().add(T50);
        e.getTurmas().add(T51);
        e.getTurmas().add(T52);
        e.getTurmas().add(T53);
        e.getTurmas().add(T54);
        e.getTurmas().add(T55);
        e.getTurmas().add(T56);
        e.getTurmas().add(T57);
        e.getTurmas().add(T58);
        e.getTurmas().add(T59);

        e.getTurmas().add(T60);
        e.getTurmas().add(T61);
        e.getTurmas().add(T62);
        e.getTurmas().add(T63);
        e.getTurmas().add(T64);
        e.getTurmas().add(T65);
        e.getTurmas().add(T66);
        e.getTurmas().add(T67);
        e.getTurmas().add(T68);
        e.getTurmas().add(T69);

        e.getTurmas().add(T70);
        e.getTurmas().add(T71);
        e.getTurmas().add(T72);
        e.getTurmas().add(T73);
        e.getTurmas().add(T74);
        e.getTurmas().add(T75);
        e.getTurmas().add(T76);
        e.getTurmas().add(T77);
        e.getTurmas().add(T78);
        e.getTurmas().add(T79);

        e.getTurmas().add(T80);
        e.getTurmas().add(T81);
        e.getTurmas().add(T82);
        e.getTurmas().add(T83);
        e.getTurmas().add(T84);
        e.getTurmas().add(T85);
        e.getTurmas().add(T86);
        e.getTurmas().add(T87);
        e.getTurmas().add(T88);
        e.getTurmas().add(T89);
        e.getTurmas().add(T90);

        e.getPropostas().clear();
        e.getProfessores().clear();
        e.getProfessores().put(1, new Professor(1, "P1", 8, 20));
        e.getProfessores().put(2, new Professor(2, "P2", 8, 20));
        e.getProfessores().put(3, new Professor(3, "P3", 8, 20));
        e.getProfessores().put(4, new Professor(4, "P4", 8, 20));
        e.getProfessores().put(5, new Professor(5, "P5", 8, 20));
        e.getProfessores().put(6, new Professor(6, "P6", 8, 20));
        e.getProfessores().put(7, new Professor(7, "P7", 8, 20));
        e.getProfessores().put(8, new Professor(8, "P8", 8, 20));
        e.getProfessores().put(9, new Professor(9, "P9", 8, 20));
        e.getProfessores().put(10, new Professor(10, "P10", 8, 20));
        e.getProfessores().put(11, new Professor(11, "P11", 8, 20));
        e.getProfessores().put(12, new Professor(12, "P12", 8, 20));
        e.getProfessores().put(13, new Professor(13, "P13", 8, 20));
        e.getProfessores().put(14, new Professor(14, "P14", 8, 20));
        e.getProfessores().put(15, new Professor(15, "P15", 8, 20));
        e.getProfessores().put(16, new Professor(16, "P16", 8, 20));
        e.getProfessores().put(17, new Professor(17, "P17", 8, 20));
        e.getProfessores().put(18, new Professor(18, "P18", 8, 20));
        e.getProfessores().put(19, new Professor(19, "P19", 8, 20));
        e.getProfessores().put(20, new Professor(20, "P20", 8, 20));
        e.getProfessores().put(21, new Professor(21, "P21", 8, 20));
        e.getProfessores().put(22, new Professor(22, "P22", 8, 20));
        e.getProfessores().put(23, new Professor(23, "P23", 8, 20));
        e.getProfessores().put(24, new Professor(24, "P24", 8, 20));

        System.out.println("******************************************************************");

        for (Map.Entry<Integer, Professor> prof : e.getProfessores().entrySet()) {
            e.gerarNumeroPropostas(e, prof.getKey());
        }

        e.toPrint();
        System.out.println("******************************************************************");
        e.balancearCargaHorariaProf(e);
        e.concorrenciaMesmoProfessor();
        System.out.println("******************************************************************");

        e.toPrint();

        e.escreverArquivo("2s");

        System.out.println("******************************************************************");
    }

    public void popularSemestre1() throws IOException {
        Turmas T0 = new Turmas(0, "TRABALHO DE GRADUACAO", 2, 1);
        Turmas T1 = new Turmas(1, "FUNDAMENTOS DA COMPUTACAO", 3, 1);
        Turmas T2 = new Turmas(2, "FUNDAMENTOS DA COMPUTACAO", 3, 1);
        Turmas T3 = new Turmas(3, "METODOS FORMAIS II", 4, 1);
        Turmas T4 = new Turmas(4, "ESTRUTURA DE DADOS", 4, 1);
        Turmas T5 = new Turmas(5, "FUNDAMENTOS DE TECNOL.DA INFORMACAO", 4, 1);
        Turmas T6 = new Turmas(6, "FUND. DE PESQUISA EM INFORMATICA", 4, 1);
        Turmas T7 = new Turmas(7, "FUND. DE PESQUISA EM INFORMATICA", 4, 1);
        Turmas T8 = new Turmas(8, "PROC.DE SOFTWARE E E. DE REQUISITOS", 4, 1);
        Turmas T9 = new Turmas(9, "PROC.DE SOFTWARE E E. DE REQUISITOS", 4, 1);
        Turmas T10 = new Turmas(10, "ARQ. E ORGANIZACAO DE COMPUTADORES", 4, 1);
        Turmas T11 = new Turmas(11, "ESTRUTURAS DE DADOS", 6, 1);
        Turmas T12 = new Turmas(12, "ESTRUTURAS DE DADOS", 6, 1);
        Turmas T13 = new Turmas(13, "PROJETO DE SISTEMAS DE SOFTWARE", 4, 1);
        Turmas T14 = new Turmas(14, "PROJETO DE SISTEMAS DE SOFTWARE", 4, 1);
        Turmas T15 = new Turmas(15, "ORGANIZACAO E RECUPERACAO DE DADOS", 4, 1);
        Turmas T16 = new Turmas(16, "PROGRAMACAO DE SISTEMAS WEB", 4, 1);
        Turmas T17 = new Turmas(17, "ALGORITMOS EM GRAFOS", 4, 1);
        Turmas T18 = new Turmas(18, "ALGORITMOS EM GRAFOS", 4, 1);
        Turmas T19 = new Turmas(19, "PROGRAMACAO ORIENTADA A OBJETOS", 4, 1);
        Turmas T20 = new Turmas(20, "SISTEMAS OPERACIONAIS", 4, 1);
        Turmas T21 = new Turmas(21, "SISTEMAS DIGITAIS", 4, 1);
        Turmas T22 = new Turmas(22, "INFORMATICA E SOCIEDADE", 2, 1);
        Turmas T23 = new Turmas(23, "MODELAGEM E OTIMIZACAO ALGORITMICA", 6, 1);
        Turmas T24 = new Turmas(24, "PARADIGMA DE PROG. LOG. E FUNCIONAL", 4, 1);
        Turmas T25 = new Turmas(25, "GERENCIAMENTO DE PROJETOS", 4, 1);
        Turmas T26 = new Turmas(26, "METODOS FORMAIS", 4, 1);
        Turmas T27 = new Turmas(27, "SISTEMAS DISTRIBUIDOS", 4, 1);
        Turmas T28 = new Turmas(28, "INTELIGENCIA ARTIFICIAL", 6, 1);
        Turmas T29 = new Turmas(29, "TRABALHO DE CONCLUSAO DE CURSO", 1, 1);
        Turmas T30 = new Turmas(30, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
        Turmas T31 = new Turmas(31, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
        Turmas T32 = new Turmas(32, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
        Turmas T33 = new Turmas(33, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
        Turmas T34 = new Turmas(34, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
        Turmas T35 = new Turmas(35, "ALGORITMOS E PROG.DE COMPUTADORES", 3, 1);
        Turmas T36 = new Turmas(36, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
        Turmas T37 = new Turmas(37, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
        Turmas T38 = new Turmas(38, "FUNDAMENTOS DE ELETRONICA", 6, 1);
        Turmas T39 = new Turmas(39, "FUNDAMENTOS DE ELETRONICA", 6, 1);
        Turmas T40 = new Turmas(40, "FUNDAMENTOS DE ELETRONICA", 6, 1);
        Turmas T41 = new Turmas(41, "FUNDAMENTOS DE ELETRONICA", 6, 1);
        Turmas T42 = new Turmas(42, "FUND. DE TECNOLOGIA DA INFORMACAO", 4, 1);
        Turmas T43 = new Turmas(43, "FUND. DE PESQUISA EM INFORMATICA", 2, 1);
        Turmas T44 = new Turmas(44, "CIRCUITOS DIGITAIS II", 4, 1);
        Turmas T45 = new Turmas(45, "CIRCUITOS DIGITAIS II", 4, 1);
        Turmas T46 = new Turmas(46, "LINGUAGENS FORMAIS E AUTOMATOS", 6, 1);
        Turmas T47 = new Turmas(47, "ESTRUTURAS DE DADOS", 6, 1);
        Turmas T48 = new Turmas(48, "ESTRUTURAS DE DADOS", 6, 1);
        Turmas T49 = new Turmas(49, "PROC.DE SOFT.E ENG. DE REQUISITOS", 4, 1);
        Turmas T50 = new Turmas(50, "PROG.PARA INT.DE HARDW. E SOFTWARE", 4, 1);
        Turmas T51 = new Turmas(51, "ARQUIT.E ORGANIZ.DE COMPUTADORES II", 4, 1);
        Turmas T52 = new Turmas(52, "COMPUTABILIDADE", 4, 1);
        Turmas T53 = new Turmas(53, "ORGANIZACAO E RECUPERACAO DE DADOS", 4, 1);
        Turmas T54 = new Turmas(54, "ALGORITMOS EM GRAFOS", 4, 1);
        Turmas T55 = new Turmas(55, "PROJETO DE SISTEMAS DE SOFTWARE", 4, 1);
        Turmas T56 = new Turmas(56, "COMPUTACAO GRAFICA", 4, 1);
        Turmas T57 = new Turmas(57, "REDES DE COMPUTADORES", 4, 1);
        Turmas T58 = new Turmas(58, "PROGRAMACAO CONCORRENTE", 4, 1);
        Turmas T59 = new Turmas(59, "INTELIGENCIA ARTIFICIAL", 4, 1);
        Turmas T60 = new Turmas(60, "BANCO DE DADOS II", 4, 1);
        Turmas T61 = new Turmas(61, "GERENC. DE PROJETOS DE SOFTWARE", 4, 1);
        Turmas T62 = new Turmas(62, "PROCES. DIGITAL DE SINAIS E IMAGENS", 4, 1);
        Turmas T63 = new Turmas(63, "GERENC. DE REDES DE COMPUTADORES", 4, 1);
        Turmas T64 = new Turmas(64, "SISTEMAS DISTRIBUIDOS", 4, 1);
        Turmas T65 = new Turmas(65, "SISTEMAS HIPERMIDIA E MULTIMIDIA", 4, 1);
        Turmas T66 = new Turmas(66, "TRABALHO DE CONCLUSAO DE CURSO II", 1, 1);
        Turmas T67 = new Turmas(67, "INFORMATICA E SOCIEDADE", 2, 1);
        Turmas T68 = new Turmas(68, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
        Turmas T69 = new Turmas(69, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
        Turmas T70 = new Turmas(70, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
        Turmas T71 = new Turmas(71, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
        Turmas T72 = new Turmas(72, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
        Turmas T73 = new Turmas(73, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
        Turmas T74 = new Turmas(74, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
        Turmas T75 = new Turmas(75, "FUNDAMENTOS DE PROGRAMACAO", 3, 1);
        Turmas T76 = new Turmas(76, "ALGORITMO E ESTRUTURA DE DADOS", 4, 1);
        Turmas T77 = new Turmas(77, "ALGORITMO E ESTRUTURA DE DADOS", 4, 1);
        Turmas T78 = new Turmas(78, "ALGORITMO E ESTRUTURA DE DADOS", 4, 1);
        Turmas T79 = new Turmas(79, "ALGORITMO E ESTRUTURA DE DADOS", 4, 1);
        Turmas T80 = new Turmas(80, "PROGRAMACAO DE SISTEMAS", 4, 1);
        Turmas T81 = new Turmas(81, "ARQUIT. E ORGANIZ. DE COMPUTADORES", 4, 1);
        Turmas T82 = new Turmas(82, "ENGENHARIA DE SOFTWARE I", 4, 1);
        Turmas T83 = new Turmas(83, "REDES E COMUNICACAO DE DADOS", 4, 1);
        Turmas T84 = new Turmas(84, "GERENCIAMENTO DE PROJ. DE SOFTWARE", 4, 1);
        Turmas T85 = new Turmas(85, "QUALIDADE DE SOFTWARE", 4, 1);
        Turmas T86 = new Turmas(86, "SIST. TECNOLOG. P/AREA SECRETARIAL", 4, 1);
        Turmas T87 = new Turmas(87, "SIST. TECNOLOG. P/AREA SECRETARIAL", 4, 1);
        Turmas T88 = new Turmas(88, "FUNDAMENTOS DA PROGRAMACAO", 3, 1);
        Turmas T89 = new Turmas(89, "FUNDAMENTOS DA PROGRAMACAO", 3, 1);
        Turmas T90 = new Turmas(90, "FUNDAMENTOS DA PROGRAMACAO", 3, 1);

        Estrutura e = new Estrutura();

        e.getTurmas().add(T0);
        e.getTurmas().add(T1);
        e.getTurmas().add(T2);

        e.getTurmas().add(T3);
        e.getTurmas().add(T4);
        e.getTurmas().add(T5);
        e.getTurmas().add(T6);
        e.getTurmas().add(T7);
        e.getTurmas().add(T8);
        e.getTurmas().add(T9);

        e.getTurmas().add(T10);
        e.getTurmas().add(T11);
        e.getTurmas().add(T12);
        e.getTurmas().add(T13);
        e.getTurmas().add(T14);
        e.getTurmas().add(T15);
        e.getTurmas().add(T16);
        e.getTurmas().add(T17);
        e.getTurmas().add(T18);
        e.getTurmas().add(T19);

        e.getTurmas().add(T20);
        e.getTurmas().add(T21);
        e.getTurmas().add(T22);
        e.getTurmas().add(T23);
        e.getTurmas().add(T24);
        e.getTurmas().add(T25);
        e.getTurmas().add(T26);
        e.getTurmas().add(T27);
        e.getTurmas().add(T28);
        e.getTurmas().add(T29);

        e.getTurmas().add(T30);
        e.getTurmas().add(T31);
        e.getTurmas().add(T32);
        e.getTurmas().add(T33);
        e.getTurmas().add(T34);
        e.getTurmas().add(T35);
        e.getTurmas().add(T36);
        e.getTurmas().add(T37);
        e.getTurmas().add(T38);
        e.getTurmas().add(T39);

        e.getTurmas().add(T40);
        e.getTurmas().add(T41);
        e.getTurmas().add(T42);
        e.getTurmas().add(T43);
        e.getTurmas().add(T44);
        e.getTurmas().add(T45);
        e.getTurmas().add(T46);
        e.getTurmas().add(T47);
        e.getTurmas().add(T48);
        e.getTurmas().add(T49);

        e.getTurmas().add(T50);
        e.getTurmas().add(T51);
        e.getTurmas().add(T52);
        e.getTurmas().add(T53);
        e.getTurmas().add(T54);
        e.getTurmas().add(T55);
        e.getTurmas().add(T56);
        e.getTurmas().add(T57);
        e.getTurmas().add(T58);
        e.getTurmas().add(T59);

        e.getTurmas().add(T60);
        e.getTurmas().add(T61);
        e.getTurmas().add(T62);
        e.getTurmas().add(T63);
        e.getTurmas().add(T64);
        e.getTurmas().add(T65);
        e.getTurmas().add(T66);
        e.getTurmas().add(T67);
        e.getTurmas().add(T68);
        e.getTurmas().add(T69);

        e.getTurmas().add(T70);
        e.getTurmas().add(T71);
        e.getTurmas().add(T72);
        e.getTurmas().add(T73);
        e.getTurmas().add(T74);
        e.getTurmas().add(T75);
        e.getTurmas().add(T76);
        e.getTurmas().add(T77);
        e.getTurmas().add(T78);
        e.getTurmas().add(T79);

        e.getTurmas().add(T80);
        e.getTurmas().add(T81);
        e.getTurmas().add(T82);
        e.getTurmas().add(T83);
        e.getTurmas().add(T84);
        e.getTurmas().add(T85);
        e.getTurmas().add(T86);
        e.getTurmas().add(T87);
        e.getTurmas().add(T88);
        e.getTurmas().add(T89);
        e.getTurmas().add(T90);

//        Consideramos 24 docentes efetivos, que são professores concursados com carga
//        horária mínima de aula de 8h e máxima de 20 horas semanais. Os docentes colabora-
//        dores são aqueles contratados conforme a necessidade do departamento e que possuem
//        respectivamente carga horária mínima e máxima de 16 e 20 horas semanais.
        e.getProfessores().put(1, new Professor(1, "P1", 8, 20));
        e.getProfessores().put(2, new Professor(2, "P2", 8, 20));
        e.getProfessores().put(3, new Professor(3, "P3", 8, 20));
        e.getProfessores().put(4, new Professor(4, "P4", 8, 20));
        e.getProfessores().put(5, new Professor(5, "P5", 8, 20));
        e.getProfessores().put(6, new Professor(6, "P6", 8, 20));
        e.getProfessores().put(7, new Professor(7, "P7", 8, 20));
        e.getProfessores().put(8, new Professor(8, "P8", 8, 20));
        e.getProfessores().put(9, new Professor(9, "P9", 8, 20));
        e.getProfessores().put(10, new Professor(10, "P10", 8, 20));
        e.getProfessores().put(11, new Professor(11, "P11", 8, 20));
        e.getProfessores().put(12, new Professor(12, "P12", 8, 20));
        e.getProfessores().put(13, new Professor(13, "P13", 8, 20));
        e.getProfessores().put(14, new Professor(14, "P14", 8, 20));
        e.getProfessores().put(15, new Professor(15, "P15", 8, 20));
        e.getProfessores().put(16, new Professor(16, "P16", 8, 20));
        e.getProfessores().put(17, new Professor(17, "P17", 8, 20));
        e.getProfessores().put(18, new Professor(18, "P18", 8, 20));
        e.getProfessores().put(19, new Professor(19, "P19", 8, 20));
        e.getProfessores().put(20, new Professor(20, "P20", 8, 20));
        e.getProfessores().put(21, new Professor(21, "P21", 8, 20));
        e.getProfessores().put(22, new Professor(22, "P22", 8, 20));
        e.getProfessores().put(23, new Professor(23, "P23", 8, 20));
        e.getProfessores().put(24, new Professor(24, "P24", 8, 20));

//        HashMap<Integer, Turmas> s1 = new HashMap<>();
//        s1.put(T1.getId(), T1);
//        s1.put(T0.getId(), T0);
//        s1.put(T2.getId(), T2);        
//        
//        HashMap<Integer, Turmas> s2 = new HashMap<>();
//        s2.put(T1.getId(), T1);          
//        s2.put(T0.getId(), T0);        
//        s2.put(T3.getId(), T3);        
//        
//        HashMap<Integer, Turmas> s3 = new HashMap<>();
//        s3.put(T1.getId(), T1);        
//        s3.put(T4.getId(), T4);        
//        
//        e.getPropostas().add(new Proposta(1, 10, s1));
//        e.getPropostas().add(new Proposta(1, 15, s2));
//        e.getPropostas().add(new Proposta(2, 15, s3));
        System.out.println("******************************************************************");

        for (Map.Entry<Integer, Professor> prof : e.getProfessores().entrySet()) {
            e.gerarNumeroPropostas(e, prof.getKey());
        }

        e.toPrint();
        System.out.println("******************************************************************");
        e.balancearCargaHorariaProf(e);
        e.concorrenciaMesmoProfessor();
        System.out.println("******************************************************************");

        e.toPrint();

        e.escreverArquivo("1s");

        System.out.println("******************************************************************");

    }

    public static void main(String[] args) throws IOException {
        AuctionsData ad = new AuctionsData();
        ad.popularCaso2();
        //ad.popularSemestre2();

    }

}
