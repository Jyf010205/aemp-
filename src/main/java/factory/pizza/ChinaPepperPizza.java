package factory.pizza;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/13 22:45
 */
public class ChinaPepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备中式芝士Pizza");
    }
}
