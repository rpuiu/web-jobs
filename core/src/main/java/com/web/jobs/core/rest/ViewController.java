package com.web.jobs.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class ViewController {
    private String appmode;

    @Autowired
    public ViewController(Environment env) {
        this.appmode = env.getProperty("app-mode");
    }

    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "admin");
        model.addAttribute("mode", appmode);
        return "index";
    }

}
