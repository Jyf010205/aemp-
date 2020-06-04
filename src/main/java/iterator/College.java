package iterator;

import java.util.Iterator;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/3 14:46
 */
public interface College {
    String getName();

    void addDepartment(Department department);

    public Iterator Iterator();
}
