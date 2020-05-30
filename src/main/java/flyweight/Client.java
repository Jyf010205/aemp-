package flyweight;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/28 21:51
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite1 = factory.getWebSite("博客");
        webSite1.use(new User("tom"));

        WebSite webSite2 = factory.getWebSite("小程序");
        webSite2.use(new User("jack"));
    }
}
