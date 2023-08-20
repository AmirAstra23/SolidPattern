import java.util.ArrayList;
import java.util.List;

// Класс, представляющий конкретную корзину для товаров
class ConcreteCart implements Cart {
    private List<Product> products;

    public ConcreteCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public void getProducts() {
        for (Product product : products)
            System.out.println(" Name: " + product.getName() +
                    ", Price: " + product.getPrice() +
                    ", Manufacturer: " + product.getManufacturer());
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

}
