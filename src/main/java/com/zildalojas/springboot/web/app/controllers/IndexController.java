package com.zildalojas.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zildalojas.springboot.web.app.model.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

  @GetMapping({ "/index", "", "/", "/home" })
  public String index(final Model model) {
    model.addAttribute("titulo", "Zilda Moda");

    return "index";
  }

  @RequestMapping("/perfil")
  public String perfil(final Model model) {
    final Usuario usuario = new Usuario();
    usuario.setNombre("Fernando");
    usuario.setApellidos("Paiva");
    usuario.setTelefono(123456789);
    usuario.setDocumento("y6282648m");
    usuario.setEmail("fernandopaivap7@gmail.com");
    usuario.setPassword("1234567GG!");
    usuario.setAdmin(0);

    model.addAttribute("usuario", usuario);
    model.addAttribute("titulo", "Registro de usuario: ".concat(usuario.getNombre()));
    return "perfil";
  }

  @RequestMapping("/listar")
  public String listar(final Model model) {
    model.addAttribute("titulo", "Listado de usuarios");

    return "listar";

  }

  @ModelAttribute("usuarios")
  public List<Usuario> poblarUsuarios() {
    final List<Usuario> usuarios = Arrays.asList(
      new Usuario("Fernando", "Paiva", 123456789, "y6282648m", "fernandopaivap7@gmail.com",
        "1234567GG!", 0),
      new Usuario("Dani", "Paradela", 123456789, "4382648Z", "daniparadela@gmail.com", "1234567DD!",
        0),
      new Usuario("Fabiano", "Paiva", 123456789, "x6282648g", "fabianopaivap7@gmail.com",
        "1234567FF!", 0),
      new Usuario("Luccas", "Ferreira", 123456789, "x6282648g", "luccasferreira7@gmail.com",
        "1234567LL!", 0));

    return usuarios;

  }

}
