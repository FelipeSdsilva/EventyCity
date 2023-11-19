package com.felipesouls.eventSistem.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_bloc")
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Instant beginer;
    private Instant ending;

    public Bloc() {
    }

    public Bloc(Integer id, Instant beginer, Instant ending) {
        this.id = id;
        this.beginer = beginer;
        this.ending = ending;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getBeginer() {
        return beginer;
    }

    public void setBeginer(Instant beginer) {
        this.beginer = beginer;
    }

    public Instant getEnding() {
        return ending;
    }

    public void setEnding(Instant ending) {
        this.ending = ending;
    }
}
