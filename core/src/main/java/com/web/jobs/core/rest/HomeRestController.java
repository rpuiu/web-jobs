package com.web.jobs.core.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeRestController {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Instance fields 
    //~ ----------------------------------------------------------------------------------------------------------------

    @GetMapping({"/", "index"})
    public String getIndex(Model model) {
        return "index";
    }

    @GetMapping("secured")
    public String secured() {
        return "secured";
    }

}
