package pro.lukasgorny.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pro.lukasgorny.learning.domain.Chapter;
import pro.lukasgorny.learning.repository.ChapterRepository;
import reactor.core.publisher.Flux;

@RestController
public class ChapterController {

    private final ChapterRepository chapterRepository;

    public ChapterController(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    @GetMapping("/chapters")
    public Flux<Chapter> listing() {
        return chapterRepository.findAll();
    }
}
