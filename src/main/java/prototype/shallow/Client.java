package prototype.shallow;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/14 22:58
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("tom", 1, "白色");
        Sheep sheep2 = new Sheep("jack", 1, "黑色");
        sheep1.friend = sheep2;
        Sheep sheep3 = (Sheep) sheep1.clone();
        //浅拷贝的对象的基本数据类型会值传递
        System.out.println(sheep3);
        //表明克隆后的不是同一个对象
        System.out.println(sheep1 == sheep3);
        //浅拷贝的对象的引用数据类型不会复制，只是会指向同一个对象
        System.out.println(sheep1.friend == sheep3.friend);
    }
}
