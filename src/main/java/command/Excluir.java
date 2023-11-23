package command;

/**
 *
 * @author Valdenir
 */
public class Excluir extends Command {

    public Excluir(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public boolean execute() {
        if(!main.listaPessoa.isEmpty()){
            for (Pessoa pessoaGravada : main.listaPessoa) {
                if(pessoaGravada.getId().equals(pessoa.getId())){
                    return super.Excluir();
                }
            }
        }
        
        return false;
    }
}
