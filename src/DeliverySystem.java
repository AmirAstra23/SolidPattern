// Интерфейс, представляющий систему доставки
interface DeliverySystem {
    String trackOrder(int orderId);

    void returnOrder(int orderId);
}
