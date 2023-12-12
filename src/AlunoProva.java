public class AlunoProva {

    //atributos

    private Aluno aluno;
    private double[] notas;

    //construtor

    public AlunoProva(Aluno aluno, double[] notas) {
        this.aluno = aluno;
        this.notas = notas;
    }


    //metodos

    public double notaTotal(){

        double nt = 0; //nota total inicialmente zero


        for(int i =  0; i < this.notas.length; i++){

            nt += this.notas[i];
        }

        return nt;
    }

}
