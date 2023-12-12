public class Prova extends Avaliacao{

    //atributos

    private int nQuestoes;
    private AlunoProva[] notas;

    //construtor

    public Prova(String nome, Data dtAplic, double valor, int nQuestoes, AlunoProva[] notas) {
        super(nome, dtAplic, valor);
        this.nQuestoes = nQuestoes;
        this.notas = notas;
    }


    //metodos

    
    //retorna nota total de um aluno
    public double nota(int index){

        return this.notas[index].notaTotal();
    }

}
