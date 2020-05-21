package adapter.adapterInterface;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/19 10:30
 */
public class Client {
    public static void main(String[] args) {
        Abstract anAbstract = new Abstract(){
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        anAbstract.m1();
    }
}
