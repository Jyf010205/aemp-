package decorator;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/21 15:14
 */
public abstract class Drink {
    public String des;

    private float price = 0.0f;

    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
