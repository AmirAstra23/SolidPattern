import java.util.ArrayList;
import java.util.List;

// Класс, представляющий интернет-магазин
class OnlineShop {
    private List<Product> availableProducts;
    private List<Product> userList;
    private Cart cart;
    private DeliverySystem deliverySystem;
    private RecommenderSystem recommenderSystem;

    public OnlineShop() {
        this.availableProducts = new ArrayList<>();
        this.userList = new ArrayList<>();
        this.cart = new ConcreteCart();
        this.deliverySystem = new ConcreteDeliverySystem();
        this.recommenderSystem = new SimpleRecommenderSystem();
    }

    // Метод для добавления доступных товаров
    public void addProduct(Product product) {
        availableProducts.add(product);
    }

    // Метод для вывода доступных товаров
    public void showAvailableProducts() {
        for (Product product : availableProducts) {
            System.out.println(" Name: " + product.getName() +
                    ", Price: " + product.getPrice() +
                    ", Manufacturer: " + product.getManufacturer());
        }
    }

    public void showUserList() {
        for (Product p : userList) {
            System.out.println(" Name: " + p.getName() +
                    ", Price: " + p.getPrice() +
                    ", Manufacturer: " + p.getManufacturer());
        }
    }

    // Метод для фильтрации товаров по ключевым словам, ценам и производителям
    public void filterProducts(String keyword, String manufacturer, double minPrice, double maxPrice) {

        for (Product p : availableProducts) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase()) &
                    p.getManufacturer().toLowerCase().contains(manufacturer.toLowerCase())
                    & p.getPrice() >= minPrice & p.getPrice() <= maxPrice) {
                userList.add(p);
            }
        }
    }

    public List<Product> getUserList() {
        return userList;
    }
}