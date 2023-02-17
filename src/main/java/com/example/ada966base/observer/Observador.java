package com.example.ada966base.observer;

public class Observador implements Observer {

    private Protocolo protocolo;
    public String name;

    public Observador(Protocolo protocolo, String name) {
        this.protocolo = protocolo;
        this.name = name;
    }

    @Override  public void atualizar() {
        String mensagem = protocolo.getMensagem(this);
        if (mensagem == null )
            System.out.println("[MSG] Não há mensagens");
        else
            System.out.println("[" + this.name + "] OK : [MSG] :" + mensagem );
    }

    @Override public void setProtocolo(Protocolo protocolo) {
        this.protocolo = protocolo;
    }

}


