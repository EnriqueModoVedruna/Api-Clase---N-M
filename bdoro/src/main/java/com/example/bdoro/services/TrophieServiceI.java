package com.example.bdoro.services;

import java.util.List;

import com.example.bdoro.persistance.models.Trophie;

public interface TrophieServiceI {
    List<Trophie> getAllTrophies();
    Trophie getTrophieById(Long idTrophie);
    Trophie getTrophieByTitle(String title);
    Trophie getTrophieByDescription(String description);

    void addTrophie(Trophie trophie);
    void deleteTrophie(Long idTrophie);
    void updateTrophie(Long idTrophie, Trophie trophie);
}
