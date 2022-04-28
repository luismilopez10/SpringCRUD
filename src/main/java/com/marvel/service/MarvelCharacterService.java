package com.marvel.service;

import com.marvel.entity.MarvelCharacter;
import com.marvel.repository.MarvelCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarvelCharacterService implements IMarvelCharacterService {

    @Autowired
    private MarvelCharacterRepository marvelCharacterRepository;

    @Override
    public List<MarvelCharacter> getAllMarvelCharacters() {
        return marvelCharacterRepository.findAll();
    }

    @Override
    public MarvelCharacter saveMarvelCharacter(MarvelCharacter marvelCharacter) {
        return marvelCharacterRepository.save(marvelCharacter);
    }

    @Override
    public MarvelCharacter updateMarvelCharacter(MarvelCharacter marvelCharacter) {
        if (marvelCharacterRepository.existsById(marvelCharacter.getId())){
            return marvelCharacterRepository.save(marvelCharacter);
        }
        return new MarvelCharacter();
    }

    @Override
    public void deleteMarvelCharacter(Long id) {
        marvelCharacterRepository.deleteById(id);
    }
}
