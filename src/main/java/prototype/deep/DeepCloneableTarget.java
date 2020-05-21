package prototype.deep;

import java.io.Serializable;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/14 23:56
 */
public class DeepCloneableTarget implements Serializable,Cloneable {
    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }

    //因为都是基本类型，所以使用浅拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
