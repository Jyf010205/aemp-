package vistor;

import java.util.Random;

/**
 * @author: jianyufeng
 * @description: 经理
 * @date: 2020/6/2 22:20
 */
public class Manager extends Staff{
    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 一年做的产品数量
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
