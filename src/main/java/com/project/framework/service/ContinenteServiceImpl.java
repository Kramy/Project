/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.service;

import com.project.framework.model.Continente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.project.framework.dao.ContinenteDao;

/**
 *
 * @author rbt
 */
@Service
@Transactional
public class ContinenteServiceImpl implements ContinenteService {

    @Autowired
    private ContinenteDao continenteDao;

    @Override
    public void addContinente(Continente c) {
        this.continenteDao.addContinente(c);
    }

    @Override
    public void updateContinente(Continente c) {
        this.continenteDao.updateContinente(c);
    }

    @Override
    public List<Continente> getContinentes() {
        return this.continenteDao.getContinentes();
    }

    @Override
    public List<Continente> getContinentesConIdioma() {
        return this.continenteDao.getContinentesConIdioma();
    }

    @Override
    public Continente getContinente(int id) {
        return this.continenteDao.getContinente(id);
    }

    @Override
    public void deleteContinente(int id) {
        this.continenteDao.deleteContinente(id);
    }
}
