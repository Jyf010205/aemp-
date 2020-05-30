package proxy.dynamicproxy;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/29 0:02
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        //构造器，对目标对象初始化
        ITeacherDao instance = (ITeacherDao)new ProxyFactory(teacherDao).getProxyInstance();
        //执行了toString方法
        System.out.println(instance);
        System.out.println(instance.getClass());
        instance.teach();

    }
}
