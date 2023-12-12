public class Data implements Comparable<Data>{

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

    public int compareTo(Data d2){

        if(this.ano > d2.getAno()){
            return 1;
        }else if(this.ano < d2.getAno()){
            return -1;
        }else{
            if(this.mes > d2.getMes()){
                return 1;
            }else if(this.mes < d2.getMes()){
                return -1;
            }else{
                if(this.dia > d2.getDia()){
                    return 1;
                } else if(this.dia < d2.getDia()){
                    return -1;
                } else{
                    return 0;
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