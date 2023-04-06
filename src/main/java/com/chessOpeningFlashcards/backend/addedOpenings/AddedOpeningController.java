package com.chessOpeningFlashcards.backend.addedOpenings;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/added-openings")
@CrossOrigin("http:/localhost:3000")
public class AddedOpeningController {

    @Autowired
    AddedOpeningsRepository addedOpeningsRepository;

    // add an opening
    @PostMapping("/{id}")
    public AddedOpening addOpening(@PathVariable int id, @RequestBody AddedOpening addedOpening) {
        return addedOpeningsRepository.save(addedOpening);
    }

    // delete an opening
    @DeleteMapping("/{id}/{eco}")
    public void deleteOpening(@PathVariable int id, @PathVariable String eco) {
        // find a way to not delete all instances of that type of opening
        // find a way to find opening by its auto generated id
        // addedOpeningsRepository.deleteById(id);
    }

    // get all openigns for a user
    @RequestMapping("/{id}")
    public List<AddedOpening> getUserOpenings(@PathVariable int id) {
        List<AddedOpening> userOpenings = null;

        return userOpenings;
    }

}
