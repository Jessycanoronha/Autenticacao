/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import comuns.Ocorrencia;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jessyca
 */
public class OcorrenciaDAO {
    Acesso acesso;
    PreparedStatement ps;
    String comandoSQL = "";
    
    public OcorrenciaDAO(){
        acesso = Acesso.getInstance();
    
}

   

    public void autenticar(Ocorrencia ocorrencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

     public void adicionar(Ocorrencia ocorrencia)throws SQLException{
        comandoSQL = "INSERT INTO ROOT.ALUNO "
                + "(OCORRENCIA) " +
"      VALUES (?,?)";
    ps = acesso.obterConexao().
            prepareStatement(comandoSQL);
    
    ps.setString(2, ocorrencia.getOcorrencia());
    ps.executeUpdate();
    ps.close();
    
}
}