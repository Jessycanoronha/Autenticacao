package persistencia;

import java.sql.*;
/**
 * Classe que realiza a Conexão com o banco de dados
 * @author rosenhaim
 */
public class Acesso {
    private static Acesso SINGLETON = null;
    String stringConexao = "jdbc:derby://localhost:1527/trabalho",
            usuario     = "root", 
            senha       ="root";
    
    private Acesso(){}
    public static Acesso getInstance(){
        if(SINGLETON == null)
            return new Acesso();
        return SINGLETON;
    }
   
    
    
    
    public Connection obterConexao() throws SQLException{
        Connection conexao;
        conexao = DriverManager.getConnection(stringConexao,
                usuario, senha);
        return conexao;
    }
    
    
}
