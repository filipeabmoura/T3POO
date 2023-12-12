import java.io.BufferedReader;
import java.io.IOException;

public abstract class Pessoa {

    //atributos

    protected String nome;
    protected String cpf;

    //construtor

    public Pessoa(String nome, String cpf){

        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(BufferedReader b) throws IOException {

        this.nome = b.readLine();
        this.cpf = b.readLine();
    }


    //metodos

    public abstract String toString();



    //getters

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
}
