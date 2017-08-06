/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.dao;

import com.project.framework.model.Continente;
import java.util.List;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rbt
 */
@Repository
public class ContinenteDAOImpl extends AbstractDAO implements ContinenteDAO {
    
    @Override
    public void addContinente(Continente c) {
        getSession().save(c);
    }
    
    @Override
    public void updateContinente(Continente c) {
        getSession().update(c);
    }
    
    @Override
    public List<Continente> getContinentes() {
        List<Continente> continentes = getSession().createQuery("from Continente").list();
        for (Continente continente: continentes) {
            Hibernate.initialize(continente.getIdiomas());
        }
        return continentes;
    }
    
    @Override
    public Continente getContinente(int id) {
        Continente c = (Continente) getSession().get(Continente.class, id);
        return c;
    }
    
    @Override
    public void deleteContinente(int id) {
        Continente c = (Continente) getSession().get(Continente.class, id);
        if (null != c) {
            getSession().delete(c);
        }
    }
}
