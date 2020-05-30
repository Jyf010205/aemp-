package proxy.cglib;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/29 15:08
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();

        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();

        System.out.println(proxyInstance.getClass());

        proxyInstance.teach();
    }
}
