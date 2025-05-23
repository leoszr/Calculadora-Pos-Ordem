package com.equipe05.calcposfix.model;

public class Stack<T> {
    private Node<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    // Adiciona um elemento ao topo da pilha
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Remove e retorna o elemento do topo da pilha
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Retorna o elemento do topo sem remover
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return top.data;
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return top == null;
    }

    // Retorna o tamanho da pilha
    public int size() {
        return size;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
