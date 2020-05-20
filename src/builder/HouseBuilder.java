package builder;

/**
 * @author: jianyufeng
 * @description: 抽象的建造者
 * @date: 2020/5/17 21:10
 */
public abstract class HouseBuilder {
    House house = new House();
    //将建造的流程写好，抽象的方法
    public abstract void buildBase();
    public abstract void buildWall();
    public abstract void buildRoof();
    public abstract void setName();

    public House buildHouse(){
        return house;
    }
}
