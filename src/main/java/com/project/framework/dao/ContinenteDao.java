/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.dao;

import com.project.framework.model.Continente;
import java.util.List;

/**
 *
 * @author rbt
 */
public interface ContinenteDao {

    public void addContinente(Continente continente);

    public void updateContinente(Continente continente);

    public List<Continente> getContinentes();

    public List<Continente> getContinentesConIdioma();

    public Continente getContinente(int id);

    public void deleteContinente(int id);
}
