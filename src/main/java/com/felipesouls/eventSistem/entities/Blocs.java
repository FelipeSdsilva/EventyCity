package com.felipesouls.eventSistem.entities;

import java.time.Instant;

public class Blocs {

    private Integer id;
    private Instant beginer;
    private Instant ending;

    public Blocs() {
    }

    public Blocs(Integer id, Instant beginer, Instant ending) {
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
