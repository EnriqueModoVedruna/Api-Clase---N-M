package com.example.bdoro.persistance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bdoro.persistance.models.Player;
import com.example.bdoro.services.PlayerServiceI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/bdoro/v1/player")
public class PlayerController {
    
    @Autowired
    private PlayerServiceI playerMngmnt;

    @GetMapping
    public List<Player> getAllPlayers(){
        List<Player> jugadores = playerMngmnt.getAllPlayers();
        return (List<Player>) ResponseEntity.ok(jugadores);
    }
    
    @GetMapping("/username/{username}")                                 
    public Player getMethodName(@PathVariable String username) {
        return playerMngmnt.findPlayerByUsername(username);
    }

    @GetMapping("/{id}/trophies")
    public ResponseEntity<Player> obtenerJugadorConTrofeos(@PathVariable Long id) {
        Player player = playerMngmnt.obtenerJugadorConTrofeos(id);
        return ResponseEntity.ok(player);
    }

}
