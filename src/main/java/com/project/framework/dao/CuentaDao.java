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
public interface CuentaDao {

    public void addCuenta(Cuenta c);

    public void updateCuenta(Cuenta c);

    public List<Cuenta> getCuentas();

    public Cuenta getCuenta(int id);

    public void deleteCuenta(int id);
}
