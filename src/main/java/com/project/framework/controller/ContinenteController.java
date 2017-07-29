/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.controller;

import com.project.framework.model.Continente;
import com.project.framework.service.ContinenteService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author rbt
 */
@Controller
public class ContinenteController {
    
    private ContinenteService continenteService;
    
    @Autowired(required = true)
    @Qualifier(value = "continenteService")
    public void setContinenteService(ContinenteService cs) {
        this.continenteService = cs;
    }
    
    @RequestMapping(value = "/footer", method = RequestMethod.GET)
    public String listContinentes(Model m) {
//        List<Continente> listContinente = new ArrayList<Continente>();
//        Continente c1 = new Continente(1, "europa");
//        Continente c2 = new Continente(2, "america");
//        listContinente.add(c1);
//        listContinente.add(c2);
//        m.addAttribute("listContinentes", listContinente);
        m.addAttribute("listContinentes", this.continenteService.listContinentes());
        return "framework/footer";
    }
}
