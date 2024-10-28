package com.example.bdoro.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bdoro.persistance.models.PHT;

public interface PHTRepositoryI extends JpaRepository<PHT, Long> {
    
    public PHT findByPlayerIdPlayerAndTrophieIdTrophie(Long idPlayer, Long idTrophie);

    public PHT findByTrophieIdTrophie(Long idTrophie);

    public PHT findByPlayerIdPlayer(Long idPlayer);
}
