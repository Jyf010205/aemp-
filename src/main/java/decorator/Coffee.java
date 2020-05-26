package decorator;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/21 15:19
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
