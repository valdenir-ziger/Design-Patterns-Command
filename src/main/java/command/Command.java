package command;

/**
 *
 * @author Valdenir
 */
public abstract class Command {
    public Pessoa pessoa;

    public Command(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    Boolean Gravar(){
        main.listaPessoa.add(pessoa);
        System.out.println("Gravado: " + pessoa.getTipo() + ": " + pessoa.getNome() + " com " + pessoa.getIdade().toString() + " anos." );
        return true;
    }
    
    Boolean Excluir(){
        main.listaPessoa.remove(pessoa);
        System.out.println(pessoa.getTipo() + ": " + pessoa.getNome() + " foi excluído com sucesso!");
        return true;
    }
    
    public Boolean RollBack(){
        return true;
    }
    
    public abstract boolean execute();
}
