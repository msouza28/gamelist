package com.github.msouza28.gamerlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.msouza28.gamerlist.dto.GameMinDTO;
import com.github.msouza28.gamerlist.entities.Game;
import com.github.msouza28.gamerlist.repository.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAllGames(){
        var result = gameRepository.findAll();
        List<GameMinDTO> listDto = result.stream().map(game -> new GameMinDTO(game)).toList();
        return listDto;
    }
}
