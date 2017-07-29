/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.service;

import com.project.framework.model.Continente;
import java.util.List;

/**
 *
 * @author rbt
 */
public interface ContinenteService {
    
    public void addContinente(Continente c);
    public void updateContinente(Continente c);
    public List<Continente> listContinentes();
    public Continente getContinenteById(int id);
    public void removeContinente(int id);
}
