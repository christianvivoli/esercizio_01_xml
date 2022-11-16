package com.example;

import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Studenti {

    private String nome;
    @JacksonXmlElementWrapper(useWrapping = false)
    private ArrayList<Studente> studente = new ArrayList<>();

    public Studenti() {
    }

    public Studenti(String nome) {
        this.nome = nome;
    }

    public void aggiungi(Studente s){
        studente.add(s);
    }

    public ArrayList<Studente> getStudente() {
        return studente;
    }

    public void setLista(ArrayList<Studente> studente) {
        this.studente = studente;
    }
}
