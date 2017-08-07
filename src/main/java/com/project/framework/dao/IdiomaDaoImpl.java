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
public class IdiomaDaoImpl extends AbstractDao implements IdiomaDao {
    
    @Override
    public void addIdioma(Idioma idioma) {
        getSession().saveOrUpdate(idioma);
    }
    
    @Override
    public void updateIdioma(Idioma idioma) {
        getSession().update(idioma);
    }
    
    @Override
    public List<Idioma> getIdiomas() {
        List<Idioma> idiomas = getSession().createQuery("from Idioma").list();
        return idiomas;
    }
    
    @Override
    public Idioma getIdioma(int id) {
        Idioma idioma = (Idioma) getSession().get(Idioma.class, id);
        return idioma;
    }
    
    @Override
    public void deleteIdioma(int id) {
        Idioma idioma = (Idioma) getSession().get(Idioma.class, id);
        if (null != idioma) {
            getSession().delete(idioma);
        }
    }
}
