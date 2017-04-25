package br.edu.ifpb.padroes.builder.main;

import br.edu.ifpb.padroes.builder.Usuario;
import br.edu.ifpb.padroes.builder.UsuarioBuilder;
import br.edu.ifpb.padroes.builder.UsuarioBuilderException;

/**
 * Created by diogomoreira on 20/07/16.
 */
public class Loader {

    public static void main(String[] args) throws UsuarioBuilderException {
        UsuarioBuilder usuario = new UsuarioBuilder();
//        builder.comIdade(27);
//        builder.comEndereco("Rua Etc, 212");
//        builder.comTelefone("9999-9999");

        usuario.comNome("Diogo").comSobrenome("Moreira").comIdade(27).comEndereco("Rua Etc").
                comTelefone("Etc").toUsuario();

        Usuario usuarioFinal = usuario.toUsuario();

        StringBuilder builder2 = new StringBuilder();
        builder2.append("Diogo").append(" ").append("Moreira");

    }
}
