package proxy.staticproxy;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/28 23:17
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao teacherDao = new TeacherDao();
        //创建代理对象，同时将代理对象传递给代理对象
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //通过代理对象，调用目标对象方法
        teacherDaoProxy.teach();

    }
}
