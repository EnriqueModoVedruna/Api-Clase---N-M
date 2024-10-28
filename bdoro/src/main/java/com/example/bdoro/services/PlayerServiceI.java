package com.example.bdoro.services;

import java.util.List;

import com.example.bdoro.persistance.models.Player;

public interface PlayerServiceI {
    List<Player> getAllPlayers();
    Player findPlayerByUsername(String username);
    Player obtenerJugadorConTrofeos(Long id);

    void addPlayer(Player player);
    void deletePlayer(Long id);
    void updatePlayer(Long id, Player player);
}
