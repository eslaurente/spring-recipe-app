package laurente.reference.recipeapp.controllers;

import laurente.reference.recipeapp.domain.Category;
import laurente.reference.recipeapp.domain.UnitOfMeasure;
import laurente.reference.recipeapp.repositories.CategoryRepository;
import laurente.reference.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
@RequestMapping("")
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"/", "/index", "index.html"})
    public String getIndexPage() {
        Optional<Category> category = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        category.ifPresent(v ->  System.out.printf("Category ID: %s\n", v.getId()));
        unitOfMeasure.ifPresent(v -> System.out.printf("UoM ID: %s\n", v.getId()));

        return "index";
    }
}
