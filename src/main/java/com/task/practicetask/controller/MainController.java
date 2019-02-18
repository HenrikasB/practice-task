package com.task.practicetask.controller;

import com.task.practicetask.module.User;
import com.task.practicetask.service.MainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    private MainService mainService;

    public MainController(MainService mainService){
        this.mainService = mainService;
    }

    @RequestMapping(value= "/home", method = RequestMethod.GET)
    public String openHomePage(Model model){
        // so here i create empty 'user' object
        // also, i read the information from form.
        model.addAttribute("user", new User());
        return "messageForServerPage";
    }

    @RequestMapping(value = "/home", method = RequestMethod.POST)
    public String loadField(@ModelAttribute User user) {
        // here i pass
        mainService.printInfo(user);
        return "messageForServerPage";
    }
}
