import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ManipularTxt {

    public void gravarTxt(String nomeArquivo, ArrayList conteudo) throws IOException {

        Path caminho = Paths.get(nomeArquivo + ".txt");
        Files.write(caminho,conteudo, StandardCharsets.UTF_8);


    }
}
