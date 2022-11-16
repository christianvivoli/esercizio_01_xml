package com.example;


public class Studente {
    private int id;
    private String nome,cognome;
    private String datanascita;
    private int votoesame;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public String getDatanascita() {
        return datanascita;
    }
    public void setDatanascita(String datanascita) {
        this.datanascita = datanascita;
    }
    public int getVotoesame() {
        return votoesame;
    }
    public void setVotoesame(int votoesame) {
        this.votoesame = votoesame;
    }
    public Studente() {

    }
    public Studente(int id, String nome, String cognome, String datanascita, int votoesame) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.datanascita = datanascita;
        this.votoesame = votoesame;
    }

    
    
}
