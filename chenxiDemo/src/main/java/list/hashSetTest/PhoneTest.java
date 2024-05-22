package list.hashSetTest;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 定义一个手机类，包含手机品牌，价格，型号，封装该类的属性，并定义该类的有参构造方法实现对属性的赋值
 * <p>
 * a.创建3个手机类对象。并给各对象数据赋值。
 * <p>
 * b.将3个手机对象依次保存到HashSet中。
 * <p>
 * c.将HashSet中的元素使用迭代器换行输出。
 * <p>
 * d.将价格低于2000元的手机，价格提升500元。
 * <p>
 * e.打印集合中三星手机的个数。
 * ————————————————
 */
public class PhoneTest {
    public static void main(String[] args) {

        HashSet<Phone> hashSet = new HashSet<Phone>();
        hashSet.add(new Phone("苹果", 10000, "Iphone13"));
        hashSet.add(new Phone("华为", 5000, "Mate50"));
        hashSet.add(new Phone("三星", 8000, "S22"));
        hashSet.add(new Phone("三星", 8000, "S20"));
        hashSet.add(new Phone("华为", 6000, "MATE40"));
        hashSet.add(new Phone("三星", 8000, "S20"));
        hashSet.add(new Phone("三星", 8000, "S18"));
        hashSet.add(new Phone("三星", 8000, "S25"));


        //Iterator遍历将HashSet中的元素使用迭代器换行输出
        Iterator<Phone> ite = hashSet.iterator();
        while (ite.hasNext()) {
           System.out.println(ite.next());
        }
        System.out.println();

        //将价格低于2000元的手机，价格提升500元。
        int num = 0;
        Iterator<Phone> ite2 = hashSet.iterator();
        while (ite2.hasNext()) {
            Phone phone = ite2.next();
            if (phone.getPrice() <= 6000) {
                phone.setPrice(phone.getPrice() + 500);
            }
            System.out.println(phone);
            if(phone.getBrand().equals("三星")){
                num++;
            }
    }
        System.out.println();
        System.out.println("三星的个数是："+num);
    }

    public static int Test(HashSet<Phone> hashSet, String s) {
        int num = 0;
        for (Phone s1 : hashSet) {
            if (s.equals(s1.getBrand())) {
                num++;
            }
        }
        return num;

    }
}
