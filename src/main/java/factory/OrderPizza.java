package factory;

import factory.factory.ChinaPizzaFactory;
import factory.factory.LondonPizzaFactory;
import factory.factory.PizzaFactory;
import factory.pizza.Pizza;

import java.util.Scanner;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/13 22:54
 */
public class OrderPizza {
    PizzaFactory factory;

    public void OrderPizza(){
        ChinaPizzaFactory chinaPizzaFactory = new ChinaPizzaFactory();
        LondonPizzaFactory londonPizzaFactory = new LondonPizzaFactory();
        while (true){
            System.out.println("请输出所在地");
            String address = new Scanner(System.in).nextLine();
            if (address.equalsIgnoreCase("China")){
                factory = chinaPizzaFactory;
            }else if (address.equalsIgnoreCase("London")){
                factory = londonPizzaFactory;
            }else {
                System.out.println("地名错误");
                break;
            }
            System.out.println("请输入想购买的Pizza类型");
            Pizza pizza = factory.createPizza(new Scanner(System.in).nextLine());

            if (pizza != null){
                pizza.prepare();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("没有这款Pizza");
                break;
            }

        }
    }
}
