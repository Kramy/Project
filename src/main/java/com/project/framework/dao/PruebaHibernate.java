/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.dao;

import com.project.framework.model.Continente;
import com.project.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Rafael Benavides
 */
public class PruebaHibernate {
    public static void main(String args[]) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            String sql = ""
                    + "select * "
                    + "from continente "
                    + "";
            System.out.println(session.createSQLQuery(sql).list().size());
            
            String hql = ""
                    + "from Continente c"
                    + "";
            System.out.println(hql);
            Query query = session.createQuery(hql);
            Continente continente = (Continente) query.list().get(0);
            System.out.println(continente.getTexto());
//            Continente continente = (Continente) session.get(Continente.class, 1);
            System.out.println(continente.getTexto());
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.SESSION_FACTORY.close();
        }
    }
}
