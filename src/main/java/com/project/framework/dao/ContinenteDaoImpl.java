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
public class ContinenteDaoImpl extends AbstractDao implements ContinenteDao {

    @Override
    public void addContinente(Continente continente) {
        getSession().save(continente);
    }

    @Override
    public void updateContinente(Continente continente) {
        getSession().update(continente);
    }

    @Override
    public List<Continente> getContinentes() {
        List<Continente> continentes = getSession().createQuery("from Continente").list();
        return continentes;
    }
    
    @Override
    public List<Continente> getContinentesConIdioma() {
        List<Continente> continentes = getSession().createQuery("from Continente").list();
        for (Continente continente : continentes) {
            Hibernate.initialize(continente.getIdiomas());
        }
        return continentes;
    }

    @Override
    public Continente getContinente(int id) {
        Continente continente = (Continente) getSession().get(Continente.class, id);
        return continente;
    }

    @Override
    public void deleteContinente(int id) {
        Continente continente = (Continente) getSession().get(Continente.class, id);
        if (null != continente) {
            getSession().delete(continente);
        }
    }
}
