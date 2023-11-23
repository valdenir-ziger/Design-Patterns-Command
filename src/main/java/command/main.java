package command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Valdenir
 */
public class main {
    
    public static List<Pessoa> listaPessoa = new ArrayList<>();
    
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor(0, "Valdenir", 15, "Monitor");
        Monitor monitor2 = new Monitor(1, "Monitor 1", 20, "Monitor");
        Aluno aluno1     = new Aluno(2, "Aluno 1", 25, "Aluno");
        Aluno aluno2     = new Aluno(3, "Aluno 2", 25, "Aluno");
        
        Gravar gravar = new Gravar(monitor1);
        gravar.execute();
        
        Gravar gravar1 = new Gravar(monitor2);
        gravar1.execute();
        
        Gravar gravar2 = new Gravar(aluno1);
        gravar2.execute();
        
        Gravar gravar3 = new Gravar(aluno2);
        gravar3.execute();
        
        Excluir excluir = new Excluir(aluno1);
        excluir.execute();
    }
}
