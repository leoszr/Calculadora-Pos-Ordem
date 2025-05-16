package com.equipe05.calculadora.posfixa.controller;

import com.equipe05.calculadora.posfixa.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    // Página inicial com o formulário
    @GetMapping("/")
    public String index() {
        return "index";  // retorna o template index.html
    }

    // Recebe a expressão via POST do formulário
    @PostMapping("/calcular")
    public String calcularExpressao(@RequestParam("expressao") String expressao, Model model) {
        try {
            double resultado = calculadoraService.calcularExpressao(expressao);
            model.addAttribute("resultado", resultado);
            model.addAttribute("expressao", expressao);
        } catch (Exception e) {
            model.addAttribute("erro", e.getMessage());
        }
        return "index";
    }
}
