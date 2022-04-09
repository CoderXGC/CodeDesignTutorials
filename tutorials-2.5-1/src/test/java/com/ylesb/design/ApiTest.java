package com.ylesb.design;

import com.ylesb.design.impl.HeroHouYi;
import com.ylesb.design.impl.HeroLianPo;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_ISkill(){
        // 后裔
        HeroHouYi heroHouYi = new HeroHouYi();
        heroHouYi.doArchery();

        // 廉颇
        HeroLianPo heroLianPo = new HeroLianPo();
        heroLianPo.doInvisible();
    }

}
