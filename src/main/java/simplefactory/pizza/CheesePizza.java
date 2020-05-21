package simplefactory.pizza;

/**
 * @author: jianyufeng
 * @description:芝士披萨
 * @date: 2020/5/13 22:03
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备芝士Pizza");
    }
}
