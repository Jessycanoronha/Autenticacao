package persistencia;
import java.sql.*;
import comuns.Aluno;
public class AlunoDAO {
    Acesso acesso;
    PreparedStatement ps;
    String comandoSQL = "";
    
    public AlunoDAO(){
        acesso = Acesso.getInstance();
    }
    public void autenticar(Aluno aluno) {
    }
    public void incluir(Aluno aluno) 
            throws SQLException{
        comandoSQL = "INSERT INTO ROOT.ALUNO "
                + "(NOME,MATRICULA) " +
"      VALUES (?,?)";
    ps = acesso.obterConexao().
            prepareStatement(comandoSQL);
    ps.setString(1, aluno.getNome());
    ps.setString(2, aluno.getMatricula());
    ps.executeUpdate();
    ps.close();
    
}

}