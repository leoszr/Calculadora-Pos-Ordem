package com.equipe05.calcposfix.service;

import com.equipe05.calcposfix.model.Queue;
import com.equipe05.calcposfix.model.Stack;

public class CalcPosFixService {

    public double calcularExpressaoPosfixa(Queue<String> fila) {
        Stack<Double> pilha = new Stack<>();

        while (!fila.isEmpty()) {
            String token = fila.dequeue();

            if (isNumero(token)) {
                pilha.push(Double.parseDouble(token));
            } else if (isOperador(token)) {
                if (pilha.size() < 2) {
                    throw new IllegalArgumentException("Expressão inválida: operandos insuficientes.");
                }
                double b = pilha.pop();
                double a = pilha.pop();
                double resultado = aplicarOperador(a, b, token);
                pilha.push(resultado);
            } else {
                throw new IllegalArgumentException("Token inválido: " + token);
            }
        }

        if (pilha.size() != 1) {
            throw new IllegalArgumentException("Expressão inválida: sobram operandos.");
        }

        return pilha.pop();
    }

    private boolean isNumero(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private boolean isOperador(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    private double aplicarOperador(double a, double b, String operador) {
        switch (operador) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Divisão por zero.");
                return a / b;
            default: throw new IllegalArgumentException("Operador desconhecido: " + operador);
        }
    }
}
