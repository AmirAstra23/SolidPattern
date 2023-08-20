// Класс, представляющий конкретную систему доставки
class ConcreteDeliverySystem implements DeliverySystem {
    public String trackOrder(int orderId) {
        return "Tracking order " + orderId;
    }

    public void returnOrder(int orderId) {
        System.out.println("Заказ " + orderId + " оплачен");
    }
}