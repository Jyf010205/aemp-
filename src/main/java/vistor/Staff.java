package vistor;

import java.util.Random;

/**
 * @author: jianyufeng
 * @description: 员工基类
 * @date: 2020/6/2 22:16
 */
public abstract class Staff {
    public String name;
    public int kpi;//员工kpi

    public Staff(String name){
        this.name = name;
        kpi = new Random().nextInt(10);
    }
    
    public abstract void accept(Visitor visitor);
}
