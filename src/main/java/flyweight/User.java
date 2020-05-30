package flyweight;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/28 21:55
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
