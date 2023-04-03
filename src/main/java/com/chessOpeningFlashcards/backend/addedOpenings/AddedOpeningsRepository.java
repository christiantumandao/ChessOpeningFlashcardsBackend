package com.chessOpeningFlashcards.backend.addedOpenings;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AddedOpeningsRepository extends CrudRepository<AddedOpening, String> {

    List<AddedOpening> findbyUid(int uid);
}
