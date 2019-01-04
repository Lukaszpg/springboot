package pro.lukasgorny.learning;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.junit4.SpringRunner;

import pro.lukasgorny.learning.controller.ChapterController;

@RunWith(SpringRunner.class)
@WebFluxTest(ChapterController.class)
public class ChapterControllerTest {

}
