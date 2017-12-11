/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import comuns.Ocorrencia;
import persistencia.OcorrenciaDAO;

/**
 *
 * @author Jessyca
 */
public class OcorrenciaFacade {
    OcorrenciaDAO dao;
    
    public OcorrenciaFacade(){
        dao = new OcorrenciaDAO();
    
    
    }
    
    public void autenticar(Ocorrencia ocorrencia){
        dao.autenticar(ocorrencia);
    }
    
    
   public void adicionar(Ocorrencia ocorrencia) {
       dao.adicionar(ocorrencia);
    
    }
    
}
