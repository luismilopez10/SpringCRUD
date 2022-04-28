package com.marvel.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "MarvelCharacter")
@Table(name = "marvelcharacter")
@Data
public class MarvelCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;
}
