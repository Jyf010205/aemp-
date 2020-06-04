package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/3 15:43
 */
public class InfoColleage implements College{
    List<Department> departmentList;

    public InfoColleage(){
        departmentList = new ArrayList<>();
        addDepartment(new Department("信息安全专业"));
        addDepartment(new Department("网络安全专业"));
    }

    @Override
    public String getName() {
        return "信息技术学院";
    }

    @Override
    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    @Override
    public Iterator Iterator() {
        return new InfoColleageIterator(departmentList);
    }
}
