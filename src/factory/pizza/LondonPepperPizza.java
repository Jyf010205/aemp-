package factory.pizza;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/13 22:47
 */
public class LondonPepperPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备伦敦胡椒Pizza");
    }
}
