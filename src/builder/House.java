package builder;

/**
 * @author: jianyufeng
 * @description:一个具体的产品对象
 * @date: 2020/5/17 20:41
 */
public class House {
    private String base;

    private String wall;

    private String roof;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "base='" + base + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
