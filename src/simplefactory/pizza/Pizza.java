package simplefactory.pizza;

/**
 * @author: jianyufeng
 * @description: 披萨抽象类
 * @date: 2020/5/13 22:00
 */
public abstract class Pizza {
    private String name;

    public abstract void prepare();

    public void cut(){
        System.out.println("切Pizza");
    }
    public void box(){
        System.out.println("打包Pizza");
    }
    public void setName(String name){
        this.name = name;
    }
}
