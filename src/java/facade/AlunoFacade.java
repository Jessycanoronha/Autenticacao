package facade;

import comuns.Aluno;
import java.sql.SQLException;
import persistencia.AlunoDAO;



public class AlunoFacade {

    AlunoDAO alunoDAO;
    
    public AlunoFacade(){
        alunoDAO = new AlunoDAO();
    }
    
    
    public void autenticar(Aluno aluno) {
        alunoDAO.autenticar(aluno);
    
    }

    public void incluir(Aluno aluno) throws SQLException{
        
    alunoDAO.incluir(aluno);
    }
    
}
