package laurente.reference.recipeapp.services;

import laurente.reference.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
