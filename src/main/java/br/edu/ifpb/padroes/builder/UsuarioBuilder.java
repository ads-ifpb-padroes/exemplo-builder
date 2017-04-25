package br.edu.ifpb.padroes.builder;

/**
 * Created by diogomoreira on 20/07/16.
 */
public class UsuarioBuilder {

    private String nome;
    private String sobrenome;
    private Integer idade;
    private String telefone;
    private String endereco;

    public UsuarioBuilder() {
    }

    public UsuarioBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }

    public UsuarioBuilder comSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
        return this;
    }

    public UsuarioBuilder comIdade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public UsuarioBuilder comTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    public UsuarioBuilder comEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public Usuario toUsuario() throws UsuarioBuilderException {
        validarUsuario();
        return new Usuario(nome, sobrenome, idade, telefone, endereco);
    }

    private void validarUsuario() throws UsuarioBuilderException {

        if(nome == null || nome.isEmpty()) {
            throw new UsuarioBuilderException();
        }
        if(sobrenome == null || sobrenome.isEmpty()) {
            throw new UsuarioBuilderException();
        }
        if(idade < 18)
            throw new UsuarioBuilderException();
    }
}
