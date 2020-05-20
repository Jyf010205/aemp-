package builder;

/**
 * @author: jianyufeng
 * @description: 普通楼建造者实现类
 * @date: 2020/5/17 21:18
 */
public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBase() {
        house.setBase("5米地基");
    }

    @Override
    public void buildWall() {
        house.setWall("5米墙");
    }

    @Override
    public void buildRoof() {
        house.setRoof("砖墙屋顶");
    }

    @Override
    public void setName() {
        house.setName("普通楼");
    }
}
