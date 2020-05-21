package adapter.adapterClass;

/**
 * @author: jianyufeng
 * @description: 、
 * @date: 2020/5/18 18:11
 */
public class client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
