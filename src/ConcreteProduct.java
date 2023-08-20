// Класс, представляющий конкретный товар
class ConcreteProduct implements Product {

    private String name;
    private double price;
    private String manufacturer;

    public ConcreteProduct(String name, double price, String manufacturer) {

        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "ConcreteProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
