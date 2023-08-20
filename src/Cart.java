// Интерфейс, представляющий корзину для товаров
interface Cart {
    void addProduct(Product product);

    void removeProduct(Product product);

    void getProducts();

    double getTotalPrice();
}