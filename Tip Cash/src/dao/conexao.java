package dao;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    public static Connection con;

    public boolean conecta(String local, String banco, String usuario, String senha) {
        boolean retorno = false;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + local + "/" + banco, usuario, senha);
            retorno = true;
        } catch (ClassNotFoundException e) {
            System.err.println("Erro de conexão:\n" + e);
        } catch (SQLException e) {
            System.err.println("Erro de conexão:\n" + e);
        }
        return retorno;
    }

    public boolean insere() {
        boolean retorno = false;
         try {
    java.sql.PreparedStatement stmt = (java.sql.PreparedStatement) conexao.con.prepareStatement("insert into usuario(nome,senha) values('carlos','18124');");
        stmt.execute();
        stmt.close();
   retorno = true;
    } catch (SQLException ex) {
    System.err.println("Erro INSERT: " + ex);
    }

    return retorno ;
}

}