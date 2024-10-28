package com.example.bdoro.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bdoro.persistance.models.Trophie;
import java.util.List;


@Repository
public interface TrophieRepositoryI extends JpaRepository<Trophie, Long> {
    
    public Trophie findByTitle(String title);
    public Trophie findByDescription(String description);
    public Trophie findByTitleAndDescription(String title, String description);
    
}
