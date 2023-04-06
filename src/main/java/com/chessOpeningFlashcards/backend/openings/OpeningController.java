package com.chessOpeningFlashcards.backend.openings;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/openings")
@CrossOrigin("http://localhost:3000")
public class OpeningController {

    @Autowired
    OpeningRepository openingRepository;

    @RequestMapping("/all-openings")
    public List<Opening> getAllOpenings() {
        List<Opening> allOpenings = new ArrayList<>();

        openingRepository.findAll().forEach(allOpenings::add);
        return allOpenings;
    }

    @PostMapping("/")
    public Opening addOpening(@RequestBody Opening opening) {
        try {
            openingRepository.save(opening);
            return opening;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/delete/{eco}")
    public void deleteOpening(@PathVariable String eco) {
        openingRepository.deleteById("rnbqkb1r/pppppppp/5n2/8/4P3/8/PPPP1PPP/RNBQKBNR w KQkq");
    }

}
