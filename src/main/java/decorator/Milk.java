package decorator;

/**
 * @author: jianyufeng
 * @description: 牛奶
 * @date: 2020/5/21 15:48
 */
public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
