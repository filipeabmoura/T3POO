public abstract class Avaliacao {

    //atributos

    protected String nome;
    protected Data dtAplic;
    protected double valor;

    //construtor

    public Avaliacao(String nome, Data dtAplic, double valor) {
        this.nome = nome;
        this.dtAplic = dtAplic;
        this.valor = valor;
    }


    //metodos

    public abstract double nota(int index);

}
