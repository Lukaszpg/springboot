package pro.lukasgorny.learning.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import pro.lukasgorny.learning.domain.Chapter;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {
}
