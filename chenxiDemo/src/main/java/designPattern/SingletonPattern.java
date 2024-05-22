package designPattern;

/**
 * @Author ping
 * @Date 2024/1/19 23:07
 * @Description
 */
public class SingletonPattern {
    public static void main(String[] args) {

    }
}

// 单例模式
class Singleton {
    private static Singleton singleton;
    private Singleton(){};

    private static Singleton singleton() {
        return singleton;
    }
}

// 饿汉式
class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton(){};

    private static HungrySingleton singleton() {
        return singleton;
    }
}

// 饿汉式
class LazySingleton {
    private static LazySingleton singleton;
    private LazySingleton(){};

    private static LazySingleton singleton() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
}

// 双重检查锁定
class SafeLazySingleton {
    private static volatile SafeLazySingleton instance;

    private SafeLazySingleton() {}

    public static SafeLazySingleton getInstance() {
        if (instance == null) {
            synchronized (SafeLazySingleton.class) {
                if (instance == null) {
                    instance = new SafeLazySingleton();
                }
            }
        }
        return instance;
    }
}
