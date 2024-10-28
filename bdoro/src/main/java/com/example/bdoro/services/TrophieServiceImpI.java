package com.example.bdoro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bdoro.persistance.models.Trophie;
import com.example.bdoro.persistance.repository.TrophieRepositoryI;

@Service
public class TrophieServiceImpI implements TrophieServiceI {

    @Autowired
    private TrophieRepositoryI trophieRepo;

    @Override    
    public List<Trophie> getAllTrophies() {
        return trophieRepo.findAll();
    }

    @Override
    public Trophie getTrophieById(Long idTrophie) {
        return trophieRepo.findById(idTrophie).get();
    }

    @Override
    public void addTrophie(Trophie trophie) {
        trophieRepo.save(trophie);
    }

    @Override    
    public void deleteTrophie(Long idTrophie) {
        trophieRepo.deleteById(idTrophie);
    }    

    @Override
    public void updateTrophie(Long idTrophie, Trophie trophie) {
        trophieRepo.save(trophie);
    }

    @Override
    public Trophie getTrophieByTitle(String title) {
        return trophieRepo.findByTitle(title);
    }

    @Override
    public Trophie getTrophieByDescription(String description) {
        return trophieRepo.findByDescription(description);
    }
}