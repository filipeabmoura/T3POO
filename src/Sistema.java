import java.io.*;
import java.util.ArrayList;

public class Sistema {

    //atributos

    private int nProfs;
    private int nAlunos;
    private int nTurmas;
    private ArrayList<Professor> profs;
    private ArrayList<Aluno> alunos;
    private ArrayList<Turma> turmas;

    //construtor

    public Sistema() {

        this.nProfs = 0;
        this.nAlunos = 0;
        this.nTurmas = 0;
        this.profs = new ArrayList<>();
        this.alunos = new ArrayList<>();
        this.turmas = new ArrayList<>();

        this.lerAlunosArquivo();
        this.lerProfessoresArquivo();
    }

    //metodos

    public void novoProf(Professor p){

        this.profs.add(p);
        this.nProfs += 1;
    }

    public void novoAluno(Aluno a){

        this.alunos.add(a);
        this.nAlunos += 1;
    }

    //novo metodo para adicionar turmas
    public void novaTurma(Turma t){

        this.turmas.add(t);
        this.nTurmas += 1;
    }

    public Professor encontrarProf(String cpf){

        for(Professor p : this.profs){

            if(p.getCpf().equals(cpf)){
                return p;
            }
        }

        return null;
    }

    public Aluno encontrarAluno(String mat){

        for(Aluno a : this.alunos){

            if(a.getMat().equals(mat)){
                return a;
            }
        }

        return null;
    }

    public void listarProfs(){
        System.out.println("Professores cadastrados:");

        if(this.profs.isEmpty()){

            System.out.println("Nenhum professor cadastrado.");
        }
        else{

            for(Professor p : this.profs){

                System.out.println("* " + p.toString());
            }
        }

    }

    public void listarAlunos(){

        System.out.println("Alunos cadastrados:");

        if(this.alunos.isEmpty()){

            System.out.println("Nenhum aluno cadastrado.");
        }
        else{

            for(Aluno a : this.alunos){

                System.out.println("* " + a.toString());
            }
        }
    }

    //salvar arquivo de alunos
    public void salvarAlunosArquivo(){

        try{

            FileWriter f = new FileWriter("alunos.txt");
            BufferedWriter b = new BufferedWriter(f);

            b.write(this.nAlunos + "\n");

            for(Aluno a : this.alunos){

                a.salvarArquivo(b);
            }

            b.close();
        }
        catch (IOException e) {

            System.out.println("ERRO! alunos não foram salvos.");
        }
    }

    //salvar arquivo de professores
    public void salvarProfessoresArquivo(){

        try{

            FileWriter f = new FileWriter("professores.txt");
            BufferedWriter b = new BufferedWriter(f);

            b.write(this.nProfs + "\n");

            for(Professor p : this.profs){

                p.salvarArquivo(b);
            }

            b.close();
        }
        catch (IOException e) {

            System.out.println("ERRO! Professores não foram salvos.");
        }
    }

    //ler arquivo de alunos
    public void lerAlunosArquivo(){

        try{

            FileReader f = new FileReader("alunos.txt");
            BufferedReader b = new BufferedReader(f);

            this.nAlunos = Integer.parseInt(b.readLine());

            for(int i = 0; i<this.nAlunos; i++){

                this.alunos.add(new Aluno(b));
            }

            b.close();
            System.out.println(nAlunos + " alunos carregados no sistema.");

        } catch (IOException e) {

            System.out.println("ERRO! Não foi possivel carregar alunos.");
        }
    }

    //ler arquivo de professores
    public void lerProfessoresArquivo(){

        try{

            FileReader f = new FileReader("professores.txt");
            BufferedReader b = new BufferedReader(f);

            this.nProfs = Integer.parseInt(b.readLine());

            for(int i = 0; i<this.nProfs; i++){

                this.profs.add(new Professor(b));
            }

            b.close();
            System.out.println(nProfs + " professores carregados no sistema.");

        } catch (IOException e) {

            System.out.println("ERRO! Não foi possivel carregar professores.");
        }
    }


    //getters
    public ArrayList<Turma> getTurmas() {
        return this.turmas;
    }

    public int getnProfs() {
        return this.nProfs;
    }

    public int getnAlunos() {
        return this.nAlunos;
    }
}
