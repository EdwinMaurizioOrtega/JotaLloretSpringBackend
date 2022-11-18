package com.bezkoder.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "arbol")
public class Arbol {
    @Id
    private String id;

    private int contador;

    //Super super inportante
    public Arbol(){

    }

    public Arbol(int contador) {
        this.contador = contador;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "id='" + id + '\'' +
                ", contador='" + contador + '\'' +
                '}';
    }
}
