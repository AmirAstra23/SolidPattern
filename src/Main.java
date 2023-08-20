import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        int orderID = 55555;

        Product prd1 = new ConcreteProduct("Laptop", 999, "Sony");
        Product prd2 = new ConcreteProduct("TV", 499, "Dell");
        Product prd3 = new ConcreteProduct("Printer", 299, "HP");
        Product prd4 = new ConcreteProduct("TV+", 1000, "Sony");
        OnlineShop onlineShop = new OnlineShop();
        onlineShop.addProduct(prd1);
        onlineShop.addProduct(prd2);
        onlineShop.addProduct(prd3);
        onlineShop.addProduct(prd4);

        System.out.println("Доступные товары в магазине:");
        onlineShop.showAvailableProducts();
        RecommenderSystem recommenderSystem = new SimpleRecommenderSystem();
        recommenderSystem.getRecommendedProducts();

        System.out.println("Наберите название товара: ");
        InputDate inputDate = new InputDate();
        inputDate.setDate();
        inputDate.keyword = inputDate.temp;
        System.out.println("Наберите имя производителя товара: ");
        inputDate.setDate();
        inputDate.manufacturer = inputDate.temp;
        System.out.println("Введите минимальную цену");
        inputDate.setDoubleDate();
        inputDate.minPrice = (double) inputDate.tempInt;
        System.out.println("Введите максимальную цену");
        inputDate.setDoubleDate();
        inputDate.maxPrice = (double) inputDate.tempInt;

        onlineShop.filterProducts(inputDate.keyword, inputDate.manufacturer, inputDate.minPrice, inputDate.maxPrice);
        System.out.println("Найденные товары: ");
        onlineShop.showUserList();
        System.out.println("Товары в корзине: ");
        Cart cart = new ConcreteCart();
        for (Product p : onlineShop.getUserList()) {
            cart.addProduct(p);
        }
        cart.getProducts();
        System.out.println("Сумма к оплате: " + cart.getTotalPrice());
        System.out.println("Оплатить товар? (Y/N)");
        inputDate.setDate();
        if (inputDate.temp.toLowerCase().contains("y")) {
            DeliverySystem deliverySystem = new ConcreteDeliverySystem();
            deliverySystem.returnOrder(orderID);
            System.out.println(deliverySystem.trackOrder(orderID));
        }
    }
}