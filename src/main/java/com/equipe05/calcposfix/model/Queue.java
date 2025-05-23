package com.equipe05.calcposfix.model;


public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Adiciona um elemento ao final da fila
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Remove e retorna o elemento do início da fila
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    // Retorna o elemento do início da fila sem remover
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia");
        }
        return front.data;
    }

    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return front == null;
    }

    // Retorna o tamanho da fila
    public int size() {
        return size;
    }
}
