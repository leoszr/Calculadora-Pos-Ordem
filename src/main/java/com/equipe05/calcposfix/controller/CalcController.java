package com.equipe05.calcposfix.controller;

import com.equipe05.calcposfix.model.Queue;
import com.equipe05.calcposfix.service.CalcPosFixService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalcController {

    private final CalcPosFixService calcService = new CalcPosFixService();

    // Mostra o formulário (GET /)
    @GetMapping("/")
    public String mostrarFormulario() {
        return "formulario"; // Nome da view HTML (formulario.html)
    }

    // Recebe a expressão (POST /calcular)
    @PostMapping("/calcular")
    public String calcularExpressao(@RequestParam("expressao") String expressao, Model model) {
        try {
            // Divide a expressão em tokens separados por espaço
            String[] tokens = expressao.trim().split("\\s+");
            Queue<String> fila = new Queue<>();
            for (String token : tokens) {
                fila.enqueue(token);
            }

            // Chama o serviço para calcular
            double resultado = calcService.calcularExpressaoPosfixa(fila);

            // Exibe o resultado
            model.addAttribute("resultado", resultado);
            model.addAttribute("expressao", expressao);
        } catch (Exception e) {
            // Exibe mensagem de erro
            model.addAttribute("erro", e.getMessage());
            model.addAttribute("expressao", expressao);
        }
        return "formulario"; // Retorna para a mesma view
    }
}
