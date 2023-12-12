public class AlunoTrab {

    //atributos

    private Aluno aluno;
    private double nota;
    private Data dtEntrega;
    private int tempoExec;

    //construtor

    public AlunoTrab(Aluno aluno, double nota, Data dtEntrega, int tempoExec) {
        this.aluno = aluno;
        this.nota = nota;
        this.dtEntrega = dtEntrega;
        this.tempoExec = tempoExec;
    }


    //metodos

    public double notaTotal(Data prazo, int tempoEsp, double valor){
        
        double notaTotal = this.nota; //nota total inicialmente zerada
        
        if(this.dtEntrega.compareTo(prazo) > 0){
            
            return this.nota * 0.8; //retorna 80% da nota avaliada por atraso
        }else{
            
            if(this.nota == valor){
                
                if(this.tempoExec <= tempoEsp){
                    
                    notaTotal = this.nota + 2;
                }
            }
        }

        return notaTotal;
    }
}
