package cafe.demo;

import cafe.core.*;
import cafe.decorators.*;

public class Main {
    public static void main(String[] args) {
        // Создаём базовый напиток
        Beverage coffee = new Espresso();

        // Добавляем добавки
        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);

        // Вывод результата
        System.out.println("Ваш заказ: " + coffee.getDescription());
        System.out.println("Итоговая стоимость: " + coffee.cost() + " ₸");
    }
}
