package proxy.staticproxy;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/28 23:15
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中......");
    }
}
