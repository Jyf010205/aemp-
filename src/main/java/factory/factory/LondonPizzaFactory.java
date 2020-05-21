package factory.factory;

import factory.pizza.LondonCheesePizza;
import factory.pizza.LondonPepperPizza;
import factory.pizza.Pizza;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/13 22:53
 */
public class LondonPizzaFactory implements PizzaFactory {
    Pizza pizza;
    @Override
    public Pizza createPizza(String pizzaType) {
        if (pizzaType.equalsIgnoreCase("cheese")){
            pizza = new LondonCheesePizza();
        }else if (pizzaType.equalsIgnoreCase("pepper")){
            pizza = new LondonPepperPizza();
        }else {
            return null;
        }
        return pizza;
    }
}
