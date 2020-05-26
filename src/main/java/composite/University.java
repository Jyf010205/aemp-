package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jianyufeng
 * @description: University 就是 Composite ,  可以管理 College
 * @date: 2020/5/25 11:40
 */
public class University extends OrganizationComponent {
    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();
    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent component) {
        organizationComponentList.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        organizationComponentList.remove(component);
    }

    @Override
    protected void print() {
        System.out.println("--------" + getName() + "--------");
        for (OrganizationComponent organizationComponent : organizationComponentList){
            organizationComponent.print();
        }
    }
}
