import java.util.*;

public class Main {
    public static void main(String[] args) {

        //ДЗ 1.1
        Phonebook ivan = new Phonebook("Ivan", "+79138077201");
        Phonebook Sam = new Phonebook("Sam", "+79138077202");
        Phonebook Sam2 = new Phonebook("Sam", "+79138077203");


        for (Map.Entry<String, String> contact : Phonebook.getPhonebook().entrySet()) {
            System.out.println(contact.getKey() + " " + contact.getValue());
        }

        //ДЗ 1.2
        Product banana = new Product("банан", 100, 0.5);
        Product apple = new Product("яблоко", 70, 0.5);
        Product yogurt = new Product("йогурт", 230, 0.2);


        ProductList productList = new ProductList();
        productList.addProduct(banana, 3);
        productList.addProduct(apple, 3);
        productList.addProduct(apple, 4);
        productList.addProduct(yogurt, 1);
        System.out.println(productList);
        productList.addProduct(apple, 2);
        productList.removeProduct(apple);
        productList.removeProduct(apple);


        Recipe recipe1 = new Recipe("Фруктовый салат", productList);
        recipe1.addProduct(banana, 5);
        System.out.println(recipe1);

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(recipe1);
        System.out.println(recipeList);

        //ДЗ 1.3

        MyMap.myMap.put("Mary", 1);
        MyMap.myMap.put("Jane", 2);
        MyMap.myMap.put("Ann", 3);
        for (Map.Entry<String, Integer> element : MyMap.myMap.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
        MyMap.putToMap("Mary", 2);
        for (Map.Entry<String, Integer> element : MyMap.myMap.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }


        //ДЗ 2.1

        Random random = new Random();
        int max = 1000;
        int size = 3;
        Map<String, List<Integer>> randomMap = new HashMap<>();
        Map<String, Integer> randomMapSum = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            List<Integer> randomList = new ArrayList<>();
            while (randomList.size() < size) {
                randomList.add(random.nextInt(max + 1));
            }
            randomMap.put(StringUtils.randomString(), randomList);
        }

        for (Map.Entry<String, List<Integer>> element : randomMap.entrySet()) {
            System.out.println(element.getKey() + " -> " + element.getValue());
            Integer sum = 0;
            for (int i = 0; i < element.getValue().size(); i++) {
                sum = sum + element.getValue().get(i);
            }
            randomMapSum.put(element.getKey(), sum);
            System.out.println(element.getKey() + " -> " + sum);
        }


        //ДЗ 2.2
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "q");
        linkedHashMap.put(2, "w");
        linkedHashMap.put(3, "q");
        linkedHashMap.put(4, "r");
        linkedHashMap.put(5, "t");
        linkedHashMap.put(6, "y");
        linkedHashMap.put(7, "u");
        linkedHashMap.put(8, "i");
        linkedHashMap.put(9, "o");
        linkedHashMap.put(10, "p");
        for (Map.Entry<Integer, String> element : linkedHashMap.entrySet()) {
            System.out.println(element.getKey() + ":" + element.getValue());
        }


    }
}