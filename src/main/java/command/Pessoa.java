package command;

/**
 *
 * @author Valdenir
 */
public class Pessoa {
    private Integer id;
    private String nome;
    private Integer idade;
    private String tipo;

    public Pessoa(Integer id, String nome, Integer idade, String tipo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public Pessoa() {}
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
