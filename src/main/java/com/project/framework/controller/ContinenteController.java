/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.controller;

import com.project.framework.service.ContinenteService;
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
    
    @Autowired(required=true)
    @Qualifier("continenteService")
    private ContinenteService continenteService;
    
    @RequestMapping(value = "/footer", method = {RequestMethod.POST, RequestMethod.GET})
    public String listContinentes(Model m) {
        m.addAttribute("listContinentes", this.continenteService.getContinentes());
        return "framework/footer";
    }
}
