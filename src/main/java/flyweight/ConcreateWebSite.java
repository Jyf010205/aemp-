package flyweight;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/28 21:48
 */
public class ConcreateWebSite extends WebSite {
    private String type = "";

    public ConcreateWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式:" + type + "使用者:" + user.getName());
    }
}
