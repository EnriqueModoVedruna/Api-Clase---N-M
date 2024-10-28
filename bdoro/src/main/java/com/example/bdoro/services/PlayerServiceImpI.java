package com.example.bdoro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bdoro.persistance.models.Player;
import com.example.bdoro.persistance.repository.PlayerRepositoryI;

@Service
public class PlayerServiceImpI implements PlayerServiceI {
    
    @Autowired
    PlayerRepositoryI playerRepo;

    @Override
    public List<Player> getAllPlayers() {
        return playerRepo.findAll();
    }

    @Override
    public Player findPlayerByUsername(String username) {
        return playerRepo.findPlayerByUsername(username);
    }

    public Player obtenerJugadorConTrofeos(Long id) {
        return playerRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("Jugador con ID " + id + " no encontrado."));
    }

    @Override
    public void addPlayer(Player player) {
        playerRepo.save(player);
    }

    @Override
    public void deletePlayer(Long id) {
        playerRepo.deleteById(id);
    }

    @Override
    public void updatePlayer(Long id, Player player) {
        playerRepo.save(player);
    }
}
