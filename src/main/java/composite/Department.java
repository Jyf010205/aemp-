package composite;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/25 12:54
 */
public class Department extends OrganizationComponent{
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
