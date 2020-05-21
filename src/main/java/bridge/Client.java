package bridge;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/20 15:52
 */
public class Client {
    public static void main(String[] args) {
        Phone foldedPhone = new FoldedPhone(new HuaWei());
        foldedPhone.websocket();
        foldedPhone.BrandName();
    }
}
