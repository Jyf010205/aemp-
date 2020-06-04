package vistor;

import java.util.Random;

/**
 * @author: jianyufeng
 * @description: 工程师
 * @date: 2020/6/2 22:19
 */
public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 工程师一年的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
