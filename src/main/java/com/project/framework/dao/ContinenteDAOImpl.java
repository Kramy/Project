/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.dao;

import com.project.framework.model.Continente;
import com.project.hibernate.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author rbt
 */
@Transactional
@Repository("continenteDAO")
public class ContinenteDAOImpl implements ContinenteDAO {
    
    @PersistenceContext
    public EntityManager entityManager;
    
    @Override
    @Transactional(readOnly=false)
    public void addContinente(Continente c) {
        entityManager.persist(c);
    }
    
    @Override
    @Transactional(readOnly=false)
    public void updateContinente(Continente c) {
        entityManager.merge(c);
    }
    
    @Override
    @Transactional(readOnly=true)
    public List<Continente> getContinentes() {
        List<Continente> continentesList = entityManager.createQuery("from Continente").getResultList();
        return continentesList;
    }
    
    @Override
    @Transactional(readOnly=true)
    public Continente getContinente(int id) {
        Continente c = (Continente) entityManager.find(Continente.class, id);
        return c;
    }
    
    @Override
    @Transactional(readOnly=false)
    public void deleteContinente(int id) {
        Continente c = (Continente) entityManager.find(Continente.class, id);
        if (null != c) {
            entityManager.remove(c);
        }
    }
}
