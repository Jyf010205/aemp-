package prototype.deep;

import java.io.*;

/**
 * @author: jianyufeng
 * @description:
 * @date: 2020/5/14 23:59
 */
public class DeepProtoType implements Serializable,Cloneable {
    public String name;

    public DeepCloneableTarget deepCloneableTarget;

    public DeepProtoType() {

    }

    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }

    //深拷贝 方法1
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object deep ;
        //这里完成对基本数据类型(属性)和 String 的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    //深拷贝 - 方式 2 通过对象的序列化实现 (推荐)
    //序列化https://blog.csdn.net/tree_ifconfig/article/details/82766587
    public Object deepClone() throws IOException {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        DeepProtoType deepProtoType = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //该类的writeObject(Object obj)方法将将传入的obj对象进行序列化，把得到的字节序列写入到目标输出流中进行输出。
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            //该类的readObject()方法从输入流中读取字节序列，然后将字节序列反序列化为一个对象并返回。
            deepProtoType = (DeepProtoType) ois.readObject();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            bos.close();
            oos.close();
            bis.close();
            ois.close();
        }
        return deepProtoType;
    }
}
