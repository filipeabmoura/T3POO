public class AlunoT implements Comparable<AlunoT> {

    //atributos
    private int index;
    private double nota;
    private String cpf;

    //construtor
    public AlunoT(int index, double nota, String cpf){

        this.index = index;
        this.nota = nota;
        this.cpf = cpf;
    }

    //metodo
    public int compareTo(AlunoT a2){

        //primeiro compara pela nota
        if(this.nota > a2.getNota()){
            return -1;
        }else if (this.nota < a2.getNota()){
            return 1;
        }else{ //se notas sao iguais, compara pelo cpf
            return this.cpf.compareTo(a2.getCpf());
        }
    }

    //getters
    public int getIndex() {
        return this.index;
    }

    public double getNota() {
        return this.nota;
    }

    public String getCpf() {
        return this.cpf;
    }
}
