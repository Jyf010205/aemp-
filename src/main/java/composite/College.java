package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/25 12:52
 */
public class College extends OrganizationComponent{
    List<OrganizationComponent> organizationComponentList = new ArrayList<>();
    public College(String name, String des) {
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
        for (OrganizationComponent component : organizationComponentList){
            component.print();
        }
    }
}
