package iterator;

import java.util.Iterator;

/**
 * @author: jianyufeng
 * @description: 计算机学院迭代器
 * @date: 2020/6/3 15:25
 */
public class ComputerCollegeIterator implements Iterator {
    //以数组存放数据
    Department[] departments;
    //记录初始位置
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
