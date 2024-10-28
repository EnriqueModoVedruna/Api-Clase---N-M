package com.example.bdoro.persistance.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "trophies")
public class Trophie implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtrophie")
    private Long idTrophie;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @ManyToMany(mappedBy = "trophies")
    private List<Player> jugadores;
}
