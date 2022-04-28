package com.marvel.service;

import com.book.entity.Book;
import com.marvel.entity.MarvelCharacter;

import java.util.List;

public interface IMarvelCharacterService {

    List<MarvelCharacter> getAllMarvelCharacters();

    MarvelCharacter saveMarvelCharacter(MarvelCharacter book);

    MarvelCharacter updateMarvelCharacter(MarvelCharacter book);

    void deleteMarvelCharacter(Long id);
}
