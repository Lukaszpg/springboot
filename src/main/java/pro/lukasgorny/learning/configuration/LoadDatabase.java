package pro.lukasgorny.learning.configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pro.lukasgorny.learning.domain.Chapter;
import pro.lukasgorny.learning.repository.ChapterRepository;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    /*@Bean
    CommandLineRunner init(ChapterRepository repository) {
        return args -> Flux.just(new Chapter("Test1"), new Chapter("Learning reactive with Boot"), new Chapter("Hoho, haha!"))
                           .flatMap(repository::save).subscribe(System.out::println);
    }*/
}
