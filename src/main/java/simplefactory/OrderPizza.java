package simplefactory;

import simplefactory.pizza.Pizza;

/**
 * @author: jianyufeng
 * @description:订阅Pizza
 * @date: 2020/5/13 22:18
 */
public class OrderPizza {
    SimpleFactory simpleFactory = new SimpleFactory();

    public void OrderPizza(){
        while (true){
            Pizza pizza = simpleFactory.createPizza();
            if (null != pizza){
                pizza.prepare();
                pizza.box();
                pizza.cut();
            }else {
                System.out.println("没有这款Pizza");
                break;
            }
        }
    }
}
