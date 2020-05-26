package composite;

/**
 * @author: jianyufeng
 * @description: 组合模式
 * @date: 2020/5/25 11:31
 */
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
