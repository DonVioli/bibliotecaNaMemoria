package br.com.donvioli.biblioteca.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BibliotecaController {

	@RequestMapping("/")
	@ResponseBody
	public String certo() {
		return "Até aqui tudo certo";
	}

}
