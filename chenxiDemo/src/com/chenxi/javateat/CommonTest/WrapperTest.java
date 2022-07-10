package com.chenxi.javateat.CommonTest;

import org.junit.Test;

/**
 * 包装类的使用
 */
public class WrapperTest {
    @Test
    public void Wrapper() {
        int num = 4;
        float f = 1;
        Integer In = new Integer(num);
        System.out.println(In);

        Float f1 = new Float(f);
        System.out.println(f1);
    }


}
