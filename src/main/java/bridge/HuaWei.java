package bridge;

/**
 * @author: jianyufeng
 * @description: 华为手机
 * @date: 2020/5/20 15:40
 */
public class HuaWei implements Brand{
    @Override
    public String websocket() {
        return "huaweiPush";
    }

    @Override
    public void BrandName() {
        System.out.println("华为手机");
    }
}
