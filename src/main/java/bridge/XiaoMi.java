package bridge;

/**
 * @author: jianyufeng
 * @description: 小米手机
 * @date: 2020/5/20 15:37
 */
public class XiaoMi implements Brand{
    @Override
    public String websocket() {
        return "xiaoMiPush";
    }

    @Override
    public void BrandName() {
        System.out.println("小米手机");
    }
}
