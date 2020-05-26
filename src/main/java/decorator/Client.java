package decorator;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/21 15:57
 */
public class Client {
    public static void main(String[] args) {
        Drink longBlack = new LongBlack();
        Drink milk = new Milk(longBlack);
        Drink chocolate = new Chocolate(milk);
        System.out.println(chocolate.cost());
        System.out.println(chocolate.getDes());
    }
}
