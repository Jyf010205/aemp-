package composite;

import lombok.Data;

/**
 * @author: jianyufeng
 * @description: 组合模式
 * @date: 2020/5/25 11:31
 */
@Data
public abstract class OrganizationComponent {
    private String name;
    private String des;

    protected void add(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent component){
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name,String des){
        super();
        this.name = name;
        this.des = des;
    }

    protected abstract void print();
}
