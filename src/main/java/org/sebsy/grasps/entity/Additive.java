package org.sebsy.grasps.entity;

import jakarta.persistence.*;

import javax.persistence.*;

@Entity
public class Additive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255, unique = true)
    private String name;

    public Additive(String name) {
        this.name = name;
    }

    public Additive() {

    }
}
