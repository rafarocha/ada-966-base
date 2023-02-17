package com.example.ada966base.observer;

public interface Protocolo {

    public Protocolo registrar(Observer observer);
    public Protocolo esquecer(Observer observer);

    public void notificar();

    public String getUpdate(Observer observer);
    public void publicar(String mensagem);

}