public class Data {

    //atributos

    private int dia;
    private int mes;
    private int ano;

    //construtores

    public Data(int d, int m, int a){
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    //metodos

    public boolean posterior(Data d2){
        if(this.ano > d2.getAno()){
            return true;
        }else if(this.ano < d2.getAno()){
            return false;
        }else{
            if(this.mes > d2.getMes()){
                return true;
            }else if(this.mes < d2.getMes()){
                return false;
            }else{
                if(this.dia > d2.getDia()){
                    return true;
                } else{
                    return false;
                }
            }
        }
    }

    //getters

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }
}