# SOLID
В данном примере используются принципы SOLID:
- **Принцип единственной ответственности (Single Responsibility Principle)**: каждый класс отвечает только за одну функцию. Например, класс `ConcreteProduct` <https://github.com/AmirAstra23/SolidPattern/blob/main/src/ConcreteProduct.java> отвечает только за представление конкретного товара, а класс '
`ConcreteCart` <https://github.com/AmirAstra23/SolidPattern/blob/main/src/ConcreteCart.java> отвечает только за корзину товаров.

- **Принцип открытости/закрытости (Open/Closed Principle)**: программные сущности (классы, модули, функции) должны быть открыты для расширения, но закрыты для изменения. В данном примере, если мы хотим добавить новый тип продукта, мы можем создать новый класс, реализующий интерфейс `Product` <https://github.com/AmirAstra23/SolidPattern/blob/main/src/ConcreteProduct.java>, без изменения существующего кода.

- **Принцип подстановки Барбары Лисков (Liskov Substitution Principle)**: объекты в программе могут быть заменены на экземпляры их подтипов без изменения корректности программы. Например, класс `ConcreteCart` реализует интерфейс `Cart` <https://github.com/AmirAstra23/SolidPattern/blob/main/src/Cart.java>, и мы можем использовать экземпляры класса `ConcreteCart` вместо объектов типа `Cart`.