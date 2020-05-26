package decorator;

/**
 * @author: jianyufeng
 * @description: 装饰者
 * @date: 2020/5/21 15:29
 */
public abstract class Decorator extends Drink{
    Drink obj;

    public Decorator(Drink obj){
        this.obj = obj;
    }
    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return super.des + " " + super.getPrice() +"&&" + obj.getDes();
    }
}
