package builder;

/**
 * @author: jianyufeng
 * @description: 指挥者，指定制作流程，返回产品
 * @date: 2020/5/17 21:20
 */
public class HouseDirector {
    private HouseBuilder houseBuilder = null;

    //构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    //通过set方法传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    //如何处理建造房子的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildBase();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
        houseBuilder.setName();
        return houseBuilder.buildHouse();
    }
}
