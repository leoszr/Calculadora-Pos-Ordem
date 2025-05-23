package com.equipe05.calcposfix.model;

// Classe Node para representar um nó na fila
public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}