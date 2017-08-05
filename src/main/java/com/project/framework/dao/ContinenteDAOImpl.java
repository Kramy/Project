/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.dao;

import com.project.framework.model.Continente;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rbt
 */
@Repository
public class ContinenteDAOImpl extends AbstractDAO implements ContinenteDAO {
    
    @Override
    public void addContinente(Continente c) {
        getSession().persist(c);
    }
    
    @Override
    public void updateContinente(Continente c) {
        getSession().update(c);
    }
    
    @Override
    public List<Continente> getContinentes() {
        return getSession().createQuery("from Continente").list();
    }
    
    @Override
    public Continente getContinente(int id) {
        return getSession().load(Continente.class, id);
    }
    
    @Override
    public void deleteContinente(int id) {
        Continente c = (Continente) getSession().load(Continente.class, id);
        if (null != c) {
            getSession().delete(c);
        }
    }
}
