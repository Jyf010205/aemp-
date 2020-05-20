package adapter.adapterClass;

/**
 * @author: jianyufeng
 * @description: 被适配的类
 * @date: 2020/5/18 18:01
 */
public class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("输入电压为" + src + "V");
        return src;
    }
}
