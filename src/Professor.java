import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Professor extends Pessoa {

    //atributos

    private double salario;

    //construtor

    public Professor(String nome, String cpf, double salario){

        super(nome, cpf);

        this.salario = salario;

    }

    public Professor(BufferedReader b) throws IOException {

        super(b);
        this.salario = Double.parseDouble(b.readLine());
    }

    //metodos

    public void salvarArquivo(BufferedWriter b) throws IOException {

        b.write(this.nome + "\n");
        b.write(this.cpf + "\n");
        b.write(this.salario +"\n");
    }

}
