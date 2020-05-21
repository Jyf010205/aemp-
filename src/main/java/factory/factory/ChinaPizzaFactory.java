package factory.factory;


import factory.pizza.ChinaCheesePizza;
import factory.pizza.Pizza;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/13 22:50
 */
public class ChinaPizzaFactory implements PizzaFactory {
    Pizza pizza;
    @Override
    public Pizza createPizza(String pizzaType) {
        if (pizzaType.equalsIgnoreCase("cheese")){
            pizza = new ChinaCheesePizza();
        }else if (pizzaType.equalsIgnoreCase("pepper")){
            pizza = new ChinaCheesePizza();
        }else {
            return null;
        }
        return pizza;
    }
}
