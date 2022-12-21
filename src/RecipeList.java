import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private Set<Recipe> recipeSet = new HashSet<>();


    public void addRecipe(Recipe recipe) {
        if (recipeSet.contains(recipe)) {
            try {
                throw new IllegalAccessException("Такой рецепт " + recipe.getName() + " уже есть в списке");
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        } else {
            this.recipeSet.add(recipe);
            System.out.println("Рецепт " + recipe.getName() + " добавлен в список");
        }
    }

    @Override
    public String toString() {
        return "Список рецептов " + recipeSet;
    }
}
