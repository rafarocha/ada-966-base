package com.example.ada966base.observer;

import java.util.ArrayList;
import java.util.List;

public class ProtocoloImpl implements Protocolo {

    private List<Observer> observers;
    private String mensagem;
    private boolean mudou;

    public ProtocoloImpl() {
        this.observers = new ArrayList<>();
    }

    @Override
    public Protocolo registrar(Observer observer) {
        if (observer == null) throw new RuntimeException();
        this.observers.add( observer );
        return this;
    }

    @Override
    public Protocolo esquecer(Observer observer) {
        this.observers.remove(observer);
        return this;
    }

    @Override
    public void notificar() {
        if (!mudou) return;
        this.observers.stream()
            .forEach( o -> o.atualizar() );
        this.mudou = false;
    }

    @Override
    public String getMensagem(Observer observer) {
        return this.mensagem;
    }

    @Override
    public void publicar(String mensagem) {
        this.mensagem = mensagem;
        this.mudou = true;
        this.notificar();
    }
}