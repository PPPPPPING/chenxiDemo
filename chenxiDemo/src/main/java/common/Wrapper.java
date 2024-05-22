package common;

/**
 * 包装类的使用
 *
 * @author chenxi
 */
public class Wrapper {
    public static void wrapperDemo() {
        Integer integer = new Integer(4);
        Float aFloat = new Float(2L);
        int n = 4;
        float f = 1L;

        // 基本数据类型转化为包装类
        //手动装箱
        Integer integer1 = new Integer(n);
        Float aFloat1 = new Float(f);
        // 自动装箱
        Integer integer2 = n;
        Float aFloat2 = f;
        System.out.println("手动装箱,integer1:" + integer1 + ";自动装箱,integer2:" + integer2);

        // 包装类转化为基本数据类型
        //手动拆箱
        int n1 = integer.intValue();
        float f1 = aFloat.floatValue();
        // 自动拆箱
        int n2 = integer;
        float f2 = aFloat;
        System.out.println("手动拆箱,n1:" + n1 + ";自动拆箱,n2:" + n2);
    }

    public static void main(String[] args) {
        wrapperDemo();
    }
}
