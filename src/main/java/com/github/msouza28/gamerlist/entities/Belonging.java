package com.github.msouza28.gamerlist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_belonging")
@Data
@NoArgsConstructor
public class Belonging {
   
    @EmbeddedId
    private BelongingPK id = new BelongingPK(); 
    private Integer position;
    
    
    public Belonging(Game game, GameList list, Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    
}
