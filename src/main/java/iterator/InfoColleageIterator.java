package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author: jianyufeng
 * @description: 信息工程学院迭代器
 * @date: 2020/6/3 15:34
 */
public class InfoColleageIterator implements Iterator {
    //以List存放数据
    List<Department> departments;
    //索引
    int index = -1;

    public InfoColleageIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() -1){
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {

    }
}
