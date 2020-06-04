package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/6/3 15:55
 */
public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>();
        collegeList.add(new ComputerCollege());
        collegeList.add(new InfoColleage());

        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();
    }
}
