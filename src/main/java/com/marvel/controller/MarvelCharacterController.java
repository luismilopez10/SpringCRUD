package com.marvel.controller;

import com.marvel.entity.MarvelCharacter;
import com.marvel.service.IMarvelCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/marvelCharacters")
public class MarvelCharacterController {

    @Autowired
    private IMarvelCharacterService marvelCharacterService;

    @GetMapping()
    public List<MarvelCharacter> getAllMarvelCharacters() {
        return marvelCharacterService.getAllMarvelCharacters();
    }

    @PostMapping()
    public MarvelCharacter saveMarvelCharacter(@RequestBody MarvelCharacter marvelCharacter){
        return marvelCharacterService.saveMarvelCharacter(marvelCharacter);
    }

    @PutMapping()
    public MarvelCharacter updateMarvelCharacter(@RequestBody MarvelCharacter marvelCharacter){
        return marvelCharacterService.updateMarvelCharacter(marvelCharacter);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteMarvelCharacter(@PathVariable Long id){
        marvelCharacterService.deleteMarvelCharacter(id);
    }
}
