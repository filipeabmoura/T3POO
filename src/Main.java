import java.util.Collections;

/**
 * Classe principal
 * @author Hilario Seibel Junior
 *
 * AUTORES: BRUNO PLAZZI e FILIPE MOURA
 */
public class Main {
    public static void main(String[] args) {

        Entrada io = new Entrada();
        Sistema s = new Sistema();

        ComparaTurma compT = new ComparaTurma();

        int op = io.menu1();

        while (op != 0) {
            if (op == 1) {
                //cadastro do professor
                io.cadProf(s);
                s.salvarProfessoresArquivo();
            }
            if (op == 2) {
                //cadastro do aluno
                io.cadAluno(s);
                s.salvarAlunosArquivo();
            }
            if (op == 3) {

                try{

                    Turma t = io.cadTurma(s);
                    s.novaTurma(t);

                } catch (NumberFormatException e){
                    System.out.println("ERRO! Número digitado com formato invalido. Turma nao cadastrada.");

                } catch (IllegalArgumentException e){
                    System.out.println("ERRO! Alguma informacao digitada incorretamente. Turma nao cadastrada.");

                } catch (StringIndexOutOfBoundsException e){
                    System.out.println("ERRO! Você precisa digitar algo antes de enviar a informação.");

                } catch (NaoHaAlunosException | NaoHaProfsException | AlunosInsuficientesException e) {
                    System.out.println(e.getMessage());

                } catch (NegativeArraySizeException e){
                    System.out.println("ERRO! Não insira numeros negativos.");

                }
                //cadastro da turma
            }
            if (op == 4) {

                //ordena lista de turmas
                Collections.sort(s.getTurmas(), compT);

                //imprime notas de cada turma
                for (Turma t : s.getTurmas()){

                    t.medias();
                }
            }

            op = io.menu1();
        }
    }
}