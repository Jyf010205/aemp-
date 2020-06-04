package iterator;

import java.util.Iterator;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/3 15:38
 */
public class ComputerCollege implements College{
    Department[] departments;
    int position = 0;

    public ComputerCollege(){
        departments = new Department[5];
        addDepartment(new Department("Java"));
        addDepartment(new Department("PHP"));
        addDepartment(new Department("Python"));
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(Department department) {
        departments[position] = department;
        position += 1;
    }

    @Override
    public Iterator Iterator() {
        return new ComputerCollegeIterator(departments);
    }
}
