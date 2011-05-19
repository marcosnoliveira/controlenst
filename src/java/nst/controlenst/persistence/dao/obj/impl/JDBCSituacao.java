/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nst.controlenst.persistence.dao.obj.impl;

import java.util.List;
import nst.controlenst.model.entity.Situacao;
import nst.controlenst.persistence.dao.factory.interfaces.SituacaoDAO;

/**
 *
 * @author pablosouza
 */
public class JDBCSituacao implements SituacaoDAO{
    
    private static JDBCSituacao instancia = null;
    
    private JDBCSituacao(){
        
    }
    
    public static JDBCSituacao getInstance(){
        if(instancia == null){
            instancia = new JDBCSituacao();
        }
        
        return instancia;
    }

    @Override
    public void delete(Situacao situacao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Situacao getByPrimaryKey(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void save(Situacao situacao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
