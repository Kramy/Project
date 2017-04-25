/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.controller;

import com.project.framework.model.Cuenta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Rafael Benavides
 */

@Controller
@SessionAttributes("cuenta")
public class FrameworkController {
    
    @RequestMapping(value = "/framework" ,method = RequestMethod.GET)
    public String setFramework() {
        return "framework/framework";
    }
    
    @RequestMapping(value = "/framework", method = RequestMethod.POST)
    public String logIn(@ModelAttribute("logon") Cuenta c, ModelMap model) {
        model.addAttribute("email", c.getEmail());
        model.addAttribute("seudonimo", c.getEmail());
        model.addAttribute("contrasena", c.getContrasena());
        model.addAttribute("cuenta", 1);
        return "framework/framework";
    }
}
