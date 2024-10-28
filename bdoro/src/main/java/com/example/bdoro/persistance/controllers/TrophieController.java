package com.example.bdoro.persistance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bdoro.persistance.models.Trophie;
import com.example.bdoro.services.TrophieServiceI;

@RestController
@RequestMapping("/trophies")
public class TrophieController {
    
    @Autowired
    private TrophieServiceI trophieMngmnt;

    @GetMapping
    public List<Trophie> getAllTrophies(){
        return trophieMngmnt.getAllTrophies();
    }

    
    
}
