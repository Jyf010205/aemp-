package factory.pizza;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/13 22:44
 */
public class ChinaCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备中式胡椒Pizza");
    }
}
