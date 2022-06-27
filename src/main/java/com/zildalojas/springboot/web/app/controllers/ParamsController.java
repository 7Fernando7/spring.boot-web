package com.zildalojas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ParamsController {

  @GetMapping("/string")
  public String param(@RequestParam(name = "texto", required = false,
      defaultValue = "Algún valor...") final String texto,
    final Model model) {
    model.addAttribute("resultado", "El texto enviado es: " + texto);

    return "params/ver";
  }

}
