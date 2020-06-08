package laurente.reference.recipeapp.repositories;

import laurente.reference.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
