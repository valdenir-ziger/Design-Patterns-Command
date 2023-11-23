package command;

/**
 *
 * @author Valdenir
 */
public class Gravar extends Command {

    public Gravar(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public boolean execute() {
        if(!main.listaPessoa.isEmpty()){
            for (Pessoa pessoaGravada : main.listaPessoa) {
                if(pessoaGravada.getId().equals(super.pessoa.getId())){
                    return false;
                }
            }
        }
        
        return super.Gravar();
    }
    
}
