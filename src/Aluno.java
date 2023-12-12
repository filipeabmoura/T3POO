import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Aluno extends Pessoa{

    //atributos

    private String mat;

    //construtor

    public Aluno(String nome, String cpf, String mat) {
        super(nome, cpf);
        this.mat = mat;
    }

    public Aluno(BufferedReader b) throws IOException {

        super(b);
        this.mat = b.readLine();
    }


    //metodos

    public String toString(){

        return this.nome + " (Matrícula: " + this.mat + ")";
    }


    public void salvarArquivo(BufferedWriter b) throws IOException {

        b.write(this.nome + "\n");
        b.write(this.cpf + "\n");
        b.write(this.mat +"\n");
    }

    //getters

    public String getMat() {
        return this.mat;
    }
}
