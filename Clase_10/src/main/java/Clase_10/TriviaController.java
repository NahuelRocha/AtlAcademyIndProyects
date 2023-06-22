package Clase_10;

import Clase_10.data.CategoriesList;
import Clase_10.data.QuestionList;
import Clase_10.models.Category;
import Clase_10.models.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TriviaController {

    @GetMapping("/categories")
    public List<Category> sendCategory() {

        return CategoriesList.sendCategories();
    }

    @GetMapping("/question/{category}")
    public Question sendQuestion(@PathVariable String category) {

        List<Question> questions = QuestionList.sendQuestions();

        return questions.stream()
                .filter(question -> question.getCategory().equals(category))
                .findFirst()
                .orElse(null);
    }
}


