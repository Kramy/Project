/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.controller;

import com.project.framework.model.Cuenta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Rafael Benavides
 */
@Controller
public class RegistroController {

    @RequestMapping(value = "/registro", method = RequestMethod.GET)
    public String setRegistro(ModelMap model) {
        model.addAttribute("registro", new Cuenta());
        return "framework/registro";
    }
}
