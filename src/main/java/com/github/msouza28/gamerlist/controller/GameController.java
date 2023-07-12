package com.github.msouza28.gamerlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.msouza28.gamerlist.dto.GameMinDTO;
import com.github.msouza28.gamerlist.entities.Game;
import com.github.msouza28.gamerlist.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    
    @Autowired
    private GameService gameService;
    
    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAllGames();
    }
}