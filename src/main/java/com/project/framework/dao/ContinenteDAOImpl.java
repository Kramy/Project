/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.dao;

import com.project.framework.model.Continente;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rbt
 */
@Repository
public class ContinenteDAOImpl implements ContinenteDAO {
    
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
    
    @Override
    public void addContinente(Continente c) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(c);
    }
    
    @Override
    public void updateContinente(Continente c) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(c);
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public List<Continente> listContinentes() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Continente> continentesList = session.createQuery("from Continente").list();
        return continentesList;
    }
    
    @Override
    public Continente getContinenteById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Continente c = (Continente) session.load(Continente.class, id);
        return c;
    }
    
    @Override
    public void removeContinente(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Continente c = (Continente) session.load(Continente.class, id);
        if (null != c) {
            session.delete(c);
        }
    }
}
