package singleton;

/**
 * Created by zhoum on 2017/2/22.
 */

/**
 * 单列模式:懒汉模式
 */
public class Singleton {
    //声明类的实例并初始化
    private static Singleton instance = new Singleton();

    //构造函数私有化
    private Singleton() {

    }
    //调用该方法获得该类实列
    public static Singleton getInstance() {
        return instance;
    }
}
