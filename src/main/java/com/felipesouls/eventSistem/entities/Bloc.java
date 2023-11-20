package com.felipesouls.eventSistem.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_bloc")
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant begin;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant ending;

    @ManyToOne
    @JoinColumn(name = "id_activity")
    private Activity activity;

    public Bloc() {
    }

    public Bloc(Integer id, Instant begin, Instant ending, Activity activity) {
        this.id = id;
        this.begin = begin;
        this.ending = ending;
        this.activity = activity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getBegin() {
        return begin;
    }

    public void setBegin(Instant begin) {
        this.begin = begin;
    }

    public Instant getEnding() {
        return ending;
    }

    public void setEnding(Instant ending) {
        this.ending = ending;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bloc bloc)) return false;

        return getId() != null ? getId().equals(bloc.getId()) : bloc.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
