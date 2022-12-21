import java.util.Objects;


public class Product {
    private String name;
    private double price;
    private double quantity;
    private boolean flag;


    public Product(String name, double price, double quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        this.flag = false;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else
            this.price = price;
    }

    public void setQuantity(double quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else
            this.quantity = quantity;
    }

    public void setName(String name) {
        if (StringUtils.IsNullOrBlank(name)) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            if (StringUtils.IsLatinLetters(name)) {
                throw new IllegalArgumentException("Напишите название на русском языке");
            } else {
                this.name = name;
            }
        }

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
