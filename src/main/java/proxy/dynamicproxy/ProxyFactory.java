package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: jianyufeng
 * @description: 代理对象生成工厂
 * @date: 2020/5/28 23:59
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object object) {
        this.target = object;
    }

    /**
     * ClassLoader loader:指当前目标对象使用的类加载器，获取加载器的方法固定
     * Class<?>[] interfaces:目标对象实现的接口类型，使用泛型方法确定类型
     * InvocationHandler h:事情处理，执行目标对象的方法时，会触发事件处理器，会把当前执行的目标对象方法作为参数传入
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader()
                , target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始");
                        Object result = method.invoke(target, args);
                        System.out.println("JDK代理结束");
                        return result;
                    }
                });
    }
}
