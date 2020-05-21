package builder;

/**
 * @author: jianyufeng
 * @description: 高楼建造者实现类
 * @date: 2020/5/17 21:16
 */
public class HighHouseBuilder extends HouseBuilder{
    @Override
    public void buildBase() {
        house.setBase("10米地基");
    }

    @Override
    public void buildWall() {
        house.setWall("5米墙");
    }

    @Override
    public void buildRoof() {
        house.setRoof("玻璃屋顶");
    }

    @Override
    public void setName() {
        house.setName("高楼");
    }
}
