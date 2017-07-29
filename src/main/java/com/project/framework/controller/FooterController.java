/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.controller;

import com.project.framework.dao.ContinenteDAOImpl;
import com.project.framework.model.Continente;
import com.project.framework.service.ContinenteService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Rafael Benavides
 */

@Controller
public class FooterController {
    
//    @RequestMapping(value = "/footer", method = {RequestMethod.GET, RequestMethod.POST})
//    public String setFooter(ModelMap m) {
//        return "framework/footer";
//    }
}
