//Classe utilizada para testar a aplicação
package psv;

import java.sql.*;
import java.util.*;

public class TestaCarro {

    public static void main(String[] args) {

        Connection con = Conexao.abrirConexao();

        //Instanciando o CarroBean e CarroDAO
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);

        //Inserindo valores na tabela
        cb.setPlaca("QJA6253");
        cb.setCor("Cinza");
        cb.setDescricao("Gol");

        //Executar o comando de insert
        System.out.println(cd.inserirCarro(cb));

    }
}
