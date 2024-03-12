package com.generation.GestionApp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {


    //RequestMapping se usa para indicar la ruta y el tipo de solicitud
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String mostrarHome(){
        return "home";
    }

}
