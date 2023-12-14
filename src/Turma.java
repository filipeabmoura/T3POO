import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {

    //Atributos

    private String nome;
    private int ano;
    private int sem;
    private Professor prof;
    private Aluno[] alunos;
    private Avaliacao[] avs;
    private List<AlunoT> alunosT;

    //construtor

    public Turma(String nome, int ano, int sem, Professor prof, Aluno[] alunos, Avaliacao[] avs) {
        this.nome = nome;
        this.ano = ano;
        this.sem = sem;
        this.prof = prof;
        this.alunos = alunos;
        this.avs = avs;
        this.alunosT = new ArrayList<>();
    }

    private void ordenaAlunos(){

        for (int i = 0; i < this.alunos.length; i++){ //para cada aluno

            double somaNotas = 0; //soma das notas inicialmente zero
            double somaMax = 0; //soma das notas maximas das avaliacoes

            for(int j = 0; j < this.avs.length; j++ ){ //para cada avaliacao

                somaMax += this.avs[j].valor;         //incrementa valor maximo da avaliacao
                somaNotas += this.avs[j].nota(i);     //incrementa a nota tirada pelo aluno
            }

            //verificar se a nota ultrapassou a nota maxima
            if(somaNotas > somaMax){
                somaNotas = somaMax;
            }


            AlunoT al = new AlunoT(i, somaNotas, this.alunos[i].getCpf());  //cria novo alunoT com indice, nota total e cpf

            boolean podeAdd = true; //inicialmente pode add o aluno no arraylist

            for(AlunoT aluns : this.alunosT){
                if(aluns.getIndex() == al.getIndex()){
                    podeAdd = false; //se ja tiver na lista, nao pode adicionar
                }
            }

            if(podeAdd){ //adiciona se puder

                this.alunosT.add(al);                                           //adiciona ao arrayList de alunosT
            }
        }

        Collections.sort(this.alunosT); //ordena alunosT antes do print
    }


    public void medias(){

        this.ordenaAlunos(); //ordena antes da imprimir

        double somaTodaTurma = 0;



        System.out.println("Médias da Turma " + this.nome + " (" + this.ano + "/" + this.sem + "):");

        for(AlunoT alunoTurma : this.alunosT){

            System.out.printf(this.alunos[alunoTurma.getIndex()].toString() + ": "); //printa o nome e matricula

            double somaNotas = 0; //soma das notas inicialmente zero
            double somaMax = 0; //soma das notas maximas das avaliacoes

            for(int j = 0; j < this.avs.length; j++ ){ //para cada avaliacao

                somaMax += this.avs[j].valor;         //incrementa valor maximo da avaliacao
                somaNotas += this.avs[j].nota(alunoTurma.getIndex());     //incrementa a nota tirada pelo aluno

                System.out.printf(this.avs[j].nota(alunoTurma.getIndex()) + " ");
            }

            //verificar se a nota ultrapassou a nota maxima
            if(somaNotas > somaMax){
                somaNotas = somaMax;
            }

            System.out.println("= " + somaNotas);    //print da media final do aluno

            somaTodaTurma += somaNotas;

        }

        System.out.println("Média da turma: " + somaTodaTurma/this.alunos.length);

    }

    //getters
    public String getNome() {
        return this.nome;
    }

    public int getAno() {
        return this.ano;
    }

    public int getSem() {
        return this.sem;
    }

    public Professor getProf() {
        return this.prof;
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public Avaliacao[] getAvs() {
        return this.avs;
    }
}
