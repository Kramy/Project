/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.controller;

import com.project.framework.model.Continente;
import com.project.framework.model.Cuenta;
import com.project.framework.model.Idioma;
import com.project.framework.service.ContinenteService;
import com.project.framework.service.IdiomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Rafael Benavides
 */

@Controller
@SessionAttributes("cuenta")
public class FrameworkController {
    
    @Autowired
    ContinenteService continenteService;
    
    @Autowired
    IdiomaService idiomaService;
    
    @GetMapping("/framework")
    public String setFramework() {
        return "framework/framework";
    }
    
    @PostMapping("/framework")
    public String logIn(@ModelAttribute("logon") Cuenta c, ModelMap m) {
        Continente continente = continenteService.getContinente(1);
        Idioma idioma = idiomaService.getIdioma(1);
        
        m.addAttribute("email", c.getEmail());
        m.addAttribute("seudonimo", continente.getTexto());
        m.addAttribute("contrasena", idioma.getTexto());
        m.addAttribute("cuenta", 1);
        return "framework/framework";
    }
}
