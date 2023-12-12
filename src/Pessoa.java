import java.io.BufferedReader;
import java.io.IOException;

public class Pessoa {

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

    public String toString(){

        return this.nome + " (CPF: " + this.cpf + ")";
    }

    //getters

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
}
