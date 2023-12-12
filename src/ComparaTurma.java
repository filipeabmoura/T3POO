import java.util.Comparator;

public class ComparaTurma implements Comparator<Turma> {


    public int compare(Turma t1, Turma t2){

        //compara os semestres (do mais recente pro menos recente)
        if(t1.getAno() > t2.getAno()){
            return -1;
        }else if(t1.getAno() < t2.getAno()){
            return 1;
        }else{
            if(t1.getSem() > t2.getSem()){
                return -1;
            }else if(t1.getSem() < t2.getSem()){
                return 1;
            }else {

                //compara o nome da disciplina
                if(t1.getNome().compareTo(t2.getNome()) != 0){

                    return t1.getNome().compareTo(t2.getNome());
                }else{

                    //comparar pelo nome do professor
                    if(t1.getProf().getNome().compareTo(t2.getProf().getNome()) != 0){

                        return t1.getProf().getNome().compareTo(t2.getProf().getNome());
                    }else{
                        //compara pelo cpf do professor
                        return t1.getProf().getCpf().compareTo(t2.getProf().getCpf());
                    }
                }
            }
        }
    }
}
