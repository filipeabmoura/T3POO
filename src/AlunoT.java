public class AlunoT implements Comparable<AlunoT> {

    //atributos
    private int index;
    private double nota;
    private String mat;

    //construtor
    public AlunoT(int index, double nota, String mat){

        this.index = index;
        this.nota = nota;
        this.mat = mat;
    }

    //metodo
    public int compareTo(AlunoT a2){

        //primeiro compara pela nota
        if(this.nota > a2.getNota()){
            return -1;
        }else if (this.nota < a2.getNota()){
            return 1;
        }else{ //se notas sao iguais, compara pelo cpf
            return this.mat.compareTo(a2.getMat());
        }
    }

    //getters
    public int getIndex() {
        return this.index;
    }

    public double getNota() {
        return this.nota;
    }

    public String getMat() {
        return this.mat;
    }
}
