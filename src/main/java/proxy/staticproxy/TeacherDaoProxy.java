package proxy.staticproxy;

/**
 * @author: jianyufeng
 * @description: 代理对象，静态代理
 * @date: 2020/5/28 23:16
 */
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao teacherDao;

    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理");
        teacherDao.teach();
        System.out.println("提交代理");
    }
}
