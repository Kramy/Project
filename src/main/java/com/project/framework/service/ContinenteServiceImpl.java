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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rbt
 */
@Service
public class ContinenteServiceImpl implements ContinenteService {
    
    @Autowired
    private ContinenteDAO continenteDAO;
    
    public void setContinenteDAO(ContinenteDAO continenteDAO) {
        this.continenteDAO = continenteDAO;
    }
    
    @Override
    @Transactional
    public void addContinente(Continente c) {
        this.continenteDAO.addContinente(c);
    }
    
    @Override
    @Transactional
    public void updateContinente(Continente c) {
        this.continenteDAO.updateContinente(c);
    }
    
    @Override
    @Transactional
    public List<Continente> listContinentes() {
        return this.continenteDAO.listContinentes();
    }
    
    @Override
    @Transactional
    public Continente getContinenteById(int id) {
        return this.continenteDAO.getContinenteById(id);
    }
    
    @Override
    @Transactional
    public void removeContinente(int id) {
        this.continenteDAO.removeContinente(id);
    }
}
