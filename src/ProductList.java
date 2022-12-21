import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class ProductList {
    private Integer quantityInRecipe;

    private Map<Product, Integer> productSet = new HashMap<>();


    public void addProduct(Product product, Integer quantityInRecipe) {

            if (productSet.containsKey(product)) {
                try {
                    throw new IllegalArgumentException("Такой продукт " + product.getName() + " уже есть в списке");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                this.productSet.put(product, quantityInRecipe);
                System.out.println("Продукт " + product.getName() + " добавлен в список");
            }
        }


    public void removeProduct(Product product) {
        if (!productSet.containsKey(product)) {
            System.out.println("Продукта " + product.getName() + " нет в списке");
        } else {
            productSet.remove(product);
            System.out.println("Продукт " + product.getName() + " удалён из списока");
        }
    }

    public void buyProduct(Product product) {
        if (!productSet.containsKey(product)) {
            System.out.println("Продукта " + product.getName() + " нет в списке");
        } else {
            product.setFlag(true);
            System.out.println("Продукт " + product.getName() + " куплен");
        }
    }

    public Map<Product, Integer> getProductSet() {
        return productSet;
    }

    public Integer getQuantityInRecipe() {
        return quantityInRecipe;
    }

    @Override
    public String toString() {
        return "Список продуктов: " + productSet;
    }
}
