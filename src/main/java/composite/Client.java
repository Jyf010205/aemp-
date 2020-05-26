package composite;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/25 13:02
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "无敌");

        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院", "信息工程学院");

        computerCollege.add(new Department("软件工程专业", "软件工程"));
        computerCollege.add(new Department("网络工程专业", "网络工程"));

        infoEngineerCollege.add(new Department("通讯工程专业","通讯工程"));

        university.add(computerCollege);
        university.add(infoEngineerCollege);

        university.print();

    }
}
