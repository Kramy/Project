/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.dao;

import com.project.framework.model.Idioma;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rafael Benavides
 */
@Repository
public class IdiomaDAOImpl extends AbstractDAO implements IdiomaDAO {
    
    @Override
    public void addIdioma(Idioma i) {
        getSession().saveOrUpdate(i);
    }
    
    @Override
    public void updateIdioma(Idioma i) {
        getSession().update(i);
    }
    
    @Override
    public List<Idioma> getIdiomas() {
        List<Idioma> listContinenets = getSession().createQuery("from Idioma").list();
        return listContinenets;
    }
    
    @Override
    public Idioma getIdioma(int id) {
        Idioma i = (Idioma) getSession().get(Idioma.class, id);
        return i;
    }
    
    @Override
    public void deleteIdioma(int id) {
        Idioma i = (Idioma) getSession().get(Idioma.class, id);
        if (null != i) {
            getSession().delete(i);
        }
    }
}
