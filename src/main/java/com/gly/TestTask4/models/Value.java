package com.gly.TestTask4.models;

import jdk.nashorn.internal.objects.annotations.Setter;
import jdk.nashorn.internal.objects.annotations.Getter;

import javax.persistence.*;

@Entity
@Table (name = "value")
public class Value {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column (name = "v")
    private Float v;

    public Value() {
    }

    public Value(Float v) {
        this.v = v;
    }

    @Getter
    public Long getId() {
        return id;
    }

    @Getter
    public Float getV() {
        return v;
    }

    @Setter
    public void setId(Long id) {
        this.id = id;
    }

    @Setter
    public void setV(Float v) {
        this.v = v;
    }
}
