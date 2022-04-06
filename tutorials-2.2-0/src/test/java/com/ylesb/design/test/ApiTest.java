package com.ylesb.design.test;

import com.ylesb.design.ICalculationArea;
import com.ylesb.design.impl.CalculationAreaExt;
import org.junit.Test;


public class ApiTest {

    @Test
    public void test_CalculationAreaExt(){
        ICalculationArea area = new CalculationAreaExt();
        double circular = area.circular(10);
        System.out.println(circular);
    }

}
