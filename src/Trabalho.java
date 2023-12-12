public class Trabalho extends Avaliacao{

    //atributos

    private int tempoEsp;
    private AlunoTrab[] notas;

    //construtor

    public Trabalho(String nome, Data dtAplic, double valor, int tempoEsp, AlunoTrab[] notas) {
        super(nome, dtAplic, valor);
        this.tempoEsp = tempoEsp;
        this.notas = notas;
    }


    //metodos

    public double nota(int index){
        
        return this.notas[index].notaTotal(this.dtAplic, this.tempoEsp, this.valor);
    }
}
