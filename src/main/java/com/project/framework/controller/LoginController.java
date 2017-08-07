/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.controller;

import com.project.framework.model.Cuenta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Rafael Benavides
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String setLogIn(ModelMap model) {
        model.addAttribute("logon", new Cuenta());
        return "framework/login";
    }
}
