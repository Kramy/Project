/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Rafael Benavides
 */

@Controller
public class LogoutController {
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logOut(HttpSession session) {
        session.invalidate();
        return "framework/framework";
    }
}
