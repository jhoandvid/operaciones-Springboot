package com.springboot.operacion2.app.controllers;

import com.springboot.operacion2.app.services.IOperacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @Autowired
    private IOperacion operacion;
    @GetMapping({"","/","index"})

 public String index(Model model){

      model.addAttribute("Objeto","la suma es:"+operacion.operacion());
      model.addAttribute("Objeto1","la resta es:"+operacion.operacion1());
      model.addAttribute("Objeto2","la multiplicacion es:"+operacion.operacion2());
      model.addAttribute("Objeto3","la division es:"+operacion.operacion3());
       return "index";



    }

}
