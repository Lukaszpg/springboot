package pro.lukasgorny.learning.service.implementation;

import org.springframework.stereotype.Service;
import pro.lukasgorny.learning.domain.Chapter;
import pro.lukasgorny.learning.repository.ChapterRepository;
import pro.lukasgorny.learning.service.abstraction.ChapterService;
import reactor.core.publisher.Flux;

@Service
public class ChapterServiceImpl implements ChapterService {

    private final ChapterRepository chapterRepository;

    public ChapterServiceImpl(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    @Override
    public Flux<Chapter> getAll() {
        return chapterRepository.findAll();
    }
}
