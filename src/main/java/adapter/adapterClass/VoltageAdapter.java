package adapter.adapterClass;

/**
 * @author: jianyufeng
 * @description: 适配器类
 * @date: 2020/5/18 18:05
 */
public class VoltageAdapter implements IVoltage5V{
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        int adapt = src/44;
        System.out.println("转换为" + adapt + "V");
        return adapt;
    }
}
