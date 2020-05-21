package bridge;

/**
 * @author: jianyufeng
 * @description: 实现类
 * @date: 2020/5/20 15:27
 */
public abstract class Phone {
    Brand brand;

    public Phone(Brand brand){
        this.brand = brand;
    }

    public abstract void websocket();

    public void BrandName(){
        brand.BrandName();
    }
}
