package adapter.adapterClass;

/**
 * @author: jianyufeng
 * @description: 使用适配器的对象
 * @date: 2020/5/18 18:08
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        int adapt = iVoltage5V.output5V();
        if (adapt == 5){
            System.out.println("可以充电");
        }else {
            System.out.println("不可以充电");
        }
    }
}
