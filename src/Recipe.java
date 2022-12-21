import java.util.Map;
import java.util.Objects;

public class Recipe {
    private String name;
    private double sum;

    private ProductList productSet;


    public Recipe(String name) {
        if (StringUtils.IsNullOrBlank(name)) {
            try {
                throw new IllegalArgumentException("Напишите название рецепта");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else
            this.name = name;
    }

    public Recipe(String name, ProductList productSet) {
        this.name = name;
        this.productSet = productSet;
    }

    public void addProduct(Product product, Integer quantityInRecipe) {
        if (productSet.getProductSet().containsKey(product)) {
            try {
                throw new IllegalArgumentException("Такой продукт " + product.getName() + " уже есть в рецепте");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            this.productSet.getProductSet().put(product, quantityInRecipe);
            System.out.println("Продукт " + product.getName() + " добавлен в рецепт");
        }
    }

    public double getSum() {
        sum = 0;
        for (Map.Entry<Product, Integer> product : productSet.getProductSet().entrySet()) {
            sum = sum + product.getValue() * product.getKey().getPrice();
        }
        return sum;
    }


    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Рецепт "
                + name +
                ", стоимость " + getSum() +
                ", набор продуктов " + productSet;
    }
}
