package prototype.deep;

import java.io.IOException;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/15 0:03
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        DeepCloneableTarget deepCloneableTarget = new DeepCloneableTarget("111","222");
        DeepProtoType deepProtoType1 = new DeepProtoType();
        deepProtoType1.deepCloneableTarget = deepCloneableTarget;

        DeepProtoType deepProtoType2 = (DeepProtoType)deepProtoType1.clone();
        System.out.println(deepProtoType2);
        System.out.println(deepProtoType1.deepCloneableTarget == deepProtoType2.deepCloneableTarget);

        DeepProtoType deepProtoType3 = (DeepProtoType)deepProtoType1.deepClone();
        System.out.println(deepProtoType3);
        System.out.println(deepProtoType1.deepCloneableTarget == deepProtoType3.deepCloneableTarget);

    }
}
