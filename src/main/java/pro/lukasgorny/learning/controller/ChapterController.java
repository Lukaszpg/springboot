package pro.lukasgorny.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pro.lukasgorny.learning.domain.Chapter;
import pro.lukasgorny.learning.service.ChapterService;
import reactor.core.publisher.Flux;

@RestController
public class ChapterController {

    private final ChapterService chapterService;

    public ChapterController(ChapterService chapterService) {
        this.chapterService = chapterService;
    }

    @GetMapping("/chapters")
    public Flux<Chapter> listing() {
        return chapterService.getAll();
    }
}
