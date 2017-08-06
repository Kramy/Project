/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.service;

import com.project.framework.dao.IdiomaDAO;
import com.project.framework.model.Idioma;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Rafael Benavides
 */
@Service
@Transactional
public class IdiomaServiceImpl implements IdiomaService {
    
    @Autowired
    private IdiomaDAO idiomaDAO;
    
    @Override
    public void addIdioma(Idioma i) {
        this.idiomaDAO.addIdioma(i);
    }
    
    @Override
    public void updateIdioma(Idioma i) {
        this.idiomaDAO.updateIdioma(i);
    }
    
    @Override
    public List<Idioma> getIdiomas() {
        return this.idiomaDAO.getIdiomas();
    }
    
    @Override
    public Idioma getIdioma(int id) {
        return this.idiomaDAO.getIdioma(id);
    }
    
    @Override
    public void deleteIdioma(int id) {
        this.idiomaDAO.deleteIdioma(id);
    }
}
