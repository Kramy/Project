/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.service;

import com.project.framework.model.Idioma;
import java.util.List;

/**
 *
 * @author Rafael Benavides
 */
public interface IdiomaService {
    
    public void addIdioma(Idioma i);
    public void updateIdioma(Idioma i);
    public List<Idioma> getIdiomas();
    public Idioma getIdioma(int id);
    public void deleteIdioma(int id);
}
