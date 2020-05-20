package builder;

/**
 * @author: jianyufeng
 * @description: 客户端 使用建造者模式
 * @date: 2020/5/17 21:24
 */
public class Client {
    public static void main(String[] args) {
        HouseBuilder highHouseBuilder = new HighHouseBuilder();
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();

        HouseDirector houseDirector = new HouseDirector(highHouseBuilder);
        House highHouse = houseDirector.constructHouse();
        System.out.println(highHouse);

        houseDirector.setHouseBuilder(commonHouseBuilder);
        House commonHouse = houseDirector.constructHouse();
        System.out.println(commonHouse);
    }
}
