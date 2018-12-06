package pro.lukasgorny.learning.service.abstraction;

import pro.lukasgorny.learning.domain.Chapter;
import reactor.core.publisher.Flux;

public interface ChapterService {
    Flux<Chapter> getAll();
}
