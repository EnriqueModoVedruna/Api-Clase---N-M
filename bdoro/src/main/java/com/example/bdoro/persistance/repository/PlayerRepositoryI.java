package com.example.bdoro.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bdoro.persistance.models.Player;

@Repository
public interface PlayerRepositoryI extends JpaRepository<Player, Long> {
    
    Player findPlayerByUsername(String username);
}
