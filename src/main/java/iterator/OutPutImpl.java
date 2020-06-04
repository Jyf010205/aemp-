package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/3 15:50
 */
public class OutPutImpl {
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList){
        this.collegeList = collegeList;
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("学院名:" + college.getName());
            printDepartment(college);
        }
    }

    private void printDepartment(College college){
        Iterator iterator = college.Iterator();
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println("系名:" + department.getName());
        }
    }
}
