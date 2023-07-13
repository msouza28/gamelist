package com.github.msouza28.gamerlist.dto;

import org.springframework.beans.BeanUtils;

import com.github.msouza28.gamerlist.entities.Game;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platform;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;
    
    public GameDTO(Game entity) {
       BeanUtils.copyProperties(entity, this);
    }

  
}
