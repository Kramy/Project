/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.dao;

import com.project.framework.model.Cuenta;
import java.util.List;

/**
 *
 * @author Rafael Benavides
 */
public class CuentaDaoImpl extends AbstractDao implements CuentaDao {

    @Override
    public void addCuenta(Cuenta cuenta) {
        getSession().save(cuenta);
    }

    @Override
    public void updateCuenta(Cuenta cuenta) {
        getSession().update(cuenta);
    }

    @Override
    public List<Cuenta> getCuentas() {
        List<Cuenta> cuentas = getSession().createQuery("from Cuenta").list();
        return cuentas;
    }

    @Override
    public Cuenta getCuenta(int id) {
        Cuenta cuenta = (Cuenta) getSession().get(Cuenta.class, id);
        return cuenta;
    }

    @Override
    public void deleteCuenta(int id) {
        Cuenta cuenta = (Cuenta) getSession().get(Cuenta.class, id);
        if (null != cuenta) {
            getSession().delete(cuenta);
        }
    }
}
