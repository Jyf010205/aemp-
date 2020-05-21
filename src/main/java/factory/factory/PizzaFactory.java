package factory.factory;


import factory.pizza.Pizza;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/13 22:47
 */
public interface PizzaFactory {

    public Pizza createPizza(String pizzaType);

}
