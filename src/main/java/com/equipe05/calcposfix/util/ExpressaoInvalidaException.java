package com.equipe05.calcposfix.util;

// Exceção para expressão malformada/inválida
public class ExpressaoInvalidaException extends RuntimeException {
    public ExpressaoInvalidaException(String mensagem) {
        super(mensagem);
    }
}
