/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.service;

import com.project.framework.dao.ContinenteDAO;
import com.project.framework.model.Continente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rbt
 */
@Service
@Transactional
public class ContinenteServiceImpl implements ContinenteService {
    
    @Autowired
    private ContinenteDAO continenteDAO;
    
    @Override
    public void addContinente(Continente c) {
        this.continenteDAO.addContinente(c);
    }
    
    @Override
    public void updateContinente(Continente c) {
        this.continenteDAO.updateContinente(c);
    }
    
    @Override
    public List<Continente> getContinentes() {
        return this.continenteDAO.getContinentes();
    }
    
    @Override
    public Continente getContinente(int id) {
        return this.continenteDAO.getContinente(id);
    }
    
    @Override
    public void deleteContinente(int id) {
        this.continenteDAO.deleteContinente(id);
    }
}
