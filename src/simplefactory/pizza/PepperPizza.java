package simplefactory.pizza;

/**
 * @author: jianyufeng
 * @description: 胡椒披萨
 * @date: 2020/5/13 22:05
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备胡椒Pizza");
    }
}
