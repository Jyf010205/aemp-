package simplefactory;

import com.company.design.simplefactory.pizza.CheesePizza;
import com.company.design.simplefactory.pizza.PepperPizza;
import com.company.design.simplefactory.pizza.Pizza;

import java.util.Scanner;

/**
 * @author: jianyufeng
 * @description: 简单工厂
 * @date: 2020/5/13 22:07
 */
public class SimpleFactory {
    private Pizza pizza;
    static String pizzaType;

    public Pizza createPizza(){
        pizzaType = getType();
        if (pizzaType.equals("cheese")){
            pizza = new CheesePizza();
        }else if (pizzaType.equals("pepper")){
            pizza = new PepperPizza();
        }else {
            return null;
        }
        return pizza;
    }

    private String getType() {
        System.out.println("请输入想购买的Pizza类型");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
