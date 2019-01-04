package pro.lukasgorny.learning.service;

import org.springframework.stereotype.Service;

import pro.lukasgorny.learning.domain.Chapter;
import pro.lukasgorny.learning.repository.ChapterRepository;
import reactor.core.publisher.Flux;

@Service
public class ChapterService {

    private final ChapterRepository chapterRepository;

    public ChapterService(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    public Flux<Chapter> getAll() {
        return chapterRepository.findAll();
    }
}
