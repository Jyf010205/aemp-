package decorator;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/21 15:51
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f);
    }
}
