package com.github.msouza28.gamerlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.msouza28.gamerlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
