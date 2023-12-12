import java.io.BufferedWriter;
import java.io.IOException;

public interface Salvavel {

    public abstract void salvarArquivo(BufferedWriter b) throws IOException;
}
